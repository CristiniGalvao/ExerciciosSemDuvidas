/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo.cadastrarpaciente;

/**
 *
 * @author aluno
 */
public class construtorPaciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadastrarPaciente paciente1 = new CadastrarPaciente(" Gloria ", 52, "rua amarela", 30.00, 'S', 56.22);
        System.out.println(paciente1.getNome());
        System.out.println(paciente1.getIdade());
        System.out.println(paciente1.getConsulta());
        System.out.println(paciente1.getEndereco());
        System.out.println(paciente1.getConfirmacaoConsulta());
        System.out.println(paciente1.getPeso());
        CadastrarSintomas pacienteA1 = new CadastrarSintomas(" Dor Abdominal", 5, 56.22, 'S');
        System.out.println(pacienteA1.getSintomas());
        System.out.println(pacienteA1.getTempo());
        System.out.println(pacienteA1.getPeso());
        System.out.println(pacienteA1.getConsulta());

        CadastrarPaciente paciente2 = new CadastrarPaciente(" Maria ", 12, "rua pombas", 80.00, 'S', 40.22);
        System.out.println(paciente2.getNome());
        System.out.println(paciente2.getIdade());
        System.out.println(paciente2.getConsulta());
        System.out.println(paciente2.getEndereco());
        System.out.println(paciente2.getConfirmacaoConsulta());
        System.out.println(paciente2.getPeso());
        CadastrarSintomas pacienteA2 = new CadastrarSintomas(" Dor de cabeça", 1, 40.22, 'N');
        System.out.println(pacienteA2.getSintomas());
        System.out.println(pacienteA2.getTempo());
        System.out.println(pacienteA2.getPeso());
        System.out.println(pacienteA2.getConsulta());

        CadastrarPaciente paciente3 = new CadastrarPaciente(" Jurema ", 62, "rua das Cores", 100.00, 'C', 80.66);
        System.out.println(paciente3.getNome());
        System.out.println(paciente3.getIdade());
        System.out.println(paciente3.getConsulta());
        System.out.println(paciente3.getEndereco());
        System.out.println(paciente3.getConfirmacaoConsulta());
        System.out.println(paciente3.getPeso());
        CadastrarSintomas pacienteA3 = new CadastrarSintomas(" Dor no Braço", 3, 80.66, 'N');
        System.out.println(pacienteA3.getSintomas());
        System.out.println(pacienteA3.getTempo());
        System.out.println(pacienteA3.getPeso());
        System.out.println(pacienteA3.getConsulta());

        CadastrarPaciente paciente4 = new CadastrarPaciente(" Felipe ", 36, "rua Laranja", 50.00, 'S', 62.33);
        System.out.println(paciente4.getNome());
        System.out.println(paciente4.getIdade());
        System.out.println(paciente4.getConsulta());
        System.out.println(paciente4.getEndereco());
        System.out.println(paciente4.getConfirmacaoConsulta());
        System.out.println(paciente4.getPeso());
        CadastrarSintomas pacienteA4 = new CadastrarSintomas(" Dor Abdominal", 3, 62.33, 'S');
        System.out.println(pacienteA4.getSintomas());
        System.out.println(pacienteA4.getTempo());
        System.out.println(pacienteA4.getPeso());
        System.out.println(pacienteA4.getConsulta());

        CadastrarPaciente paciente5 = new CadastrarPaciente(" José ", 52, "rua Vermelha", 30.00, 'S', 88.22);
        System.out.println(paciente5.getNome());
        System.out.println(paciente5.getIdade());
        System.out.println(paciente5.getConsulta());
        System.out.println(paciente5.getEndereco());
        System.out.println(paciente5.getConfirmacaoConsulta());
        System.out.println(paciente5.getPeso());
        CadastrarSintomas pacienteA5 = new CadastrarSintomas(" Dor de Cabeça", 4, 88.22, 'S');
        System.out.println(pacienteA5.getSintomas());
        System.out.println(pacienteA5.getTempo());
        System.out.println(pacienteA5.getPeso());
        System.out.println(pacienteA5.getConsulta());

        CadastrarPaciente paciente6 = new CadastrarPaciente(" Dolores ", 18, "rua Azul", 55.00, 'S', 62.22);
        System.out.println(paciente6.getNome());
        System.out.println(paciente6.getIdade());
        System.out.println(paciente6.getConsulta());
        System.out.println(paciente6.getEndereco());
        System.out.println(paciente6.getConfirmacaoConsulta());
        System.out.println(paciente6.getPeso());
        CadastrarSintomas pacienteA6 = new CadastrarSintomas(" Desconforto nos olhos", 10, 62.22, 'N');
        System.out.println(pacienteA6.getSintomas());
        System.out.println(pacienteA6.getTempo());
        System.out.println(pacienteA6.getPeso());
        System.out.println(pacienteA6.getConsulta());
    }

}
