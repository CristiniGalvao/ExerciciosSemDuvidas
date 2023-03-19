/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastroadvogados;

/**
 * Na Classe Principal solicitar o Cadastro de 8 Advogados preenchendo os
 * Atributos Públicos diretamente e caso o atributo público não for preenchido
 * deverá ser validado solicitando para o Atributo ser cadastrado; Solicitar o
 * preenchimento dos outros atributos através do método definido na Classe
 * Advogado; Na Classe Principal retornar os 3 Últimos Advogados Cadastrados; 1
 * Por linha; porém em cada linha concatenar todos os atributos do Advogado;
 */
public class ConstrutorAdvogados {

    public static void main(String[] args) {
        CadastrarAdvogados advogado1 = new CadastrarAdvogados("Dean Winchester", 98193891, "Rua das cores", "Nova Orleans", 2002, 35, "Unipar");
        CadastrarAdvogados advogado2 = new CadastrarAdvogados("Sam Winchester", 98193891, "Rua das cores", "Nova Orleans", 2005, 30, "Unipar");
        CadastrarAdvogados advogado3 = new CadastrarAdvogados("Castiel  Novak", 98193891, "Rua das cores", "Nova Orleans", 2002, 33, "Unipar");
        CadastrarAdvogados advogado4 = new CadastrarAdvogados("Jack Kline Winchester", 98193891, "Rua das cores", "Nova Orleans", 2012, 25, "Unipar");
        CadastrarAdvogados advogado5 = new CadastrarAdvogados("Gabriel Angel", 98193891, "Rua Amarela", "Nova Orleans", 2000, 50, "Unipar");
        CadastrarAdvogados advogado6 = new CadastrarAdvogados("Rowena MacLeod", 98193891, "Rua Laranja", "Nova Orleans", 2005, 45, "Unipar");
        CadastrarAdvogados advogado7 = new CadastrarAdvogados("Charlie Bradbury", 98193891, "Rua Azul", "Nova Orleans", 2012, 29, "Unipar");
        CadastrarAdvogados advogado8 = new CadastrarAdvogados("Bobby Singer", 98193891, "Rua Verde", "Nova Orleans", 1995, 65, "Unipar");
        System.out.println("-----------------------ADVOGADOS CADASTRADOS-----------------------");
        if (advogado1 != null) {
            System.out.println("Advogado cadastrado " + advogado1.getNome());
        }
        if (advogado2 != null) {
            System.out.println("Advogado cadastrado " + advogado2.getNome());
        }
        if (advogado3 != null) {
            System.out.println("Advogado cadastrado " + advogado3.getNome());
        }
        if (advogado4 != null) {
            System.out.println("Advogado cadastrado " + advogado4.getNome());
        }
        if (advogado5 != null) {
            System.out.println("Advogado cadastrado " + advogado5.getNome());
        }
        if (advogado6 != null) {
            System.out.println("Advogado cadastrado " + advogado6.getNome());
        }
        if (advogado7 != null) {
            System.out.println("Advogado cadastrado " + advogado7.getNome());
        }
        if (advogado8 != null) {
            System.out.println("Advogado cadastrado " + advogado8.getNome());
        }

        System.out.println("-----------------------ÚLTIMOS ADVOGADOS CADASTRADOS-----------------------");
        System.out.println(" " + advogado6.getNome() + " " + advogado6.getTelefone() + " " + advogado6.getEndereco() + " " + advogado6.getCidade()
                + " " + advogado6.getAnoForm() + " " + advogado6.getIdade() + " " + advogado6.getNomeFacul());
        
        System.out.println(" " + advogado7.getNome() + " " + advogado7.getTelefone() + " " + advogado7.getEndereco() + " " + advogado7.getCidade()
                + " " + advogado7.getAnoForm() + " " + advogado7.getIdade() + " " + advogado7.getNomeFacul());
        
        System.out.println(" " + advogado8.getNome() + " " + advogado8.getTelefone() + " " + advogado8.getEndereco() + " " + advogado8.getCidade()
                + " " + advogado8.getAnoForm() + " " + advogado8.getIdade() + " " + advogado8.getNomeFacul());
    }
}
