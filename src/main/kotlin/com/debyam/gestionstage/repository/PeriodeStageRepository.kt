package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.PeriodeStage
import org.springframework.data.repository.CrudRepository

interface PeriodeStageRepository : CrudRepository<PeriodeStage, Long> {
}