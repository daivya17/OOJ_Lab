import java.util.Scanner;
class Book{
    String name;
    String author;
    int price;
    int pages;
    public Book(String name,String author,int price,int pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    public void setdetails(String name,String author,int price,int pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    String getname(){
        return name;
    }
    String getauthor(){
        return author;
    }
    int getprice(){
        return price;
    }
    int getpages(){
        return pages;
    }
    public String toString(){
        return "Name:"+name+" Author:"+author+" Price:"+price+" Pages:"+pages;
    }
}
public class Bookdetails {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of books:");
        int n = s.nextInt();
        Book[] books = new Book[n];
        s.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("enter name:");
            String name = s.nextLine();
            System.out.println("enter author:");
            String author = s.nextLine();
            System.out.println("enter price:");
            int price = s.nextInt();
            System.out.println("enter no of pages:");
            int pages = s.nextInt();
            s.nextLine();
            books[i] = new Book(name,author,price,pages);
        }
        for(Book book: books){
            System.out.println(book);
        }
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
