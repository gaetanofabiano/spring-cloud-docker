package it.fabiano.spring.book.microservice.domain;

/**
* Dummy microservice studies
*
* @author  Gaetano Fabiano
* @version 1.0.0
* @since   2021-24-10
* @updated 2021-25-11 
*/
public class Book extends ObjectWithId{
    private String author;
    private String title;

    public Book() {
    }

    public Book(long id,String author, String title)
    {
        super(id);
        this.author = author;
        this.title = title;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return id == book.id;

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
