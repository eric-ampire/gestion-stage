package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Carnet
import org.springframework.data.repository.CrudRepository

interface CarnetRepository : CrudRepository<Carnet, Long>