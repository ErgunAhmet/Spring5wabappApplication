package guru.springframework.spring5wabapp.repositories;

import guru.springframework.spring5wabapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book, Long> {

}
