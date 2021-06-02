package org.generation.minhaLojaDeGames.controller;

import java.util.List;

import org.generation.minhaLojaDeGames.model.Categoria;
import org.generation.minhaLojaDeGames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/todas")
	public ResponseEntity<List<Categoria>> findAllCategoria() {
		List<Categoria> listaDeCategorias = repository.findAll();
		if (!listaDeCategorias.isEmpty()) {
			
			return ResponseEntity.status(200).body(listaDeCategorias);
		} else {
			
			return ResponseEntity.status(204).build(); // nao poe o body pq sabemos q esta vazio. Entao nao precisa
		}
	}
	
	
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Categoria> findByIdCategoria(@PathVariable long idCategoria) {
		
		return repository.findById(idCategoria)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricaoCategoria")
	public ResponseEntity<Object> findByDescricaoCategoria(@RequestParam(defaultValue = "") String descricaoCategoria){
		
		List<Categoria> listaDeCategorias = repository.findAllByDescricaoCategoriaContainingIgnoreCase(descricaoCategoria);
		
		if(listaDeCategorias.isEmpty()) {
			
			return ResponseEntity.status(204).build();
		} else {
			
			return ResponseEntity.status(200).body(listaDeCategorias);
		}
	}
	
	@PostMapping
	public ResponseEntity<Categoria> postCategoria (@RequestBody Categoria nomeCategoria) {
		
		return ResponseEntity.status(201).body(repository.save(nomeCategoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> putCategoria (@RequestBody Categoria nomeCategoria) {
		
		return ResponseEntity.status(200).body(repository.save(nomeCategoria));
	}
	
	@DeleteMapping("/{idCategoria}")
	public void delete(@PathVariable long idCategoria) {
		repository.deleteById(idCategoria);
	}
	
	
}
