package escola;

public class Aluno {

	private double nota1;
	private double nota2;
	private double nota3;
	private STATUS resultadoFinal;

	public Aluno() {
	}

	public Aluno(double nota1, double nota2, double nota3) {

		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public enum STATUS {
		APROVADO, REPROVADO
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public STATUS getResultadoFinal() {
		return resultadoFinal;
	}

	public void setResultadoFinal(STATUS resultadoFinal) {
		this.resultadoFinal = resultadoFinal;
	}

	public double calcularMedia() {
		double media = nota1 + nota2 + nota3 / 3;
		return media;
	}

}
