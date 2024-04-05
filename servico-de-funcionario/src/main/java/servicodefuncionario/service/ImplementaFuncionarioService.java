package servicodefuncionario.service;

import servicodefuncionario.model.Funcionario;
import servicodefuncionario.repository.FuncionarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ImplementaFuncionarioService implements FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario buscarFuncionarioPorId(String id) {
        Optional<Funcionario> optionalFuncionario = funcionarioRepository.findById(id);
        return optionalFuncionario.orElse(null);
    }

    @Override
    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Funcionario atualizarFuncionario(String id, Funcionario funcionario) {
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void deletarFuncionario(String id) {
        funcionarioRepository.deleteById(id);
    }
}
