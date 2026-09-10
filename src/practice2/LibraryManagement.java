package practice2;

import constructor.A;

class List{

    int id;
    String name;
    String category;


    public List(String name, int id,String category) {
        this.name = name;
        this.id = id;
        this.category=category;
    }

    public void showDetails(){
        System.out.println("The id of "+category+" is - "+id);
        System.out.println("The name of "+category+ " is - "+name);

    }
}
class Book extends List{

    String author;

    public Book(String name, int id, String category,String author) {
        super(name, id, category);
        this.author = author;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println(author);
    }
}

class Magazine extends List{

    String author;
    public Magazine(String name, int id, String category,String author) {
        super(name, id, category);
        this.author=author;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Author is "+author);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        System.out.println("---Book---");
        Book b = new Book("Shyam chi aai",55,"Book","Sane Guruji");
        b.showDetails();
        System.out.println();

        System.out.println("---Magazine---");
        Magazine mg = new Magazine("xyz",7077,"Magazine","abc");
        mg.showDetails();
    }
}
