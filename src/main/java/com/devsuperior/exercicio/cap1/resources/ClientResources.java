package com.devsuperior.exercicio.cap1.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.exercicio.cap1.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResources {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Vitor Alves", "100.100.100.10", 2500.0, null, 1));
		list.add(new Client(2L, "Ronaldo Alves", "100.100.100.10", 2500.0, null, 1));
		return ResponseEntity.ok().body(list);
	}
}
