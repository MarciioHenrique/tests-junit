package resources;

import org.example.Item;
import org.example.Livro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Mocks {
    public Livro createBook(int code) {
        return new Livro(code);
    }

    public List<Livro> createBookList(int quantity) {
        List<Livro> books = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            books.add(createBook(i));
        }
        return books;
    }

    public List<Item> createItemList(int quantity) {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            items.add(new Item(createBook(i)));
        }
        return items;
    }

    public Date getDate(int plusDays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE, plusDays);
        return calendar.getTime();
    }
}
