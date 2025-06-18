package com.noxhelpers.characterinventory

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CharacterInventoryApplication {

    fun main(args: Array<String>) {
        runApplication<CharacterInventoryApplication>(*args)
    }
}