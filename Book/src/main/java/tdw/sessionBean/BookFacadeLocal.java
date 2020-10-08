package tdw.sessionbean;

import java.util.List;
import javax.ejb.Local;
import tdw.entities.Book;

@Local
public interface BookFacadeLocal {

    void create(Book book);

    void edit(Book book);

    void remove(Book book);

    Book find(Object id);

    List<Book> findAll();

    List<Book> findRange(int[] range);

    int count();
    
}
