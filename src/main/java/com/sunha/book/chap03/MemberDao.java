package com.sunha.book.chap03;

import java.util.HashMap;
import java.util.Map;

import com.sunha.book.chap03.Member;

public class MemberDao {

	/**
	 *  ȸ������ �� (ȸ�� ���̺�)
	 */
	Map<String, Member> map = new HashMap<>();

	/**
	 * �̸��Ϸ� ȸ�� ���� ������
	 */
	public Member selectByEmail(String email) {
		return map.get(email);
	}

	/**
	 * ȸ������ ����
	 */
	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}