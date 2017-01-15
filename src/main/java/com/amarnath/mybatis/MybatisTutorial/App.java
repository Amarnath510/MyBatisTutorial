package com.amarnath.mybatis.MybatisTutorial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amarnath.mybatis.bean.Category;
import com.amarnath.mybatis.util.CategoryManager;

/**
 * Main method class.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("***** Select by Id *****");
        Category category = CategoryManager.selectCategoryById(1);
        System.out.println(category.toString());
    	
        System.out.println("\n***** Select all *****");
    	List<Category> all = CategoryManager.getAll();
    	all.forEach(eachCategory -> System.out.println(eachCategory.toString()));
    	
    	System.out.println("\n***** Select by sending multiple parameters using Map *****");
    	Map<String, String> map = new HashMap<String, String>();
		map.put("categoryId", "3");
		map.put("categoryName", "ETHINIC");
    	List<Category> categoryFilter = CategoryManager.selectByMultipleFilter(map);
    	System.out.println(categoryFilter);
    	
    	System.out.println("\n***** Update with new value using Map parameter. *****");
    	Map<String, String> updateMap = new HashMap<String, String>();
    	updateMap.put("categoryId", "3");
    	updateMap.put("newCategoryName", "ETHINIC UPDATED");
    	CategoryManager.updateById(updateMap);
    	
    	System.out.println("\n***** Select by Object *****");
    	List<Category> listOfObjects = CategoryManager.selectByCategoryObject(new Category(-1, "INDIAN"));
    	listOfObjects.forEach(eachCategory -> System.out.println(eachCategory.toString()));
    	
    	System.out.println("\n***** Delete Object with ID 5 *****");
    	CategoryManager.deleteById(new Category(5, null));
    	
    	System.out.println("\n***** Insert Object with ID 6 *****");
    	// Delete if already exists and then insert.
    	CategoryManager.deleteById(new Category(6, null));
    	CategoryManager.insertCategory(new Category(6, "AFRICAN"));
    }
}
