package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import resources.Mocks;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlunoTest{
    private final Mocks mocks = new Mocks();

    @Test
    public void ShouldReturnFalseOnStudentVerification() {
        String RA = "10";
        Aluno aluno = new Aluno(RA);

        Boolean result = aluno.verificaAluno();

        assertEquals(false, result);
        assertEquals(RA, aluno.getNome());
    }

    @Test
    public void ShouldReturnTrueOnStudentVerification() {
        String RA = "11";
        Aluno aluno = new Aluno(RA);

        Boolean result = aluno.verificaAluno();

        assertEquals(true, result);
        assertEquals(RA, aluno.getNome());
    }

    @Test
    public void ShouldReturnFalseOnDebitVerification() {
        String RA = "4";
        Aluno aluno = new Aluno(RA);

        Boolean result = aluno.verificaDebito();

        assertEquals(false, result);
    }

    @Test
    public void ShouldReturnTrueOnDebitVerification() {
        String RA = "20";
        Aluno aluno = new Aluno(RA);

        Boolean result = aluno.verificaDebito();

        assertEquals(true, result);
    }

    @Test
    public void ShouldCallToLoan() {
        String RA = "20";
        Aluno aluno = new Aluno(RA);
        List<Livro> livros = mocks.createBookList(3);

        Boolean result = aluno.emprestar(livros);

        assertEquals(true, result);
    }
}