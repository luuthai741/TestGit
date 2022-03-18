import model.Category;
import service.CateService;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        CateService cateService = new CateService();
        cateService.getCategoryList();

    }
}
