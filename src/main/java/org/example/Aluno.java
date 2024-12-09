package org.example;

import java.util.List;

public class Aluno {
    String RA;

    public Aluno(String nome) {
        super();
        this.RA = nome;

    }

    public String getNome() {
        return RA;
    }

    public void setNome(String nome) {
        this.RA = nome;
    }

    public boolean verificaAluno(){
        return !this.RA.equals("10");
    }

    public boolean verificaDebito() {
        Debito debito = new Debito( Integer.parseInt(this.RA));
        return debito.verificaDebito();
    }

    public boolean emprestar(List<Livro> livros) {
        Emprestimo e = new Emprestimo();
        return e.emprestar(livros);
    }
}
