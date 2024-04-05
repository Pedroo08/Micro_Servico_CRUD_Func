package servicodefuncionario.service;

import java.util.List;

import servicodefuncionario.model.Funcionario;

public interface FuncionarioService {
    List<Funcionario> listarFuncionarios();
    Funcionario buscarFuncionarioPorId(String id);
    Funcionario adicionarFuncionario(Funcionario funcionario);
    Funcionario atualizarFuncionario(String id, Funcionario funcionario);
    void deletarFuncionario(String id);
}