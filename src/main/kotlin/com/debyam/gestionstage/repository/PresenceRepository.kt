package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Presence
import org.springframework.data.repository.CrudRepository

interface PresenceRepository : CrudRepository<Presence, Long> {
}