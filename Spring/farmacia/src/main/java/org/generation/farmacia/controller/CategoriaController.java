package org.generation.farmacia.controller;

import java.util.List;

import org.generation.farmacia.model.Categoria;
import org.generation.farmacia.repository.CategoriaRepository;
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
@RequestMapping ("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping("/todas")
	public ResponseEntity<List<Categoria>> findAllCategoria () {
		
		List<Categoria> listaCategorias = repository.findAll();
		
		if(listaCategorias.isEmpty()) {
			
			return ResponseEntity.status(204).build();
		} else {
			
			return ResponseEntity.status(200).body(listaCategorias);
		}
	}
	
	@GetMapping("/{idCategoria}")
	public ResponseEntity<Categoria>findByIdCategoria(@PathVariable Long idCategoria) {
		
		return repository.findById(idCategoria)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		
	}
	
	@GetMapping("/descricao")
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
