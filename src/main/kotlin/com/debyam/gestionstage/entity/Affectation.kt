package com.debyam.gestionstage.entity

import java.util.*

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Affectation(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = null,
    val dateAffect: Date,
    val heureDebut: Date,
    val heureFin: Date
)
