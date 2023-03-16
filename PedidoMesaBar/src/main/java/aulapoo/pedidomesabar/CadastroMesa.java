/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo.pedidomesabar;

//Criar uma Classe para Cadastrar Pedido, com 5 atributos; Desses 5 atributos pelo menos 1 deverá ser Valor; 
//A Classe deverá conter métodos para definir cada 1 dos 5 atributos;
public class CadastroMesa {

    public int numeroMesa;
    public String pedidoMesa;
    public double valorMesa;
    public String garcom;
    public double gorjeta;

    public CadastroMesa(int numeroM, String pedidoM, double valorM, String garcomM, double gorjetaM) {
        numeroMesa = numeroM;
        pedidoMesa = pedidoM;
        valorMesa = valorM;
        garcom = garcomM;
        gorjeta = gorjetaM;
    }

    public String getNumM() {
        return "Numero da Mesa: " + numeroMesa;
    }
    public String getPedeMesa() {
        return "Pedido da Mesa: " + pedidoMesa;
    }
    public String getValorMe() {
        return "Conta da Mesa: " + valorMesa;
    }
    public String GarcomAtend() {
        return "Garçom que atendeu a mesa: " + garcom;
    }
    
    public String getGorj() {
        return "Gorjeta Oferecida: " + gorjeta;
    }
}
