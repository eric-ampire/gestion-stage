package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.Admin
import com.debyam.gestionstage.entity.Affectation
import org.springframework.data.repository.CrudRepository


interface AdminRepository : CrudRepository<Admin, Long>
