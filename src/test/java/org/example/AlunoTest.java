package org.example;

import junit.framework.TestCase;
import org.junit.Test;
import resources.Mocks;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlunoTest{
    private final Mocks mocks = new Mocks();

    private static final String VALID_RA = "11";
    private static final String INVALID_RA = "10";
    private static final String INVALID_CREDIT_RA = "4";

    @Test
    public void ShouldReturnFalseOnStudentVerification() {
        Aluno aluno = mocks.createStudent(INVALID_RA);

        Boolean result = aluno.verificaAluno();

        assertEquals(false, result);
    }

    @Test
    public void ShouldReturnTrueOnStudentVerification() {
        Aluno aluno = mocks.createStudent(VALID_RA);

        Boolean result = aluno.verificaAluno();

        assertEquals(true, result);
    }

    @Test
    public void ShouldReturnFalseOnDebitVerification() {
        Aluno aluno = mocks.createStudent(INVALID_CREDIT_RA);

        Boolean result = aluno.verificaDebito();

        assertEquals(false, result);
    }

    @Test
    public void ShouldReturnTrueOnDebitVerification() {
        Aluno aluno = mocks.createStudent(VALID_RA);

        Boolean result = aluno.verificaDebito();

        assertEquals(true, result);
    }

    @Test
    public void ShouldCallToLoan() {
        Aluno aluno = mocks.createStudent(VALID_RA);
        List<Livro> livros = mocks.createBookList(3);

        Boolean result = aluno.emprestar(livros);

        assertEquals(true, result);
    }
}