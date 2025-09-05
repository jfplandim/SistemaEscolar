import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Turma turmaBorg = new Turma("Turma Borg");

        int opcao;

        do{
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Buscar aluno por matrícula");
            System.out.println("4. Remover aluno");
            System.out.println("5. Calcular média da turma");
            System.out.println("6. Sair");

            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeEnt= leitor.nextLine();
                    System.out.print("Digite a matricula do aluno: ");
                    String matriculaEnt = leitor.nextLine();
                    System.out.print("Digite a nota do aluno: ");
                    double notaEnt = leitor.nextDouble();
                    leitor.nextLine();

                    Aluno aluno1 = new Aluno(nomeEnt, notaEnt, matriculaEnt);
                    turmaBorg.adicionarAluno(aluno1);
                    break;

                case 2:
                    turmaBorg.listarAlunos();
                    break;

                case 3:
                    System.out.print("Digite a matricula procurada: ");
                    String matriculaBusca = leitor.nextLine();
                    Aluno alunoEncontrado = turmaBorg.buscarAlunoPorMatricula(matriculaBusca);
                    if(alunoEncontrado != null){
                        alunoEncontrado.exibirInfo();
                        System.out.println();
                    } else {
                        System.out.println("Aluno não encontrado.");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.print("Digite a matricula para remoção: ");
                    String matriculaRemocao = leitor.nextLine();
                    Aluno alunoRemovido = turmaBorg.removerAluno(matriculaRemocao);
                    if(alunoRemovido != null){
                        System.out.println("Aluno removido: ");
                        alunoRemovido.exibirInfo();
                        System.out.println();
                    } else {
                        System.out.println("Aluno não encontrado.");
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("A media das notas é: " +turmaBorg.calcularMediaTurma());
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
            }

        } while(opcao != 6);
        leitor.close();
    }
}