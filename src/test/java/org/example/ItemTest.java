package org.example;

import org.junit.Test;
import resources.Mocks;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ItemTest{
    private final Mocks mocks = new Mocks();

    @Test
    public void ShouldSetDevolutionDate() {
        Date date = mocks.getDate(0);
        Item item = new Item(mocks.createBook(1));

        item.setDataDevolucao(date);

        assertEquals(date, item.getDataDevolucao());
    }

    @Test
    public void ShouldCalculateDevolutionDate() {
        int bookCode = 1;
        Item item = new Item(mocks.createBook(bookCode));
        Date date = mocks.getDate(0);
        Date expectedDate = mocks.getDate(bookCode + 1);

        Date result = item.calculaDataDevolucao(date);

        assertEquals(expectedDate, result);
    }
}