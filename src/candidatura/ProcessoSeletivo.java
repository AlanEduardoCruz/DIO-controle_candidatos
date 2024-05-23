package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		
		selecaoCandidatos();

	}

	// criando metodos

	static void selecaoCandidatos() {

		String[] candidatos = { "FELIPE", "JULIA", "PAULA", "ALGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.00;

		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {

			String candidato = candidatos[candidatosAtual];

			double salarioPretendido = valorPretendido();

			System.out.printf("o candidato %s solicitou este valor de salario %.2f%n", candidato, salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;

		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {

		double salarioBase = 2000.00;

		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");

		} else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PTOPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");

		}

	}

}
