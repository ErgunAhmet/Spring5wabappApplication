package guru.springframework.spring5wabapp.repositories;

import guru.springframework.spring5wabapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
