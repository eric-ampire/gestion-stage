package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Tache
import org.springframework.data.repository.CrudRepository

interface TacheRepository : CrudRepository<Tache, Long> {
}