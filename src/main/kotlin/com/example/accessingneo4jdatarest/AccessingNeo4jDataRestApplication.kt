package com.example.accessingneo4jdatarest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@EnableTransactionManagement
@EnableNeo4jRepositories
@SpringBootApplication
class AccessingNeo4jDataRestApplication

fun main(args: Array<String>) {
    runApplication<AccessingNeo4jDataRestApplication>(*args)
}
