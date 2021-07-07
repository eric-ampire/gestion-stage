package com.debyam.gestionstage.repository

import com.debyam.gestionstage.entity.PageCarnet
import org.springframework.data.repository.CrudRepository

interface PageCarnetRepository : CrudRepository<PageCarnet, Long> {
}