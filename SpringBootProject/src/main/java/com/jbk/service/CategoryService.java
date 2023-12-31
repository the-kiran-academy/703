package com.jbk.service;

import java.util.List;

import com.jbk.model.Category;

public interface CategoryService {

	public int addCategory(Category category);
	public Category getCategoryById(long categoryId);
	public List<Category> getAllCategory();
	public List<Category> deleteCategory();
	public Category updateCategory();
}
