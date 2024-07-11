package com.rocketseat.trip.partcipants;

import java.util.UUID;

public record ParticpantsData(UUID id, String name, String email, Boolean isConfirmed) {
}
