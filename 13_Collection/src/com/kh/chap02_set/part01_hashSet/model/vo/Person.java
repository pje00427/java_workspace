package com.kh.chap02_set.part01_hashSet.model.vo;

public class Person {

	private String name;
	private int age;
	private int score;
	
	// �⺻������, �Ű�����������, setter/getter�޼ҵ� , toString�޼ҵ�
	public Person() {
		
	}
	
	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// this		vs		obj
		
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	// ���� �ʵ尪���� ��ġ�� ��� ������ ��ü�� �Ǵ��� �ǰԲ� �ϰ��� �Ѵٸ� 
	// ���� �ʵ尪���� ������ hashCode(), equals() �������̵� �ؾ߸���!
	
	
	
	
}
