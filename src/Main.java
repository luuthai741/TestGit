import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.getProductList();
    }
}
