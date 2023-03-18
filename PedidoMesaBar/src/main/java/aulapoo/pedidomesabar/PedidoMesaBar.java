/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package aulapoo.pedidomesabar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PedidoMesaBar {

    public static void main(String[] args) {
        List<CadastroMesa> pedidos = new ArrayList<CadastroMesa>();

        // Solicitar o cadastro de 5 pedidos
        for (int i = 1; i <= 5; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cadastro de Pedido " + i);
            System.out.println("Numero da mesa:");
            int numeroM = scanner.nextInt();
            System.out.println("Status:");
            String statusPedido = scanner.next();
            System.out.println("Valor:");
            double valorM = scanner.nextDouble();
            System.out.println("Nome do Garçom:");
            String garcomM = "Dean";
            System.out.println("Gorjeta:");
            double gorjetaM = scanner.nextDouble();

            // Criar o objeto Pedido com os dados informados
            CadastroMesa pedido = new CadastroMesa(numeroM, statusPedido, valorM, garcomM, gorjetaM);

            // Adicionar o pedido na lista de pedidos
            pedidos.add(pedido);
        }

        // Calcula o total dos 5 pedidos
        double total = 0;
        for (CadastroMesa pedido : pedidos) {
            total += pedido.valorMesa;
        }

        System.out.println("Total dos Pedidos da Noite: " + total);
    }
}
