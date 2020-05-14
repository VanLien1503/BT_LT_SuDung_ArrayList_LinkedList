import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;

    private static Scanner scanner=new Scanner(System.in);

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Scanner getScanner() {
        return scanner;
    }
    public void inputValue(){
        System.out.println(" ID : ");
       setId( scanner.nextInt());
       scanner.nextLine();

        System.out.println(" Name : ");
        scanner.nextLine();

        System.out.println(" Price : ");
        setPrice(scanner.nextDouble());
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return " ID : "+this.id + "\tName : "+this.name + "\nPrice : "+this.price;
    }
}
