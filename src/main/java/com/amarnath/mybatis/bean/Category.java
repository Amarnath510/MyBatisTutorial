package com.amarnath.mybatis.bean;

public class Category {
	public int categoryId;
	private String categoryName;

	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "Id = " + this.categoryId + " and Name = " + this.categoryName;
	}
}
