import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private int matricula;
    public enum Sexo {
        M,
        F;

        public static Sexo getSexo(Scanner sexo) {
            return Arrays.stream(Sexo.values())
                .filter(s -> s.name().equals(sexo.next()))
                .findFirst()
                .orElse(null);
        }
    }
    private Aluno.Sexo sexo;

    public Aluno(String nome, int matricula, Sexo sexo) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String toString() {
        return "| Nome: " + nome + ", Matrícula: " + matricula + ", Sexo: " + sexo;
    }
}
