package com.betrybe.alexandria.service;

import com.betrybe.alexandria.entity.Author;
import com.betrybe.alexandria.entity.Book;
import com.betrybe.alexandria.entity.BookDetail;
import com.betrybe.alexandria.entity.Publisher;
import com.betrybe.alexandria.repository.BookDetailRepository;
import com.betrybe.alexandria.repository.BookRepository;
import com.betrybe.alexandria.service.exception.AuthorNotFoundException;
import com.betrybe.alexandria.service.exception.BookDetailNotFoundException;
import com.betrybe.alexandria.service.exception.BookNotFoundException;
import com.betrybe.alexandria.service.exception.PublisherNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  private final BookRepository bookRepository;
  private final BookDetailRepository bookDetailRepository;
  private  final PublisherService publisherService;
  private final AuthorService authorService;

  @Autowired
  public BookService(BookRepository bookRepository, BookDetailRepository bookDetailRepository,
      PublisherService publisherService, AuthorService authorService) {
    this.bookRepository = bookRepository;
    this.bookDetailRepository = bookDetailRepository;
    this.publisherService = publisherService;
    this.authorService = authorService;
  }

  public Book findById(Long id) throws BookNotFoundException {
    return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
  }

  public List<Book> findALl() {
    return bookRepository.findAll();
  }

  public Book Create(Book book) {
    return bookRepository.save(book);
  }

  public Book update(Long id, Book book) throws BookNotFoundException {
    Book bookFromDb = findById(id);

    bookFromDb.setTitle(book.getTitle());
    bookFromDb.setGenre(book.getGenre());

    return bookRepository.save(bookFromDb);
  }

  public Book deleteById(Long id) throws BookNotFoundException {
    Book book = findById(id);
    bookRepository.deleteById(id);
    return book;
  }

  public BookDetail createBookDetail(Long bookId, BookDetail bookDetail) throws BookNotFoundException  {
    Book book = findById(bookId);
    bookDetail.setBook(book);
    return bookDetailRepository.save(bookDetail);
  }

  public BookDetail getBookDetail(Long bookId) throws BookNotFoundException, BookDetailNotFoundException {
    Book book = findById(bookId);
    BookDetail bookDetail = book.getBookDetail();

    if (bookDetail == null) {
      throw new BookDetailNotFoundException();
    }
    return bookDetail;
  }

  public BookDetail updateBookDetail(Long bookId, BookDetail bookDetail)
      throws BookNotFoundException, BookDetailNotFoundException {
    BookDetail bookDetailFromDb = getBookDetail(bookId);

    bookDetailFromDb.setSummary(bookDetail.getSummary());
    bookDetailFromDb.setPageCount(bookDetail.getPageCount());
    bookDetailFromDb.setYear(bookDetail.getYear());
    bookDetailFromDb.setIsbn(bookDetail.getIsbn());

    return bookDetailRepository.save(bookDetailFromDb);
  }

  public BookDetail removeBookDetail(Long bookId)
    throws BookNotFoundException, BookDetailNotFoundException {
    Book book = findById(bookId);
    BookDetail bookDetail = book.getBookDetail();

    if (bookDetail == null) {
      throw new BookDetailNotFoundException();
    }

    book.setBookDetail(null);
    bookDetail.setBook(null);

    bookDetailRepository.delete(bookDetail);
    return bookDetail;
  }

  public Book setBookPublisher(Long bookId, Long publisherId)
      throws BookNotFoundException, PublisherNotFoundException {
    Book book = findById(bookId);
    Publisher publisher = publisherService.findById(publisherId);
    book.setPublisher(publisher);
    return bookRepository.save(book);
  }

  public Book removeBookPublisher(Long bookId) throws BookNotFoundException {
    Book book = findById(bookId);
    book.setPublisher(null);
    return bookRepository.save(book);
  }

  public Book addBookAuthor(Long bookId, Long authorId)
      throws BookNotFoundException, AuthorNotFoundException {
    Book book = findById(bookId);
    Author author = authorService.findByid(authorId);

    book.getAuthors().add(author);

    return bookRepository.save(book);
  }

  public Book removeBookAuthor(Long bookId, Long authorId)
      throws BookNotFoundException, AuthorNotFoundException {
    Book book = findById(bookId);
    Author author = authorService.findByid(authorId);

    book.getAuthors().remove(author);

    return bookRepository.save(book);
  }
}
