import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private ArrayList<Aluno> estudantes;

    //construtor
    public Turma (String nomeTurma){
        this.nomeTurma = nomeTurma;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        boolean encontrouMatricula = false;
        for(Aluno estudante: estudantes){
            if(aluno.getMatricula().equals(estudante.getMatricula())){
                encontrouMatricula = true;
                System.out.println("Matricula ja cadastrada.");
                return;
            }
        }
        this.estudantes.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado com sucesso!");
        System.out.println();
    }

    public void listarAlunos(){
        for(Aluno estudante: estudantes){
            estudante.exibirInfo();
            System.out.println();
        }
    }

    public Aluno buscarAlunoPorMatricula(String matricula){
        for(Aluno estudante: estudantes){
            if(estudante.getMatricula().equals(matricula)){
                return estudante;
            }
        }
        return null;
    }

    public Aluno removerAluno(String matricula){
        Aluno alunoParaRemover = buscarAlunoPorMatricula(matricula);
        if(alunoParaRemover != null){
            estudantes.remove(alunoParaRemover);
            return alunoParaRemover;
        } else{
            return null;
        }
    }

    public double calcularMediaTurma() {
        double somaDasNotas = 0.0;
        for(Aluno estudante : estudantes) {
            somaDasNotas += estudante.calcularMediaAluno();
        }
        if(estudantes.size() > 0) {
            double mediaDasNotas = somaDasNotas / estudantes.size();
            return mediaDasNotas;
        } else {
            return 0.0;
        }
    }
}
