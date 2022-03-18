package service;

import model.Product;
import repo.ProductRepo;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private ProductRepo productRepo;

    public ProductService() {
        this.productRepo = new ProductRepo();
    }

    public List<Product> getProductList(){
        List<Product> productList = productRepo.getProductList();
        productList.forEach(product -> System.out.println(product.toString()));
        return productList;
    }

    public Product findById(int id){
        Product product = productRepo.findById(id);
        if(product == null){
            System.out.println("Cann't find product with id: " + id);
            return null;
        }
        System.out.println(product.toString());
        return product;
    }

    public void deleteById(int id){
        productRepo.deleteById(id);
    }

    public void saveProduct(Product product){
        productRepo.saveProduct(product);
    }

    public List<Product> findByCategoryId(int categoryId){
        List<Product> productList = productRepo.findByCategoryId(categoryId);
        productList.forEach(product -> System.out.println(product.toString()));

        return productList;
    }
}
