package com.amarnath.mybatis.mapper;

import java.util.List;
import java.util.Map;

import com.amarnath.mybatis.bean.Category;

/**
 * The method names here should be the given as the id names in CategotyMapper.xml 
 */
public interface CategoryMapper {
	
	public Category selectCategoryById(int id);
	
	public List<Category> getAll();
	
	public List<Category> selectCategoryByNameAndId(Map<String, String> map);
	
	public void updateById(Map<String, String> map);
	
	public List<Category> selectByCategoryObject(Category category);
	
	public void deleteById(Category category);
	
	public void insertCategory(Category category);
}
