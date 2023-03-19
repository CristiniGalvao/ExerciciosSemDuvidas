/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construtorbike;

/**
 * Criar uma Classe Bicicleta com 3 Atributos públicos e 4 Atributos privados;
 * criar 2 métodos para cadastrar os atributos privados; Criar um construtor
 * para atribuir 2 atributos; Na Classes principal Cadastrar no mínimo 4
 * Bicicletas; Na Classe principal Mostrar 4 Mensagens destacando os 7 atributos
 * das 2 primeiras bicicletas cadastradas;
 */
public class CadastrarBike {

    public String marca;
    public String aro;
    public String cor;
    private int ano;
    private char cesta;
    private double valor;
    private String cambio;

    public CadastrarBike(String marcaB, String aroB, String corB, int anoB, char cestaB, double valorB, String cambioB) {
        marca = marcaB;
        aro = aroB;
        cor = corB;
        ano = anoB;
        cesta = cestaB;
        valor = valorB;
        cambio = cambioB;
    }

    public String getMarca() {
        return "Marca da Bicicleta: " + marca;
    }

    public String getAro() {
        return "Aro da Bicicleta: " + aro;
    }

    public String getCor() {
        return "Cor da Bicicleta: " + cor;
    }

    public String getAno() {
        return "Ano da Bicicleta: " + ano;
    }

    public String getCesta() {
        return "Tem cesta: " + cesta;
    }

    public String getValor() {
        return "Valor da Bicicleta: " + valor;
    }

    public String getCambio() {
        return "Qual o Cambio: " + cambio;
    }
}
