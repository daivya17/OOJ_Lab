import java.util.Scanner;

class Book {
    private String name;
    private String author;
    private double price;
    private int num_pages;

    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getNumPages() {
        return num_pages;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of books:");
        int n = s.nextInt();
        s.nextLine(); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Name of book:");
            String name = s.nextLine();
            System.out.println("Name of author:");
            String author = s.nextLine();
            System.out.println("Price:");
            double price = s.nextDouble();
            System.out.println("Number of pages:");
            int num_pages = s.nextInt();
            s.nextLine(); 
            books[i] = new Book(name, author, price, num_pages);
        }

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Name: Daivya Priyankkumar Shah");
        System.out.println("USN: 1BM23CS084");

    }
}
