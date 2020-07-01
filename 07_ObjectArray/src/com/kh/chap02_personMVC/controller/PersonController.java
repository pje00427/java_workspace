package com.kh.chap02_personMVC.controller;

import com.kh.chap02_personMVC.model.vo.Person;

// Controller : ����ڰ� view(ȭ��)�� ���ؼ� ��û�� �͵��� �޾Ƽ� ó�����ִ� ��ɿ� Ŭ����

public class PersonController {
	
	// ������ ȸ�� ��ü���� ������ �� �ִ� Person[] �迭 ����
	private Person[] people = new Person[3];
	// ���� �߰��� ������� ��Ÿ���� ����
	private int count = 0;
	
	// ȸ�� �߰� ��û�� ó���ϴ� �޼ҵ�
	public int insertPerson(String name, int age, int wealth) {
		
		int result = 0; // ���������� �Ǵ��ϱ� ���� ����
		
		if(count < people.length) { // count���� 2�϶������� ȸ���߰� ����
			
			people[count++] = new Person(name, age, wealth);
			//System.out.println("ȸ�� �߰� ����!!");
			result = 1;
			
		}else { // ȸ���߰� �Ұ���
			//System.out.println("ȸ�� �߰� ����!!");
			result = 0;
		}
		
		// result 1�Ǵ� 0�� ��!
		return result;
				
	}
	
	// ���� ȸ�� ���� ��ȸ�ϴ� ��û�� ó���ϴ� �޼ҵ�
	public int selectCount() {
		//System.out.println("���� ȸ���� " + count + "���Դϴ�.");
		return count;
	}
	
	// ���� ȸ�� ��ü��ȸ ��û�� ó���ϴ� �޼ҵ�
	public Person[] selectPeople() {
		/*
		for(int i=0; i<people.length; i++) {
			System.out.println(people[i].information());
		}
		*/
		return people;
		
	}
	
	public Person searchPerson(String search) {
		
		Person searchPerson = null; // �˻��� ȸ�� ����� ����
		
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(search)) {
				//System.out.println(people[i].information());
				searchPerson = people[i];
			}
		}
		
		// ���� ��ġ�ϴ� ȸ���� ã�� ���ߴٸ� �� ���������� searchPerson�� null
		return searchPerson;
		
	}
	
	public int selectAvgWealth() {
		
		// ���� �߰��� ȸ������ �� ��� 
		int sum = 0;
		/*
		sum += people[0].getWealth();
		sum += people[1].getWealth();
		sum += people[2].getWealth();
		*/
		for(int i=0; i<count; i++) {
			sum += people[i].getWealth();
		}
		
		//System.out.println("��� ��� : " + sum / count);
		return sum/count;
	}
	

}
















