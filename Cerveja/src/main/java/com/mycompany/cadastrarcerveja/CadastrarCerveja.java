/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrarcerveja;

/**
 *
 * @author Usuario
 */
public class CadastrarCerveja {

    public String nome;
    public double teorAlcoolico;
    public double valor;
    public String importada;
    private String puroMalte;
    private int codigo;

    public CadastrarCerveja(String nomeC, double teorAlcool, double valorC, String importa, String puroMalt,
            int codigoCerv) {
        nome = nomeC;
        teorAlcoolico = teorAlcool;
        valor = valorC;
        importada = importa;
        puroMalte = puroMalt;
        codigo = codigoCerv;
    }

    public String getNome() {
        return "Nome da Cerveja: " + nome;
    }

    public String getTeor() {
        return "TeorAlcoolico: " + teorAlcoolico;
    }

    public String getValor() {
        return "Valor da Cerveja: " + valor;
    }

    public String getImportada() {
        return "É uma Cerveja importada: " + importada;
    }

    public String getPuroMalt() {
        return "A Cerveja é puro Malte" + puroMalte;
    }

    public String getCodigo() {
        return "Codigo da Cerveja: " + codigo;
    }
}
