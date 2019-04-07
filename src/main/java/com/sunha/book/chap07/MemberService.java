package com.sunha.book.chap07;

import java.util.List; 
 
 
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 
import com.sunha.book.chap03.Member; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 
 
 /** 
  * p.204 [����Ʈ 8.13]�� Main�� Service�� �и��� Service �κ� 
  *  
  * @author Jacob 
  */ 
 @Service 
 public class MemberService { 
 
 
 	Logger logger = LogManager.getLogger(); 
 

 	@Autowired 
 	MemberDao memberDao; 
 
 
 
 	public void selectAll() { 
 		List<Member> members = memberDao.selectAll(0, 100); 
 		logger.debug(members); 
 	} 
 
 
 	public void updateMember() { 
 		Member member = memberDao.selectByEmail("sunha0822@naver.com"); 
 		member.setPassword("b"); 
 		memberDao.update(member); 
 		logger.debug("Update complete."); 
 	} 
 
 
 	public void insertMember() { 
 		Member member = new Member(); 
 		member.setEmail("sunha0822@naver.com"); 
 		member.setPassword("a"); 
		member.setName("Ȳ����"); 
		memberDao.insert(member); 
 		logger.debug("Insert complete."); 
 	} 
} 
