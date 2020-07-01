package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {
	
	public static void main(String[] args) {
		
		// 1. �⺻�����ڷ� ������ �Ŀ� �� �ʵ忡 setter�޼ҵ带 ���� ������ �ʱ�ȭ
		User u1 = new User();
		// ���� ������ �ϰ� ����غ��� JVM�� �⺻������ ����ִ°� Ȯ�� ����
		System.out.println(u1.information());
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("ȫ�浿");
		
		System.out.println(u1.information());
		
		System.out.println("==================================");
		
		
		// 2. �Ű����� 3��¥�� �����ڷ� ��ü ����
		User u2 = new User("user02", "pass02", "������");
		// ������ ���ÿ� userId, userPwd, userName�� �ʱ�ȭ��
		// ����? ���� ������ ������!
		System.out.println(u2.information());
		
		
		System.out.println("==================================");
		
		// 3. �Ű����� 5��¥�� �����ڷ� ��ü ����
		User u3 = new User("user03", "pass03", "�踻��", 10, 'M');
		System.out.println(u3.information());
		
		u3.setAge(20);
		System.out.println(u3.information());
	}

}







