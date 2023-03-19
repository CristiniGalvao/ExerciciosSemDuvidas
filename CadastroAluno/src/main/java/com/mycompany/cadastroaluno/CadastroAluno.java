/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroaluno;

/**
 * Criar uma classe para definir Aluno com no mínimo 5 atributos com tipos de
 * dados diferentes e privados. A Classe também deverá ter um método construtor
 * para atribuir 2 atributos principais no construtor e mais 3 métodos para
 * definir os outros atributos;
 */
public class CadastroAluno {

    private String nome;
    private int RA;
    private char genero;
    private double mensalidade;
    private boolean mensalidadePaga;

    public CadastroAluno(String nomeA, int Ra, char generoA, double mensalidadeA, boolean mensalidadePagaA) {
        nome = nomeA;
        RA = Ra;
        genero = generoA;
        mensalidade = mensalidadeA;
        mensalidadePaga = mensalidadePagaA;

    }

    public String getNome() {
        return "Nome Aluno: " + nome;
    }

    public String getRA() {
        return "Ra Aluno: " + RA;
    }

    public String getGenero() {
        return "Genêro Aluno: " + genero;
    }

    public String getMensali() {
        return "Valor da Mensalidade: " + mensalidade;
    }

    public String getMensaliPag() {
        return "A mensalidade está Paga: " + mensalidadePaga;
    }

}
