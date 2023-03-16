/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo.cadastrarpaciente;

//Cadastrar Sintoma com no mínimo 4 atributos com tipos de dados diferentes e públicos. A Classe também deverá ter um método
//construtor para atribuir os 4 atributos no construtor e pelo menos 1 método para retornar o valor dos atributos;
public class CadastrarSintomas {

    public String sintomasPaciente;
    public int tempoIncomodoPaciente;
    public double peso;
    public char consultaAnterior;

    public CadastrarSintomas(String sintomasn, int tempon, double peson, char consultan) {
        sintomasPaciente = sintomasn;
        tempoIncomodoPaciente = tempon;
        peso = peson;
        consultaAnterior = consultan;
    }
    public String getSintomas() {
        return "Sintomas do Paciente " + sintomasPaciente;
    }

    public String getTempo() {
        return "Quanto tempo os sintomas estão aparecendo(Em dias) " + tempoIncomodoPaciente;
    }

    public String getPeso() {
        return "Qual o peso atual do Paciente " + peso;
    }

    public String getConsulta() {
        return "Já se consultou pelo mesmo problema antes(S para sim e N para não) " + consultaAnterior;
    }
}
