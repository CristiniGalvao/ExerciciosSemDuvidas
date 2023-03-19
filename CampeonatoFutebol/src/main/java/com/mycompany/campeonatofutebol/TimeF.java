/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatofutebol;

/**
 * Criar uma Classe para Time de Futebol com no mínimo 5 atributos 1 dos
 * atributos deverá ser o jogador do time que será referência da classe jogador,
 * ou seja 1 time deverá ter pelo menos 1 jogador; Na classe principal solicitar
 * o Cadastro de 5 jogadores utilizando apenas a o método construtor da classe
 * Jogador;
 */
public class TimeF {

    public String nomeTime;
    public String treinador;
    public int anoCriada;
    public String cidadeTr;
    public int proximoJogo;

    public TimeF(String nomeTim, String treinadorT, int anoCria, String cidadeT, int proximoJ) {
        nomeTime = nomeTim;
        treinador = treinadorT;
        anoCriada = anoCria;
        cidadeTr = cidadeT;
        proximoJogo = proximoJ;
    }

    public String getNometime() {
        return "Nome do Time: " + nomeTime;
    }

    public String getTreinador() {
        return "Treinador do Time: " + treinador;
    }

    public String getAno() {
        return "Ano de criação do time: " + anoCriada;
    }

    public String getCidade() {
        return "Cidade do Treino: " + cidadeTr;
    }

    public int getPromixoJ() {
        return proximoJogo;
    }

    
}
