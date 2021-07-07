package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Evaluation
import org.springframework.data.repository.CrudRepository

interface EvaluationRepository : CrudRepository<Evaluation, Long> {
}