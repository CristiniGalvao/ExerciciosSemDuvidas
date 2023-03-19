/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cadastroaluno;

/**
 * Na Classe principal solicitar o cadastro de 3 Alunos utilizando o método
 * construtor e solicitando o preenchimento através dos outros métodos que
 * definem os atributos; Na Classe principal solicitar o cadastro de 2 turmas e
 * cada turma deverá ter no mínimo 1 aluno cadastrado ao escolher o aluno deverá
 * validar se o aluno está cadastrado;
 */
public class ConstrutorAluno {

    public static void main(String[] args) {
        CadastroAluno aluno1 = new CadastroAluno("Dean Winchester", 0024054, 'M', 419, true);
        CadastroAluno aluno2 = new CadastroAluno("Sam Winchester", 0022554, 'M', 419, false);
        CadastroAluno aluno3 = new CadastroAluno("Castiel  Novak", 0033265, 'M', 419, true);

        CadastroTurma turma1 = new CadastroTurma(1, "ADS ", "B", "Jared Padalecki");
        CadastroTurma turma2 = new CadastroTurma(2, "ADS ", "C", "Jensen Ackles");

        System.out.println("-----------------------ALUNOS CADASTRADOS-----------------------");
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getRA());
        System.out.println(aluno1.getGenero());
        System.out.println(aluno1.getMensali());
        System.out.println(aluno1.getMensaliPag());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getRA());
        System.out.println(aluno2.getGenero());
        System.out.println(aluno2.getMensali());
        System.out.println(aluno2.getMensaliPag());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(aluno3.getNome());
        System.out.println(aluno3.getRA());
        System.out.println(aluno3.getGenero());
        System.out.println(aluno3.getMensali());
        System.out.println(aluno3.getMensaliPag());

        System.out.println("-----------------------TURMAS CADASTRADOS-----------------------");
        System.out.println(turma1.getNumeroSala());
        System.out.println(turma1.getCurso());
        System.out.println(turma1.getBloco());
        System.out.println(turma1.getCoordenador());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(turma1.getNumeroSala());
        System.out.println(turma1.getCurso());
        System.out.println(turma1.getBloco());
        System.out.println(turma1.getCoordenador());

        System.out.println("-----------------------TURMA E SEUS ALUNOS-----------------------");
        if (aluno1 != null) {
            System.out.println("Aluno da turma 1: " + aluno1.getNome());
        }
        if (aluno2 != null) {
            System.out.println("Aluno da turma 1: " + aluno2.getNome());
        }
        if (aluno3 != null) {
            System.out.println("Aluno da turma 2: " + aluno3.getNome());

        }
    }
}
