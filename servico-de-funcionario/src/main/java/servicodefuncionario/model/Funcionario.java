package servicodefuncionario.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "funcionarios")
public class Funcionario {

    @Id
    private String id;
    private String cpf;
    private String nome;
    private String cargo;
    private String endereco;
    private String celular;
    private String tipo;


    /*
    public Funcionario() {
        this.id = UUID.randomUUID().toString(); // Gerador de UUID automático
    }*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}
