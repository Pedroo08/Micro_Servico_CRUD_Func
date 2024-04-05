package ifba.servicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos")
public class ServicosController {
	
	 @Autowired
	 private ServicoRepository servicoRepository;
	
	 @GetMapping("/hello")
	    public String Hello(){

	        return "Hello API";
	    }
	 
	

	    @PostMapping
	    public @ResponseBody Servico addNewServico (@RequestBody Servico servico) {
	        return servicoRepository.save(servico);
	    }

	    @GetMapping
	    public @ResponseBody Iterable<Servico> getAllServicos() {
	        return servicoRepository.findAll();
	    }
	    
	    @GetMapping(path="/{nome}")
	    public @ResponseBody Optional<Servico> getServicoByNome(@PathVariable String nome) {
	        return servicoRepository.findByNome(nome);
	    }
	    
	   

	    @DeleteMapping(path="/{id}")
	    public @ResponseBody String deleteServico(@PathVariable Long id) {
	        servicoRepository.deleteById(id);
	        return "Servico deleted";
	    }
}
