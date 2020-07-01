package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/*
	 * 7. ĸ��ȭ ������ ���� �Ϻ��� Ŭ������ ���¸� ���߰Բ�!!
	 * 	
	 * 		ĸ��ȭ : Ŭ������ ���� �߿��� ������ "�������� ���� ����"�� ��Ģ���� �Ͽ� "�ܺηκ��� ���� ������ ��������!!"
	 * 				��ſ� �����͸� ���������ζ� ó��(���� ��ų�, ��ȸ�Ѵٰų�)�ϴ� �޼ҵ���� Ŭ�������ο� ���鲨��!!
	 * 
	 * 		1) �������� : private
	 * 		2) setter/getter �޼ҵ�
	 *    		private�� �ϴ� ���� �� ��������� ���̻� ������ �� ���� ����. 
	 *    		���� ���������ζ� �����ؼ� ���� ��ų�(�����Ѵٰų�) 
	 *    		�� ���� ������ �� �ִ� �޼ҵ尡 �ٷ� setter/getter �޼ҵ��̴�. 
	 * 		
	 */

	public static void main(String[] args) {
		
		Student hong = new Student();
		/*
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 162.3;
		*/
		// name, age, height �ʵ� private�� �Ǿ��־� �������ٺҰ�!
		
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(163.5);
		
		System.out.println(hong.getName() + "���� "
						  + hong.getAge() + "���̰�, Ű��"
						  + hong.getHeight() + "cm�Դϴ�.");
		
		//hong.information();
		System.out.println(hong.information());
		
		
		
	}

}








