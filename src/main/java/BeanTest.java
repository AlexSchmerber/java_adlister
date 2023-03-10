import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album pebbleBrain = new Album();
        pebbleBrain.setArtist("Lovejoy");
        pebbleBrain.setAlbumName("Pebble Brain");
        Quote quote1 = new Quote(new Author(2, "awodn", "blaj"), "blah blah blah");
        Quote quote3 = new Quote(new Author(24, "yeee", "loll"), "too taa tee");
        Quote quote5 = new Quote(new Author(122, "showacm", "fooey"), "shoomashlash");
        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote3);
        quotes.add(quote5);
        for (Quote quote : quotes) {
            System.out.println(quote.getContent() + "  -" + quote.getAuthor());
        }
    }
}
