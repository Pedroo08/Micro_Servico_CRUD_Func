package servicodefuncionario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import servicodefuncionario.model.Funcionario;

public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {
    // Falta adicionar alguns métodos caso seja necessário
}
