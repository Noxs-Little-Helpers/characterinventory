package com.noxhelpers.characterinventory.controllers

import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("health")
class EchoController {
    @GetMapping("/")
    fun healthcheck(): ResponseEntity<String> {
        return ResponseEntity<String>(Instant.now().toString(), HttpStatus.OK)
    }
}
