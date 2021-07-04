package com.debyam.gestionstage.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class DetailTache(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = null,
    val material: String,
    val appreciation: String,
    val date: Date
)
