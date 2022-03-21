package com.example.accessingneo4jdatarest

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.*
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@Suppress("unused")
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
interface PersonRepository: PagingAndSortingRepository<Person, Long> {

    fun findByLastName(@Param("name") name: String): List<Person>
}