package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ControleTest{
    @Test
    public void ShouldReturnFalseOnStudentVerificationFail() {
        String aluno = "10";
        int[] prazos = new int[]{1};
        int numLivros = 1;
        Controle controle = new Controle();

        controle.emprestar(aluno, prazos, numLivros);

        assertFalse(controle.emprestar(aluno, prazos, numLivros));
    }

    @Test
    public void ShouldReturnFalseOnDebitVerificationFail() {
        String aluno = "4";
        int[] prazos = new int[]{1};
        int numLivros = 1;
        Controle controle = new Controle();

        controle.emprestar(aluno, prazos, numLivros);

        assertFalse(controle.emprestar(aluno, prazos, numLivros));
    }

    @Test
    public void ShouldReturnFalseOnEmptyBooks() {
        String aluno = "1";
        int[] prazos = new int[]{};
        int numLivros = 0;
        Controle controle = new Controle();

        controle.emprestar(aluno, prazos, numLivros);

        assertFalse(controle.emprestar(aluno, prazos, numLivros));
    }

    @Test
    public void ShouldReturnFalseOnExceedBookLimit() {
        String aluno = "1";
        int[] prazos = new int[]{1,2,3,4,5,6};
        int numLivros = 6;
        Controle controle = new Controle();

        controle.emprestar(aluno, prazos, numLivros);

        assertFalse(controle.emprestar(aluno, prazos, numLivros));
    }

    @Test
    public void ShouldReturnTrueOnEverythingIsOk() {
        String aluno = "1";
        int[] prazos = new int[]{1};
        int numLivros = 1;
        Controle controle = new Controle();

        controle.emprestar(aluno, prazos, numLivros);

        assertTrue(controle.emprestar(aluno, prazos, numLivros));
    }
}