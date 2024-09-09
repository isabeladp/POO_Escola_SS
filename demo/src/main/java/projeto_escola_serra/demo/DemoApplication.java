package projeto_escola_serra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Professor professor = new Professor("Mateus", "12345678910", "Ciências");

		Disciplina cienciDisciplina = new Disciplina("Ciências", professor);

		Aluno aluno1 = new Aluno("Isabela Dias", "15582754963", "0001");
		Aluno aluno2 = new Aluno("Carlos Eduardo", "07555384792", "0002");

		cienciDisciplina.adicionarAluno(aluno1);
        cienciDisciplina.adicionarAluno(aluno2);

		Nota nota1 = new Nota(cienciDisciplina, 9.5);
        Nota nota2 = new Nota(cienciDisciplina, 8.0);

		aluno1.adicionarNota(nota1);
        aluno2.adicionarNota(nota2);

		System.out.println("Disciplina: " + cienciDisciplina.getNome());
        System.out.println("Professor: " + cienciDisciplina.getProfessor().getNome());

		List<Aluno> alunos = cienciDisciplina.getAlunos();
        
		for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            
			List<Nota> notas = aluno.getNotas();
            for (Nota nota : notas) {
                System.out.println("Nota na disciplina " + nota.getDisciplina().getNome() + ": " + nota.getValor());
     }
	}

	}}
