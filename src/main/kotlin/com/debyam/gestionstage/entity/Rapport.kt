package com.debyam.gestionstage.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Rapport(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = null,
    val nom: String,
    val nomProprietaire: String,
    val dateDepot: Date
)
