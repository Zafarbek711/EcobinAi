package org.example.ecobin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@EnableJpaAuditing
@SpringBootApplication
class EcobinApplication

fun main(args: Array<String>) {
    runApplication<EcobinApplication>(*args)
}


