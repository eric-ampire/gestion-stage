package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Rapport
import org.springframework.data.repository.CrudRepository

interface RapportRepository : CrudRepository<Rapport, Long> {
}