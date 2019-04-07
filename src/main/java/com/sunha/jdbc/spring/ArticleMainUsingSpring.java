package com.sunha.jdbc.spring;

import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 

 
/** 
 * ArticleService�� �׽�Ʈ�ϴ� main 
 *  
 * @author Jacob 
  */ 
 public class ArticleMainUsingSpring { 
 

 	public static void main(String[] args) { 
 		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext( 
 				"chap02.xml"); 
 		ArticleService articleService = context.getBean("articleService", 
 				ArticleService.class); 
 		context.close(); 
 
 
 		articleService.addArticle(); 
 		articleService.listArticles(); 
 	} 
 
 
 } 
