package task1;

import task1.employee.Administrator;
import task1.employee.Librarian;
import task1.employee.Reader;
import task1.employee.Supplier;

public class Person2 extends User implements Administrator, Librarian {
    Book book;
    public Person2(String name, Book book) {
        super(name);
        this.book = book;
    }

    @Override
    public void findBook(Reader reader) {
        System.out.println("Администратор " + getName() + " нашел книгу " + book.getBook() + " для читателя "+ reader);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + getName() + " уведомил читателя " + reader + " о просрочке ");

    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + getName()+ " заказал " + book.getBook() + "y поставщика " + supplier );
    }
}
