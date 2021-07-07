package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Entreprise
import org.springframework.data.repository.CrudRepository

interface EntrepriseRepository : CrudRepository<Entreprise, Long> {
}