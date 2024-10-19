package by.itacademy.polinaerdman;

public class Book {
    private String id;
    private String title;
    private String authors;
    private String publisher;
    private int year;
    private String quantityPages;
    private String price;
    private String bindingType;

    public Book(String id, String title, String authors, String publisher, int year, String quantityPages, String price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.quantityPages = quantityPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(String quantityPages) {
        this.quantityPages = quantityPages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", authors='" + authors + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year='" + year + '\'' +
                ", quantityPages='" + quantityPages + '\'' +
                ", price='" + price + '\'' +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
