package live.spankie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Library
 */
public class Library {

  private Map<String, ArrayList<Book>> books;

  private Map<String, String> borrowedBooks;

  public Library() {
    this.books = new HashMap<String, ArrayList<Book>>();
    this.borrowedBooks = new HashMap<String, String>();
  }

  public String Borrow(String nameOfBook, String borrower) {
    ArrayList<Book> ab = books.get(nameOfBook);
    if (ab != null) {
      Iterator<Book> it = ab.iterator();
      while (it.hasNext()) {
        it.next();
        it.remove(); // removes the book in it.next() from the arraylist
        borrowedBooks.put(borrower, nameOfBook);
        return "Here is your book, make sure you return it, " + borrower;
      }
    }
    return "Book taken";
  }

  public void AddBook(Book book) {
    ArrayList<Book> b = books.get(book.getName());
    if (b == null) {
      books.put(book.getName(), new ArrayList<Book>(Arrays.asList(book)));// et(book.getName())
    } else {
      books.get(book.getName()).add(book);
    }
  }

  public Map<String, ArrayList<Book>> getBooks() {
    return books;
  }

  public Map<String, String> getBorrowedBooks() {
    return borrowedBooks;
  }

  public void ProcessByPriority(PriorityQueue<Person> pp) {
    // Iterator<Person> it = pp.iterator();
    while (!pp.isEmpty()) {
      Person p = pp.poll();
      System.out.println(this.Borrow(p.getBookToBorrow(), p.getName()));
    }
  }

}