import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> arrayList = new ArrayList<>();

    public ProductManager() {
    }

    // method add
    public void add() {
        Product product = new Product();
        product.inputValue();
        arrayList.add(product);
    }

    //Method Edit
    public void edit(int id) {
        for (Product product : arrayList) {
            if (product.getId() == id) {
                product.inputValue();
            }
        }
    }

    //Method Xóa
    public void remove(int id) {
        int temp = 0;
        for (Product product : arrayList) {
            if (product.getId() == id) {
                arrayList.remove(temp);
                break;
            }
            temp++;
        }
    }

    //Method Tìm value;
    public void find(String name) {
        int temp = 0;
        for (Product product : arrayList) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
            }
            temp++;
        }
    }

    // Method DisPlay Sản Phẩm
    public void displayProducts() {
        for (Product product : arrayList) {
            System.out.println(product.toString());
        }
    }

    //Method Giá Sản Phẩm Tăng
    public void tangPrice() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }

    //Method Giảm Price
    public void giamPrice() {
        Collections.sort(arrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
    }
}
