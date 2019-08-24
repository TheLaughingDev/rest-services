package org.laughingdev.restservices.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

@RestController
@RequestMapping("/test")
class Test {

	@GetMapping("")
	fun test():Mono<String> {
		return "blah".toMono()
	}

}