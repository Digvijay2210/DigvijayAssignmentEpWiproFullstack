package com.wipro.LiabraryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Library.java
public class Library {
    private List<Book> booksUnsorted; // List for Linear Search
    private List<Book> booksSorted;   // List for Binary Search

    public Library() {
        booksUnsorted = new ArrayList<>();
        booksSorted = new ArrayList<>();
    }

    // Add a book to the unsorted list (for Linear Search)
    public void addBookUnsorted(Book book) {
        booksUnsorted.add(book);
    }

    // Add a book to the sorted list (for Binary Search)
    public void addBookSorted(Book book) {
        booksSorted.add(book);
        Collections.sort(booksSorted);
    }

    // Remove a book from both lists by title
    public void removeBook(String title) {
        booksUnsorted.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
        booksSorted.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    // Display all books (Unsorted list)
    public void displayBooksUnsorted() {
        for (Book book : booksUnsorted) {
            System.out.println(book);
        }
    }

    // Display all books (Sorted list)
    public void displayBooksSorted() {
        for (Book book : booksSorted) {
            System.out.println(book);
        }
    }

    // Linear Search to find a book by title (Unsorted list)
    public Book linearSearch(String title) {
        for (Book book : booksUnsorted) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search to find a book by title (Sorted list)
    public Book binarySearch(String title) {
        int left = 0;
        int right = booksSorted.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = booksSorted.get(mid).getTitle().compareToIgnoreCase(title);
            if (cmp == 0) {
                return booksSorted.get(mid);
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
