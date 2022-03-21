package com.example.accessingneo4jdatarest

import org.springframework.data.neo4j.core.schema.GeneratedValue
import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node

@Suppress("unused")
@Node
class Person(
    var firstName: String? = null,
    var lastName: String? = null,
    @Id @GeneratedValue
    var id: Long? = null
)