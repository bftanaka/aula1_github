package entities;

public class _003_Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	double finalGrade;
	public String pass;
	double notaRestante;
	
	public String missing;
	
	
	
	public String aluno() {
		return nome;
	}
	
	public double finalGrade() {
		finalGrade = nota1 + nota2 + nota3;
		return finalGrade;		
	}
	
	 String pass() {
		 if (finalGrade >= 60.00) {
			 pass = "PASS";
		 }
		 else {
			 notaRestante = 60 - finalGrade;
			 pass = "FAILED";
		 }
		 
	return pass;
	 }

	
	 String missing() {
		 if (finalGrade < 60.00) {
		 return  "MISSING " + String.format("%.2f", notaRestante) + " POINT(S)"; 
	 }
		 return "";
	 }
	 
	public String toString () {
		return  "Aluno: " + nome + "\n" + "FINAL GRADE: " + String.format("%.2f%n", finalGrade()) 
				+ pass() + "\n" 
				+ missing(); 
	}

}

