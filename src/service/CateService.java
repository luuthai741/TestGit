package service;

import model.Category;
import model.Product;
import repo.CateRepo;
import repo.ProductRepo;

import java.util.List;

public class CateService {
    private CateRepo cateRepo;

    public CateService() {
        this.cateRepo = new CateRepo();
    }

    public List<Category> getCategoryList(){
        List<Category> categoryList = cateRepo.getCategoryList();
        categoryList.forEach(category -> System.out.println(category.toString()));
        return categoryList;
    }

    public Category findById(int id){
        Category category = cateRepo.findById(id);
        if(category == null){
            System.out.println("Cann't find category with id: " + id);
            return null;
        }
        System.out.println(category.toString());
        return category;
    }

    public void deleteById(int id){
        cateRepo.deleteById(id);
    }

    public void saveProduct(Category category){
        cateRepo.saveProduct(category);
    }


}
