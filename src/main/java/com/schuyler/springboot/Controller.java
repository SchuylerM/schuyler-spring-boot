package com.schuyler.springboot;

import com.schuyler.springboot.response.Default;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Adding a comment for funzies.
@RestController
public class Controller {
	@GetMapping("/")
	public Default index() {
		return new Default("Some cool soccer facts coming soon.");
	}

	@GetMapping("/bayern")
	public Default bayern() {
		return new Default("Bayern is the only German team to obtain the treble.");
	}

  @GetMapping("/mancity")
  public Default mancity() {
    return new Default("Manchester City is the only men's team to obtain the domestic treble in the EPL.");
  }
}

