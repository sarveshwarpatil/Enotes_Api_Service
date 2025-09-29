package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired
    private CategoryRepository categoryRepo;
	
	@Override
	public Boolean saveCategory(Category category) 
	{
		
		Category saveCategory=categoryRepo.save(category);
		
		if(ObjectUtils.isEmpty(saveCategory))
		{
			return false;
		}
		
		return true;
	}

	@Override
	public List<Category> getAllCategory() 
	{
		List<Category> categories=categoryRepo.findAll();
		return categories;
	}

}
