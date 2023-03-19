/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroaluno;

/**
 *Criar uma classe para definir Turma com no mínimo 4 atributos e 1 desses atributos deverá ser referência da classe aluno;
 */
public class CadastroTurma {
    public int numSala;
    public String curso;
    public String bloco;
    public String coordenador;
    
        public CadastroTurma(int numSal, String cursoT, String blocoT, String prof) {
        numSala = numSal;
        curso = cursoT;
        bloco = blocoT;
        coordenador = prof;

    }

    public String getNumeroSala() {
        return "Número da Sala: " + numSala;
    }

    public String getCurso() {
        return "Curso: " + curso;
    }

    public String getBloco() {
        return "Bloco da turma: " + bloco;
    }

    public String getCoordenador() {
        return "Coordenador: " + coordenador;
    }

}
