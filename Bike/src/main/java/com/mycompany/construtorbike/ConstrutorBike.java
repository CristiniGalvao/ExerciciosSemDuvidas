/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.construtorbike;

/**
 *
 * @author Usuario
 */
public class ConstrutorBike {

    public static void main(String[] args) {

        CadastrarBike bike1 = new CadastrarBike("Track Bikes ", 29, "Preto ", 100, 'N', 1.960, " Shimano EZ Fire - Borboleta");
        CadastrarBike bike2 = new CadastrarBike("ALFAMEQ ", 29, "Preto & Vermelho ", 100, 'N', 999, " Eze Fire Importada");
        CadastrarBike bike3 = new CadastrarBike("STATUS BIKE ", 26, "Preto & Rosa ", 60, 'S', 464, " Eze Fire");
        CadastrarBike bike4 = new CadastrarBike("STATUS BIKE ", 26, "Creme & Marrom ", 95, 'S', 785, " Eze Fire");
        System.out.println("-----------------------BICICLETAS CADASTRADAS-----------------------");

        System.out.println(bike1.getFabricante());
        System.out.println(bike1.getAro());
        System.out.println(bike1.getCor());
        System.out.println(bike1.getPeso());
        System.out.println(bike1.getCesta());
        System.out.println(bike1.getValor());
        System.out.println(bike1.getCambio());

        System.out.println("--------------------------------------------------------------------");

        System.out.println(bike2.getFabricante());
        System.out.println(bike2.getAro());
        System.out.println(bike2.getCor());
        System.out.println(bike2.getPeso());
        System.out.println(bike2.getCesta());
        System.out.println(bike2.getValor());
        System.out.println(bike2.getCambio());

        System.out.println("--------------------------------------------------------------------");

        System.out.println(bike3.getFabricante());
        System.out.println(bike3.getAro());
        System.out.println(bike3.getCor());
        System.out.println(bike3.getPeso());
        System.out.println(bike3.getCesta());
        System.out.println(bike3.getValor());
        System.out.println(bike3.getCambio());

        System.out.println("--------------------------------------------------------------------");

        System.out.println(bike4.getFabricante());
        System.out.println(bike4.getAro());
        System.out.println(bike4.getCor());
        System.out.println(bike4.getPeso());
        System.out.println(bike4.getCesta());
        System.out.println(bike4.getValor());
        System.out.println(bike4.getCambio());

        System.out.println("--------------------------------------------------------------------");
    }
}
