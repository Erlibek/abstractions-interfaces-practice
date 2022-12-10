package task1;
import task1.employee.Administrator;
import task1.employee.Librarian;
import task1.employee.Reader;
import task1.employee.Supplier;

public class Person1 extends User implements Supplier, Reader {
    Book book;
    public Person1(String name, Book book ) {
        super(name);
        this.book = book;
    }

    @Override
    public void getBooks(Administrator administrator) {
        System.out.println("Читатель " + getName() +  " взял книгу " + book.getBook()+ " у администратора "+ administrator);
    }

    @Override
    public void giveBackBook(Administrator administrator) {
        System.out.println("Читатель " + getName() + " отдал книгу " + book.getBook());
    }

    @Override
    public void bringBooks(Librarian librarian) {
        System.out.println("Поставщик " + getName() + " принес книгу " + book.getBook() + " для библиотекаря " + librarian);
    }
}
