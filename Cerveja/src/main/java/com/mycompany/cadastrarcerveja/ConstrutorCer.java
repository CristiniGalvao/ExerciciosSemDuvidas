/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastrarcerveja;

/**
 * Criar uma Classe Cerveja com 4 Atributos Públicos e 2 Atributos Privados; A
 * Classe deverá conter um construtor preenchendo 1 atributo privado e o outro
 * atributo privado deverá ser chamado de Código e esse deverá ser incremental;
 * Deverá conter 1 Método para preencher cada atributo público; A Classe também
 * deverá conter 1 método para retornar o valor do atributo Código; Na Classe
 * Principal solicitar o Cadastro de 5 Cervejas preenchendo todos atributos; Na
 * Classe Principal retornar todas as Cervejas cadastradas;
 */
public class ConstrutorCer {

    public static void main(String[] args) {

        CadastrarCerveja cerveja1 = new CadastrarCerveja("Heineken", 5, 6.70, "N", "S", 1545);
        CadastrarCerveja cerveja2 = new CadastrarCerveja("Budweiser", 5, 6.25, "N", "N", 2256);
        CadastrarCerveja cerveja3 = new CadastrarCerveja("Spaten", 5.2, 5.99, "S", "S", 5645);
        CadastrarCerveja cerveja4 = new CadastrarCerveja("Amstel", 4, 4.13, "S", "S", 4012);
        CadastrarCerveja cerveja5 = new CadastrarCerveja("Corona", 4.5, 5.00, "S", "N", 5562);

        System.out.println("-----------------------CERVEJAS CADASTRADAS-----------------------");
        System.out.println(cerveja1.getNome());
        System.out.println(cerveja1.getTeor());
        System.out.println(cerveja1.getValor());
        System.out.println(cerveja1.getImportada());
        System.out.println(cerveja1.getPuroMalt());
        System.out.println(cerveja1.getCodigo());

        System.out.println("----------------------------------------------------------------");
        System.out.println(cerveja2.getNome());
        System.out.println(cerveja2.getTeor());
        System.out.println(cerveja2.getValor());
        System.out.println(cerveja2.getImportada());
        System.out.println(cerveja2.getPuroMalt());
        System.out.println(cerveja2.getCodigo());

        System.out.println("----------------------------------------------------------------");

        System.out.println(cerveja3.getNome());
        System.out.println(cerveja3.getTeor());
        System.out.println(cerveja3.getValor());
        System.out.println(cerveja3.getImportada());
        System.out.println(cerveja3.getPuroMalt());
        System.out.println(cerveja3.getCodigo());

        System.out.println("----------------------------------------------------------------");

        System.out.println(cerveja4.getNome());
        System.out.println(cerveja4.getTeor());
        System.out.println(cerveja4.getValor());
        System.out.println(cerveja4.getImportada());
        System.out.println(cerveja4.getPuroMalt());
        System.out.println(cerveja4.getCodigo());

        System.out.println("----------------------------------------------------------------");

        System.out.println(cerveja5.getNome());
        System.out.println(cerveja5.getTeor());
        System.out.println(cerveja5.getValor());
        System.out.println(cerveja5.getImportada());
        System.out.println(cerveja5.getPuroMalt());
        System.out.println(cerveja5.getCodigo());


    }
}
