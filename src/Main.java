import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var PE_1 = new Pilha();
        var PE_2 = new Pilha();

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 20; i++) {
                System.out.print("| Nome: ");
                String nome = scanner.nextLine();

                System.out.print("| Matrícula: ");
                int matricula = scanner.nextInt();
                scanner.nextLine();

                System.out.print("| Sexo (M/F): ");
                Aluno.Sexo sexo = Aluno.Sexo.getSexo(scanner);

                System.out.println("=====================================");
                scanner.skip("\n");

                Aluno aluno = new Aluno(nome, matricula, sexo);

                if (aluno.getSexo() == Aluno.Sexo.F) {
                    PE_1.push(aluno);
                } else {
                    PE_2.push(aluno);
                }
            }
        }

        System.out.println("| Pilha Feminina:");
        System.out.println("| Está vazia? " + PE_1.isEmpty());

        for (Aluno aluno : PE_1.getAlunos()) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }

        System.out.println("=====================================");

        System.out.println("| Pilha Masculina:");
        System.out.println("| Está cheia? " + PE_2.isFull());

        for (Aluno aluno : PE_2.getAlunos()) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }
    }
}