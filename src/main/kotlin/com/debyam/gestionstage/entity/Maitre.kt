package com.debyam.gestionstage.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Maitre(
    val matriculeMaitre: String,
    val fonction: String
) : Personne()