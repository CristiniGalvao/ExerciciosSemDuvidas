/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroadvogados;

/**
 * Criar uma Classe Advogado com 2 Atributos Públicos e 5 Atributos Privados; A
 * Classe deverá conter um construtor preenchendo os 2 atributos públicos e 1
 * Método para preencher cada atributo privado; A Classe também deverá conter 1
 * método para retornar o valor preenchido de cada atributo privado; Na Classe
 * Principal solicitar o Cadastro de 8 Advogados preenchendo os Atributos
 * Públicos diretamente e caso o atributo público não for preenchido deverá ser
 * validado solicitando para o Atributo ser cadastrado; Solicitar o
 * preenchimento dos outros atributos através do método definido na Classe
 * Advogado; Na Classe Principal retornar os 3 Últimos Advogados Cadastrados; 1
 * Por linha; porém em cada linha concatenar todos os atributos do Advogado;
 */
public class CadastrarAdvogados {

    public String nome;
    public int telefone;
    private String endereco;
    private String cidadeN;
    private int anoFormado;
    private int idade;
    private String nomeFaculdade;

    public CadastrarAdvogados(String nomeA, int telefoneA, String enderecoA, String cidadeA, int anoFormadoA, int idadeA, String nomeFacul) {
        nome = nomeA;
        telefone = telefoneA;
        endereco = enderecoA;
        cidadeN = cidadeA;
        anoFormado = anoFormadoA;
        idade = idadeA;
        nomeFaculdade = nomeFacul;

    }

    public String getNome() {
        return "Nome Advogado: " + nome;
    }

    public String getTelefone() {
        return "telefone : " + telefone;
    }

    public String getEndereco() {
        return "Endereço: " + endereco;
    }

    public String getCidade() {
        return "Cidade onde mora: " + cidadeN;
    }

    public String getAnoForm() {
        return "Ano em que se formou: " + anoFormado;
    }

    public String getIdade() {
        return "Idade: " + idade;
    }

    public String getNomeFacul() {
        return "Nome da faculdade onde se Formou: " + nomeFaculdade;
    }
}
