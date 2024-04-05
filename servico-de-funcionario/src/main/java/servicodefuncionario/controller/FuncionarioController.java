package servicodefuncionario.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import servicodefuncionario.model.Funcionario;
import servicodefuncionario.repository.FuncionarioRepository;

import java.util.List;

	@RestController
	@RequestMapping("/funcionarios")
	public class FuncionarioController {

	    @Autowired
	    private FuncionarioRepository funcionarioRepository;

	    
	    @GetMapping("/hello")
	    public String Hello() {
	        return "Hello APi";
	    }
	    
	    // Endpoint para listar todos os funcionários
	    @GetMapping()
	    public List<Funcionario> listarFuncionarios() {
	        return funcionarioRepository.findAll();
	    }

	    // Endpoint para buscar um funcionário por ID
	   @GetMapping("/{id}")
	    public Funcionario buscarFuncionarioPorId(@PathVariable String id) {
	        return funcionarioRepository.findById(id).orElse(null);
	    }

	    // Endpoint para adicionar um novo funcionário
	    @PostMapping
	    public Funcionario adicionarFuncionario(@RequestBody Funcionario funcionario) {
	        return funcionarioRepository.insert(funcionario);
	    }

	    // Endpoint para atualizar um funcionário existente
	    @PutMapping("/{id}")
	    public Funcionario atualizarFuncionario(@PathVariable String id, @RequestBody Funcionario funcionario) {
	        funcionario.setId(id);
	        return funcionarioRepository.save(funcionario);
	    }

	    // Endpoint para deletar um funcionário existente
	    @DeleteMapping("/{id}")
	    public void deletarFuncionario(@PathVariable String id) {
	        funcionarioRepository.deleteById(id);
	    }
	}


