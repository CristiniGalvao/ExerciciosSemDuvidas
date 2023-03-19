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

    public String fabricante;
    public int aro;
    public String cor;
    private double peso;
    private char cesta;
    private double valor;
    private String cambio;

    public CadastrarBike(String fabricanteB, int aroB, String corB, double pesoB, char cestaB, double valorB, String cambioB) {
        fabricante = fabricanteB;
        aro = aroB;
        cor = corB;
        peso = pesoB;
        cesta = cestaB;
        valor = valorB;
        cambio = cambioB;
    }

    public String getFabricante() {
        return "Fabricante da Bicicleta: " + fabricante;
    }

    public String getAro() {
        return "Aro da Bicicleta: " + aro;
    }

    public String getCor() {
        return "Cor da Bicicleta: " + cor;
    }

    public String getPeso() {
        return "Peso suportado pela Bicicleta: " + peso;
    }

    public String getCesta() {
        return "Tem cesta:(S para sim e N para não) " + cesta;
    }

    public String getValor() {
        return "Valor da Bicicleta: R$" + valor;
    }

    public String getCambio() {
        return "Qual o Cambio: " + cambio;
    }
}
