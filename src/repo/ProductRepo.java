package repo;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepo {
    static List<Product> productList = new ArrayList<Product>();

    static{
        productList.add(new Product(1,"Iphone 11", 110.5));
        productList.add(new Product(2,"Iphone 12", 100.99));
        productList.add(new Product(3,"Iphone 13", 99.9));
        productList.add(new Product(4,"Iphone 10", 99.9));
        productList.add(new Product(5,"Iphone 8", 88.8));
        productList.add(new Product(6,"Iphone 7", 77.7));
    }

    public List<Product> getProductList(){
        return productList;
    }

    public Product findById(int id){
        return productList.stream().filter(product -> product.getId() == id).findFirst().get();
    }

    public void deleteById(int id){
        productList = getProductList().stream().filter(product -> product.getId() != id).collect(Collectors.toList());
    }

    public void saveProduct(Product product){
        productList.add(product);
    }

}
