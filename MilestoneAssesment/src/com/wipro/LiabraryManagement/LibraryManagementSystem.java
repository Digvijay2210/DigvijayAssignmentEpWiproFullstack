package com.wipro.LiabraryManagement;


public class LibraryManagementSystem {
 public static void main(String[] args) {
     Library library = new Library();

     // Adding books to the library (Unsorted for Linear Search)
     library.addBookUnsorted(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
     library.addBookUnsorted(new Book("1984", "George Orwell", "9780451524935"));
     library.addBookUnsorted(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
     library.addBookUnsorted(new Book("Moby Dick", "Herman Melville", "9781503280786"));
     library.addBookUnsorted(new Book("War and Peace", "Leo Tolstoy", "9780199232765"));

     // Adding books to the library (Sorted for Binary Search)
     library.addBookSorted(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
     library.addBookSorted(new Book("1984", "George Orwell", "9780451524935"));
     library.addBookSorted(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
     library.addBookSorted(new Book("Moby Dick", "Herman Melville", "9781503280786"));
     library.addBookSorted(new Book("War and Peace", "Leo Tolstoy", "9780199232765"));

     // Display all books (Unsorted list)
     System.out.println("Books in the library (Unsorted):");
     library.displayBooksUnsorted();
     System.out.println();

     // Display all books (Sorted list)
     System.out.println("Books in the library (Sorted):");
     library.displayBooksSorted();
     System.out.println();

     // Linear Search in Unsorted List
     String titleToSearch = "1984";
     System.out.println("Linear Search in Unsorted List:");
     Book foundBookLinear = library.linearSearch(titleToSearch);
     if (foundBookLinear != null) {
         System.out.println("Book found: " + foundBookLinear);
     } else {
         System.out.println("Book not found");
     }
     System.out.println();

     // Binary Search in Sorted List
     System.out.println("Binary Search in Sorted List:");
     Book foundBookBinary = library.binarySearch(titleToSearch);
     if (foundBookBinary != null) {
         System.out.println("Book found: " + foundBookBinary);
     } else {
         System.out.println("Book not found");
     }
     System.out.println();

     // Removing a book
     String titleToRemove = "Moby Dick";
     library.removeBook(titleToRemove);
     System.out.println("Books in the library after removing '" + titleToRemove + "' (Unsorted):");
     library.displayBooksUnsorted();
     System.out.println();

     System.out.println("Books in the library after removing '" + titleToRemove + "' (Sorted):");
     library.displayBooksSorted();
 }
}
