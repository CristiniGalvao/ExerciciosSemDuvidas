/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aulapoo.pedidomesabar;

/**
 *
 * @author aluno
 */
public class PedidoMesaBar {

    public static void main(String[] args) {

        CadastroMesa mesa1 = new CadastroMesa(1, " 2 Cervejas ", 12.00, " Geraldo", 25.00);
        System.out.println(" Número da Mesa: " + mesa1.getNumM() + " Pedido: " + mesa1.getPedeMesa() + " Valor Mesa: " + mesa1.getValorMe()
                + " Garçom Do Atendimento " + mesa1.GarcomAtend() + " Gorjeta da Mesa " + mesa1.getGorj());
        CadastroMesa mesa2 = new CadastroMesa(1, " 2 Cervejas ", 12.00, " Geraldo", 25.00);
        System.out.println(" Número da Mesa: " + mesa2.getNumM() + " Pedido: " + mesa2.getPedeMesa() + " Valor Mesa: " + mesa2.getValorMe()
                + " Garçom Do Atendimento " + mesa2.GarcomAtend() + " Gorjeta da Mesa " + mesa2.getGorj());
        CadastroMesa mesa3 = new CadastroMesa(1, " 2 Cervejas ", 12.00, " Geraldo", 25.00);
        System.out.println(" Número da Mesa: " + mesa3.getNumM() + " Pedido: " + mesa3.getPedeMesa() + " Valor Mesa: " + mesa3.getValorMe()
                + " Garçom Do Atendimento " + mesa3.GarcomAtend() + " Gorjeta da Mesa " + mesa3.getGorj());
        CadastroMesa mesa4 = new CadastroMesa(1, " 2 Cervejas ", 12.00, " Geraldo", 25.00);
        System.out.println(" Número da Mesa: " + mesa4.getNumM() + " Pedido: " + mesa4.getPedeMesa() + " Valor Mesa: " + mesa4.getValorMe()
                + " Garçom Do Atendimento " + mesa4.GarcomAtend() + " Gorjeta da Mesa " + mesa4.getGorj());
        CadastroMesa mesa5 = new CadastroMesa(1, " 2 Cervejas ", 12.00, " Geraldo", 25.00);
        System.out.println(" Número da Mesa: " + mesa5.getNumM() + " Pedido: " + mesa5.getPedeMesa() + " Valor Mesa: " + mesa5.getValorMe()
                + " Garçom Do Atendimento " + mesa5.GarcomAtend() + " Gorjeta da Mesa " + mesa5.getGorj());
   
    }
}
