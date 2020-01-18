package org.laughingdev.restservices.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@RestController
@RequestMapping("")
class MainController {

	@GetMapping("/env")
	fun getEnvironment():Mono<Map<String, String>> {
		return System.getenv().toMono()
	}

	@GetMapping("/test")
	fun test():Mono<String> {
		return "blah".toMono()
	}

}