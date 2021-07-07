package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Affectation
import com.debyam.gestionstage.entity.Carnet
import com.debyam.gestionstage.entity.Coordo
import org.springframework.data.repository.CrudRepository

interface AffectationRepository : CrudRepository<Affectation, Long>

