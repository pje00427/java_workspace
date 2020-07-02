package com.kh.chap02_set.part02_treeSet.model.vo;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	private int score;
	
	// 기본생성자, 매개변수생성자, set/getter메소드 , toString메소드
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
	public int compareTo(Person o) {
		
		// this(앞)    vs     o(뒤)
		
		// 이름별 오름차순 정렬
		
		return this.name.compareTo(o.name);
	}
	
	
}
