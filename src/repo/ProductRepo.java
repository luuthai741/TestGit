package repo;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductRepo {
    static List<Product> productList = new ArrayList<Product>();

    static{
        productList.add(new Product(1,"Iphone 11", 110.5,true,1));
        productList.add(new Product(2,"Iphone 12", 100.99,true,1));
        productList.add(new Product(3,"Iphone 13", 99.9,false,1));
        productList.add(new Product(4,"Iphone 10", 99.9,true,1));
        productList.add(new Product(5,"Samsung S8", 88.8,false,2));
        productList.add(new Product(6,"Samsung S20", 77.7,true,2));
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

    public List<Product> findByCategoryId(int categoryId){
        return productList.stream().filter(product -> product.getCategoryId() == categoryId).collect(Collectors.toList());
    }
}
