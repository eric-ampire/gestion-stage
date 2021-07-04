package com.debyam.gestionstage.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
open class Personne(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = null,
    val nom: String = "",
    val postNom: String = "",
    val prenom: String = "",
    val dateNaissance: Date? = null,
    val genre: String = "",
    val telephone: String = "",
    val email: String = "",
)