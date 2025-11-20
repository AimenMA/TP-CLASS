package SRC.com.example.library.app;

import SRC.com.example.library.model.Book;
import SRC.com.example.library.model.Member;
import SRC.com.example.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();


        library.addBook(new Book("ISBN001", "Title 1", "Aimen"));
        library.addBook(new Book("ISBN002", "Title 2", "Youssef"));


        library.addMember(new Member("M001", "Aimen", "aimen@example.com"));
        library.addMember(new Member("M002", "Youssef", "Youssef@example.com"));

        System.out.println("====================== Livres ====================== ");
        for (Book b : library.getBooks()) {
            System.out.println(b);
        }


        System.out.println("\n====================== Membres ====================== ");
        for (Member m : library.getMembers()) {
            System.out.println(m);
        }
    }
}
