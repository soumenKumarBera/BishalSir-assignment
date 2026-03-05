package student_soumen_oop_assignment.qs16;

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        Book b2 = new Book("Data Structures", "Mark Allen Weiss", 650);
        Book b3 = new Book("Operating Systems", "Galvin", 700);

        Library l1 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        l1.disolayBooks();




    }
}
