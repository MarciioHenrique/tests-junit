package org.example;

import org.junit.Test;
import resources.Mocks;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmprestimoTest {
    private final Mocks mocks = new Mocks();

    @Test
    public void ShouldCreateAnLoan() {
        int numberOfBooks = 5;
        List<Item> items = mocks.createItemList(numberOfBooks);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.i = items;

        Date result = emprestimo.CalculaDataDevolucao();

        assertNotNull(result);
    }

    @Test
    public void ShouldCreateAnLoanOneBookWithoutAdditionalDays() {
        int numberOfBooks = 1;
        List<Item> items = mocks.createItemList(numberOfBooks);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.i = items;
        Date expected = mocks.getDate(numberOfBooks + 1);

        Date result = emprestimo.CalculaDataDevolucao();

        assertEquals(expected, result);
    }

    @Test
    public void ShouldCreateAnLoanTwoBooksWithoutAdditionalDays() {
        int numberOfBooks = 2;
        List<Item> items = mocks.createItemList(numberOfBooks);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.i = items;
        Date expected = mocks.getDate(numberOfBooks + 1);

        Date result = emprestimo.CalculaDataDevolucao();

        assertEquals(expected, result);
    }

    @Test
    public void ShouldCreateAnLoanThreeBooksWithAdditionalDays() {
        int numberOfBooks = 3;
        int additionalDays = (numberOfBooks-2) * 2;
        List<Item> items = mocks.createItemList(numberOfBooks);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.i = items;
        Date expected = mocks.getDate(numberOfBooks + additionalDays + 1);

        Date result = emprestimo.CalculaDataDevolucao();

        assertEquals(expected, result);
    }

    @Test
    public void ShouldCreateAnLoanFifthBooksWithAdditionalDays() {
        int numberOfBooks = 50;
        int additionalDays = (numberOfBooks-2) * 2;
        List<Item> items = mocks.createItemList(numberOfBooks);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.i = items;
        Date expected = mocks.getDate(numberOfBooks + additionalDays + 1);

        Date result = emprestimo.CalculaDataDevolucao();

        assertEquals(expected, result);
    }
}