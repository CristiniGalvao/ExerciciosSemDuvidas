/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.campeonatofutebol;

/**
 * Na classe principal solicitar o Cadastro de 2 times utilizando apenas o
 * método construtor da classe Time e ao selecionar o jogador deverá ser
 * validado se o jogador está cadastrado; Retornar uma mensagem do conforme
 * exemplo a seguir: "Jogo de hoje é Time1 vs Time2" Destacando os dados dos
 * dois times Cadatrados;
 */
public class ConstrutorFutebol {

    public static void main(String[] args) {

        JogadorF jogador1 = new JogadorF("Dean Winchester", 10, "Centroavante", "norte-americano", " Lawrence, Kansas");
        JogadorF jogador2 = new JogadorF("Sam Winchester", 9, "Lateral", "norte-americano", " Lawrence, Kansas");
        JogadorF jogador3 = new JogadorF("Castiel  Novak", 8, "Ponta", "norte-americano", " Boston, Massachusetts");
        JogadorF jogador4 = new JogadorF("Jack Kline Winchester", 7, "Centroavante", "Canadence", " Vancouver,Canadá");
        JogadorF jogador5 = new JogadorF("Gabriel Angel", 6, "Goleiro", "norte-americano", " Nashville, Tennessee");

        TimeF time1 = new TimeF("Hunters ", "Jensen Ackles ", 2005, "Vancouver, British Columbia", 1);
        TimeF time2 = new TimeF("Angels&Nephilim ", "Jared Padalecki ", 2006, "Vancouver, British Columbia", 1);

        System.out.println("-----------------------JOGADORES CADASTRADOS-----------------------");
        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getNumeroJoga());
        System.out.println(jogador1.getPosicao());
        System.out.println(jogador1.getNacionalidade());
        System.out.println(jogador1.getCidadeNas());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(jogador2.getNome());
        System.out.println(jogador2.getNumeroJoga());
        System.out.println(jogador2.getPosicao());
        System.out.println(jogador2.getNacionalidade());
        System.out.println(jogador2.getCidadeNas());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(jogador3.getNome());
        System.out.println(jogador3.getNumeroJoga());
        System.out.println(jogador3.getPosicao());
        System.out.println(jogador3.getNacionalidade());
        System.out.println(jogador3.getCidadeNas());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(jogador4.getNome());
        System.out.println(jogador4.getNumeroJoga());
        System.out.println(jogador4.getPosicao());
        System.out.println(jogador4.getNacionalidade());
        System.out.println(jogador4.getCidadeNas());

        System.out.println("--------------------------------------------------------------------");
        System.out.println(jogador5.getNome());
        System.out.println(jogador5.getNumeroJoga());
        System.out.println(jogador5.getPosicao());
        System.out.println(jogador5.getNacionalidade());
        System.out.println(jogador5.getCidadeNas());

        System.out.println("-----------------------TIMES CADASTRADOS-----------------------");
        System.out.println(time1.getNometime());
        System.out.println(time1.getTreinador());
        System.out.println(time1.getAno());
        System.out.println(time1.getCidade());
        System.out.println(time1.getPromixoJ());
        System.out.println("--------------------------------------------------------------------");
        System.out.println(time2.getNometime());
        System.out.println(time2.getTreinador());
        System.out.println(time2.getAno());
        System.out.println(time2.getCidade());
        System.out.println(time2.getPromixoJ());

        System.out.println("-----------------------JOGADORES E SEUS TIMES-----------------------");
        if (jogador1 != null) {
            System.out.println("Jogador do time 1: " + jogador1.getNome());
        }
        if (jogador2 != null) {
            System.out.println("Jogador do time 1: " + jogador2.getNome());
        }
        if (jogador3 != null) {
            System.out.println("Jogador do time 2: " + jogador3.getNome());
        }
        if (jogador4 != null) {
            System.out.println("Jogador do time 2: " + jogador4.getNome());
        }
        if (jogador5 != null) {
            System.out.println("Jogador do time 2: " + jogador5.getNome());
        }
        System.out.println("-----------------------PROXIMO JOGO-----------------------");

        if(time1!=null || time2!=null){
            
        System.out.println("Jogo de hoje é Time1 vs Time2");
        
        }
    }
}
