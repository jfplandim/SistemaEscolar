import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas;

    //construtor
    public Aluno (String nome, double nota, String matricula){
        this.nome = nome;
        this.notas = new ArrayList<>();
        this.matricula = matricula;
        setNota(nota);
    }

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        if(nota < 0 || nota > 10){
            System.out.println("Nota inválida.");
        } else {
            this.notas.add(nota);
        }
    }

    //get
    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getMatricula() {
        return matricula;
    }

    //exibirInfo
    public void exibirInfo(){
        System.out.println("Nome: " +nome);
        System.out.println("Matricula: " +matricula);
        System.out.println("Nota: " +notas);
    }

    public double calcularMediaAluno() {
        double somaDasNotasAluno = 0.0;
        for(Double nota : notas) {
            somaDasNotasAluno += nota;
        }
        if(notas.size() > 0) {
            double mediaDasNotasAluno = somaDasNotasAluno / notas.size();
            return mediaDasNotasAluno;
        } else {
            return 0.0;
        }
    }


}