package com.sunha.book.chap08;

import java.util.List; 
 
 
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 
import com.sunha.book.chap03.Member; 
 
 
/** 
  * p.204 [����Ʈ 8.13]�� Main�� Service�� �и��� Service �κ� 
  *  
  * @author Jacob 
  */ 
 public class MemberService { 
 
 	Logger logger = LogManager.getLogger(); 
 
 
 	MemberDao memberDao = null; 
 
 
 	/** 
 	 * memberDao setter for injection 
 	 */ 
 	public void setMemberDao(MemberDao memberDao) { 
 		this.memberDao = memberDao; 
 	} 
 
 
 	public void selectAll() { 
 		List<Member> members = memberDao.selectAll(0, 100); 
 		logger.debug(members); 
 	} 
 
 
 	public void updateMember() { 
 		Member member = memberDao.selectByEmail("sunha@naver.com"); 
 		member.setPassword("b"); 
 		memberDao.update(member); 
 		logger.debug("Update complete."); 
 	} 
 
 
 	public void insertMember() { 
 		Member member = new Member(); 
 		member.setEmail("sunha@naver.com"); 
 		member.setPassword("a"); 
 		member.setName("Ȳ����"); 
 		memberDao.insert(member); 
 		logger.debug("Insert complete."); 
 	} 
} 
