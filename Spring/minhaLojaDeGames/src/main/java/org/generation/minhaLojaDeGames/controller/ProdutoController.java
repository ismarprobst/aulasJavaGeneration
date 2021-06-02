package org.generation.minhaLojaDeGames.controller;

import java.util.List;


import org.generation.minhaLojaDeGames.model.Produto;
import org.generation.minhaLojaDeGames.repository.ProdutoRepository;
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
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/todos")
	public ResponseEntity<List<Produto>> findAllProduto(){
		List<Produto> listaDeProdutos = repository.findAll();
		if (listaDeProdutos.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(listaDeProdutos);
		}
	}
	
	@GetMapping("/{idProduto}")
	public ResponseEntity<Produto> findByIdProduto(@PathVariable long idProduto) {
		
		return repository.findById(idProduto)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricaoProduto")
	public ResponseEntity<Object> findByDescricaoProduto(@RequestParam(defaultValue = "") String descricaoProduto){
		
		List<Produto> listaDeProdutos = repository.findAllByDescricaoProdutoContainingIgnoreCase(descricaoProduto);
		
		if(listaDeProdutos.isEmpty()) {
			
			return ResponseEntity.status(204).build();
		} else {
			
			return ResponseEntity.status(200).body(listaDeProdutos);
		}
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto (@RequestBody Produto nomeProduto){
		return ResponseEntity.status(201).body(repository.save(nomeProduto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putProduto(@RequestBody Produto nomeProduto){
		return ResponseEntity.status(200).body(repository.save(nomeProduto));
	}
	
	@DeleteMapping("/{idProduto}")
	public void deleteProduto(@PathVariable long idProduto) {
		repository.deleteById(idProduto);
	}
	
	
}
