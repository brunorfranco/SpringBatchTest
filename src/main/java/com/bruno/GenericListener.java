package com.bruno;

import java.util.List;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.AfterWrite;
import org.springframework.batch.core.annotation.BeforeStep;
import org.springframework.batch.core.annotation.BeforeWrite;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;

import com.bruno.model.Report;

public class GenericListener {

	@BeforeStep
	public void testBeforeStep(StepExecution stepExecution){
		System.out.println("Test before step: Name " + stepExecution.getStepName());
	}
	
	@AfterStep
	public void testAfterStep(StepExecution stepExecution){
		System.out.println("Test after step: Name " + stepExecution.getStepName());
	}
	
	@BeforeWrite
	public void testBeforeWrite(List<Report> items){
		System.out.println("testBeforeWrite " + items);
	}
	
	@AfterWrite
	public void testAfterWrite(List<Report> items){
		System.out.println("testAfterWrite " + items);
	}
	
	@OnSkipInRead
	public void testOnSkipInRead(Throwable t){
		System.out.println("testOnSkipInRead " + t.getMessage());
	}
	
	@OnSkipInWrite
	public void testOnSkipInWrite(Report report, Throwable t){
		System.out.println("testOnSkipInWrite " + t.getMessage());
	}
}
