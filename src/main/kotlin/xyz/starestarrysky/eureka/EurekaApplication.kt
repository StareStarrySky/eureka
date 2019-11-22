package xyz.starestarrysky.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@SpringBootApplication
@EnableEurekaServer
@EnableConfigServer
@EnableHystrix
class EurekaApplication

fun main(args: Array<String>) {
    runApplication<EurekaApplication>(*args)
}
