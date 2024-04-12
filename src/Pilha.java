public class Pilha {
    private final Aluno[] alunos;
    private int topo;

    public Pilha() {
        alunos = new Aluno[10];
        topo = -1;
    }

    public void push(Aluno aluno) {
        if (isFull()) {
            throw new RuntimeException("| Pilha cheia");
        }
        alunos[++topo] = aluno;
    }

    public Aluno pop() {
        if (isEmpty()) {
            throw new RuntimeException("| Pilha vazia");
        }
        Aluno aluno = alunos[topo];
        alunos[topo] = null;
        topo--;
        return alunos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == alunos.length - 1;
    }

    public Aluno top() {
        return alunos[topo];
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

}
