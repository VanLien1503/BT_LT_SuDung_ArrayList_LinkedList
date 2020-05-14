public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product1 = new Product(1, "xiaomi", 30000);
        Product product2 = new Product(5, "samsung", 90000);
        Product product3 = new Product(4, "iphone", 100000);
        Product product4 = new Product(7, "huawei", 65000);

        productManager.arrayList.add(product1);
        productManager.arrayList.add(product2);
        productManager.arrayList.add(product3);
        productManager.arrayList.add(product4);

//        productManager.add();

        productManager.displayProducts();
        productManager.remove(5);
        System.out.println("-------------------");
        System.out.println("Delete id=5");
        productManager.displayProducts();
        System.out.println("-------------------");
        System.out.println("Find iphone");
        productManager.find("iphone");
        System.out.println("-------------------");
        System.out.println("Sap xep gia tang dan");
        productManager.tangPrice();
        productManager.displayProducts();
        System.out.println("-------------------");
        System.out.println("Sap xep gia giam dan");
        productManager.giamPrice();
        productManager.displayProducts();
    }
}