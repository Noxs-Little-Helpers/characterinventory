package com.noxhelpers.characterinventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class CharacterInventoryApplication

fun main(args: Array<String>) {
	runApplication<CharacterInventoryApplication>(*args)
}
