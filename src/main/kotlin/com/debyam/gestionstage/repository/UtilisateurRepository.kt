package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Utilisateur
import org.springframework.data.repository.CrudRepository

interface UtilisateurRepository : CrudRepository<Utilisateur, Long> {
}