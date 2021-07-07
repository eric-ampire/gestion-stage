package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Personne
import org.springframework.data.repository.CrudRepository

interface PersonneRepository : CrudRepository<Personne, Long> {
}