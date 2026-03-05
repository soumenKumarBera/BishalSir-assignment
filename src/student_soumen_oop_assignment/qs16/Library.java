package student_soumen_oop_assignment.qs16;

public class Library {

    Book[] books = new Book[50];
    int count = 0;

    void addBook(Book b){
        books[count] = b;
        count++;
    }

    void disolayBooks(){
        for (int i = 0; i < count; i++){
            books[i].displayBook();
        }

    }


}
