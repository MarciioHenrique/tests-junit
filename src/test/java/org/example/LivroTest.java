package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LivroTest {
    @Test
    public void ShouldReturnFalseOnBookValidation() {
        int bookCode = 4;
        Livro livro = new Livro(bookCode);

        boolean result = livro.verificaLivro();

        assertFalse(result);
    }

    @Test
    public void ShouldReturnTrueOnBookValidation() {
        int bookCode = 3;
        Livro livro = new Livro(bookCode);

        boolean result = livro.verificaLivro();

        assertTrue(result);
    }
}