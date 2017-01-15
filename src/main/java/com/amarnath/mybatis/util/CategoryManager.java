package com.amarnath.mybatis.util;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.amarnath.mybatis.bean.Category;
import com.amarnath.mybatis.mapper.CategoryMapper;

public class CategoryManager {
	
	public static Category selectCategoryById(int id) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			return mapper.selectCategoryById(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}
	
	public static List<Category> getAll() {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			return mapper.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return null;
	}
	
	public static List<Category> selectByMultipleFilter(Map<String, String> mapFilter) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			return mapper.selectCategoryByNameAndId(mapFilter);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return null;
	}
	
	public static void updateById(Map<String, String> map) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			mapper.updateById(map);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	public static List<Category> selectByCategoryObject(Category category) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			return mapper.selectByCategoryObject(category);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		return null;
	}
	
	public static void deleteById(Category category) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			mapper.deleteById(category);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
	}
	
	public static void insertCategory(Category category) {
		SqlSession session = ConnectionFactory.getSessionFactory().openSession();
		
		try {
			CategoryMapper mapper = session.getMapper(CategoryMapper.class);
			mapper.insertCategory(category);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
	}
}
