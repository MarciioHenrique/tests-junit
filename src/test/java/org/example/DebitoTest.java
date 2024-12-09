package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DebitoTest {
    @Test
    public void ShouldReturnFalseOnDebitValidation() {
        int studentCode = 4;
        Debito debito = new Debito(studentCode);

        boolean result = debito.verificaDebito();

        assertFalse(result);
    }

    @Test
    public void ShouldReturnTrueOnDebitValidation() {
        int studentCode = 1;
        Debito debito = new Debito(studentCode);

        boolean result = debito.verificaDebito();

        assertTrue(result);
    }
}