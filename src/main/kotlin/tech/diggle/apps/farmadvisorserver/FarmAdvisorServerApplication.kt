package tech.diggle.apps.farmadvisorserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FarmAdvisorServerApplication

fun main(args: Array<String>) {
    runApplication<FarmAdvisorServerApplication>(*args)
}
