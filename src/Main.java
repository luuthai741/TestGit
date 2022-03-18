import model.Category;
import model.Product;
import service.CateService;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        CateService cateService = new CateService();
        cateService.getCategoryList();

        ProductService productService = new ProductService();
        productService.findByCategoryId(1);

    }
}
