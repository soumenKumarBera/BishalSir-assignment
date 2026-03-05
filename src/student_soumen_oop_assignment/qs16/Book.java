package student_soumen_oop_assignment.qs16;

public class Book {
    private String title;
    private String author;
    private  long price;

    public Book(String title, String author, long price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Price: "+price);
        System.out.println("================================================");
    }
}
