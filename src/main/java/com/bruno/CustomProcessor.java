package com.bruno;

import org.springframework.batch.item.ItemProcessor;

import com.bruno.model.Report;

public class CustomProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) {
		
		System.out.println("Processing Item: " +item);
		item.setDate("6/6/66");
		
		return item;
		
//		throw new FileNotFoundException("Test exception");
	}
	
}
