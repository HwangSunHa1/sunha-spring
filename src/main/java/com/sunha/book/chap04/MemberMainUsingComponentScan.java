package com.sunha.book.chap04;

import com.sunha.book.chap03.RegisterRequest; 
import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 
 
 
 /** 
  * MemberRegisterService�� �׽�Ʈ�Ѵ�.<br> 
  * component scan���� ���� �����Ѵ�. 
  *  
  * @author Jacob 
  */ 
 public class MemberMainUsingComponentScan { 
 
 
 	public static void main(String[] args) { 
 		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext( 
 				"chap04.xml"); 
 		MemberRegisterService regService = ctx.getBean("memberRegisterService", 
 				MemberRegisterService.class); 
 		 
 		// registerRequest �ʱ�ȭ 
 		RegisterRequest req = new RegisterRequest(); 
		req.setEmail("Sunha@naver.com"); 
 		req.setPassword("xxxx"); 
 		req.setName("Sunha"); 
 
 
 		// ȸ�� ��� 
 		regService.regist(req); 
 		ctx.close(); 
 	} 
 } 
