/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 * Criar uma classe para definir Jogador com no mínimo 5 atributos privados e no
 * mínimo 3 métodos e além dos 3 um método construtor para Cadastrar os 5
 * atributos que não podem ficar acessível fora da classe;
 */
public class JogadorF {

    private String nome;
    private int numeroJog;
    private String posicaoJogada;
    private String nacionalidade;
    private String cidadeNasci;

    public JogadorF(String nomeJ, int numeroJ, String posicaoJ, String nacionalidadeJ, String cidadeN) {
        nome = nomeJ;
        numeroJog = numeroJ;
        posicaoJogada = posicaoJ;
        nacionalidade = nacionalidadeJ;
        cidadeNasci = cidadeN;

    }

    public String getNome() {
        return "Nome do Jogador: " + nome;
    }

    public String getNumeroJoga() {
        return "Numero do jogador: " + numeroJog;
    }

    public String getPosicao() {
        return "Posição do jogador: " + posicaoJogada;
    }

    public String getNacionalidade() {
        return "Nacionalidade do jogador: " + nacionalidade;
    }

    public String getCidadeNas() {
        return "Cidade de nascimento do Jogador: " + cidadeNasci;
    }

}
