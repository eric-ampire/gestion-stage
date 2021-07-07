package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Etudiant
import org.springframework.data.repository.CrudRepository

interface EtudiantRepository : CrudRepository<Etudiant, Long> {
}