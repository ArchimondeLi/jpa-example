package cn.merryyou.jpa;

import cn.merryyou.jpa.domain.Book;
import cn.merryyou.jpa.domain.User;
import cn.merryyou.jpa.domain.UserBookKey;
import cn.merryyou.jpa.repository.BookRepository;
import cn.merryyou.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    @Transactional
    public void run(String... strings) throws Exception {


//        User user3 = userRepository.findOne(3);

        User user = new User();
        user.setId(5);
        user.setName("李五");
        user.setAge(55);


        Book book1 = new Book();
        UserBookKey key1 = new UserBookKey();
        key1.setUserId(5);
        key1.setBookName("三体一");
        book1.setKey(key1);
        book1.setBookPrice(10000);

        Book book2 = new Book();
        UserBookKey key2 = new UserBookKey();
        key2.setUserId(5);
        key2.setBookName("三体二");
        book2.setKey(key2);
        book2.setBookPrice(20000);

        Book book3 = new Book();
        UserBookKey key3 = new UserBookKey();
        key3.setUserId(5);
        key3.setBookName("三体四");
        book3.setKey(key3);
        book3.setBookPrice(40000);

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);


        user.setBooks(books);

        User res = userRepository.save(user);

//        bookRepository.save(books);


        System.out.println(res.getBooks().size());

    }

}
