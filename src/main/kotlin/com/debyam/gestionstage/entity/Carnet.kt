package com.debyam.gestionstage.entity

import javax.persistence.*

@Entity
data class Carnet(
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = null,
    val numeroCarnet: Int,
    @OneToMany val pages: List<PageCarnet>
)
