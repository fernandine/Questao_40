package aplication;

import escola.Aluno;
import escola.Aluno.STATUS;

public class Programa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(10, 25, 40);
		double mediaAlunoFinal = aluno.calcularMedia();

		if (mediaAlunoFinal >= 40) {
			aluno.setResultadoFinal(STATUS.APROVADO);
		} else {
			aluno.setResultadoFinal(STATUS.REPROVADO);
		}

		System.out.println(
				"A média deste aluno é " + Math.round(mediaAlunoFinal) + " - Resultado: " + aluno.getResultadoFinal());
	}

}
