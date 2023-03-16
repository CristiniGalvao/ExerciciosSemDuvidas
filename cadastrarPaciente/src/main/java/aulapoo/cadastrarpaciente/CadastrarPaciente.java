/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aulapoo.cadastrarpaciente;

//Cadastrar Paciente com no mínimo 5 atributos com 
//tipos de dados diferentes, privados 1 desses atributos deverá ser referência da Classe Sintomas.
//A Classe também deverá ter um método construtor para atribuir 
//4 atributos principais no construtor e mais 1 método para definir os outros que se referencia ao sintoma do paciente;
public class CadastrarPaciente {

    private String nomePaciente;
    private int idadePaciente;
    private String enderecoPaci;
    private double valorConsulta;
    private char consultaConfirmada;
    private double peso;

    public CadastrarPaciente(String nomen, int idaden, String enderecon, double valor, char consultaConfn, double peson) {
        nomePaciente = nomen;
        idadePaciente = idaden;
        enderecoPaci = enderecon;
        valorConsulta = valor;
        consultaConfirmada = consultaConfn;
        peso = peson;
    }

    public String getNome() {
        return "Nome do Paciente " + nomePaciente;
    }

    public String getIdade() {
        return "Idade do Paciente " + idadePaciente;
    }

    public String getConsulta() {
        return "Valor da Consulta" + valorConsulta;
    }

    public String getEndereco() {
        return " " + enderecoPaci;
    }

    public String getConfirmacaoConsulta() {
        return "Confirmação da Consulta( Consulta confirmada(S) Consulta em espera de Confirmação(E) Consulta Cancelada(C)" + consultaConfirmada;
    }

    public String getPeso() {
        return "Qual o peso atual do Paciente " + peso;
    }
}
