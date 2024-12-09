package org.example;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    public boolean emprestar(String aluno, int[] prazos, int num) {
        boolean retorno = true;
        Aluno a = new Aluno(aluno);

        if (!a.verificaAluno()) {
            System.out.println("Aluno Inexistente");
            retorno = false;
        }

        if (!a.verificaDebito()) {
            System.out.println("Aluno em Debito");
            retorno = false;
        }

        if(retorno) {
            List<Livro> livros = new ArrayList<Livro>();
	        for(int i=0; i< num;i++) {
                Livro l = new Livro(prazos[i]);
                if (!l.verificaLivro())
                    livros.add(l);
            }

            if (!livros.isEmpty()) {
                retorno = a.emprestar(livros);
                return retorno;
            }
            else
                return false;

        }
        else
            return retorno;
    }

}
