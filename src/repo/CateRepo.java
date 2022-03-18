package repo;

import model.Category;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CateRepo {
    static List<Category> categoryList = new ArrayList<Category>();

    static{
        categoryList.add(new Category(1,"Iphone"));
        categoryList.add(new Category(2,"Samsung"));
        categoryList.add(new Category(3,"Oppo"));
    }

    public List<Category> getCategoryList(){
        return categoryList;
    }

    public Category findById(int id){
        return categoryList.stream().filter(category -> category.getId() == id).findFirst().get();
    }

    public void deleteById(int id){
        categoryList = categoryList.stream().filter(category -> category.getId() != id).collect(Collectors.toList());
    }

    public void saveProduct(Category category){
        categoryList.add(category);
    }

}
