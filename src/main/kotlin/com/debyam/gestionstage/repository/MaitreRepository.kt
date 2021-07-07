package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Maitre
import org.springframework.data.repository.CrudRepository

interface MaitreRepository : CrudRepository<Maitre, Long> {
}