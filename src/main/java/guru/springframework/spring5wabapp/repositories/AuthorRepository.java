package guru.springframework.spring5wabapp.repositories;

import guru.springframework.spring5wabapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
