package guru.springframework.spring5wabapp.bootstrap;

import guru.springframework.spring5wabapp.domain.Author;
import guru.springframework.spring5wabapp.domain.Book;
import guru.springframework.spring5wabapp.repositories.AuthorRepository;
import guru.springframework.spring5wabapp.repositories.BookRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepositories bookRepositories;

    public BootStrapData(AuthorRepository authorRepository, BookRepositories bookRepositories) {
        this.authorRepository = authorRepository;
        this.bookRepositories = bookRepositories;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("domain driven design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepositories.save(ddd);

        Author rod = new Author("rod", "jhonson");
        Book noEJB = new Book("J2EE development ", "545461616");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepositories.save(noEJB);
        System.out.println("started in bootstrap");
        System.out.println("number of books" + bookRepositories.count());
    }
}
