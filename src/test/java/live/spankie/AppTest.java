package live.spankie;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
        Library library = new Library();
        assertNotNull(library);
        Book thingsFallApart = new Book(1, "Things fall apart", "Things fall apart by chinua achebe");
        Book richestManInbabylon = new Book(1, "Richest man in babylon",
                "Richest man in babylon by george samuel clason");
        library.AddBook(thingsFallApart);
        library.AddBook(thingsFallApart);
        library.AddBook(richestManInbabylon);
        library.AddBook(richestManInbabylon);
        HashMap<String, ArrayList<Book>> ab = (HashMap<String, ArrayList<Book>>) library.getBooks();
        assertEquals(2, ab.size());
        assertEquals(2, ab.get(thingsFallApart.getName()).size());
    }
}
