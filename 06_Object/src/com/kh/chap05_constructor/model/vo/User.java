package com.kh.chap05_constructor.model.vo;

public class User {
	
	
	// ���̵�, ��й�ȣ, �̸�, ����, ����
	
	// �ʵ��
	private String userId;		// ȸ�����̵�
	private String userPwd;		// ȸ����й�ȣ
	private String userName;	// ȸ���̸�
	private int age;			// ȸ������
	private char gender;		// ȸ������
	
	
	// �����ں�
	/*
	 * 	* ǥ����
	 * 	public Ŭ������([�Ű�����, �Ű�����, ...]) {
	 * 
	 *  }
	 *  
	 *  * �����ڸ� �ۼ��ϴ� ����
	 *  1. ��ü�� �������ֱ� ���� ����
	 *  2. �Ű������� ���޵� ������ �ش� �ʵ忡 �ٷ� �ʱ�ȭ�ϸ鼭 ������ ����
	 *  
	 *  * ������ �ۼ��� ������ ��
	 *  1. ��ȯ�� ����ߵ� (�޼ҵ�� �����ؼ� �򰥸� �� ����)
	 *  2. �ݵ�� �����ڸ��� Ŭ������� ��ġ�ؾߵ� 
	 *  3. �Ű����� �����ڸ� ��������� ����� ���� JVM�� �ڵ����� �⺻�����ڸ� �������������!!
	 *  	��, �⺻�����ڴ� �׻� �ۼ��ϴ� ������ �⸣��!!
	 */
	public User() {
		// �⺻������
		// ���� ��ü �������� �������� ��
		// ������� ������ JVM�� �⺻������ �������(��, �Ű����������� �ۼ��� �ڵ����� �ȸ������)
	}
	
	/*
	public User(String userPwd, String userId, String userName) {
		
	}
	*/
	
	// �Ű����� 3��¥�� ������
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// age, gender �ʵ� ��������� ��!! ��, �⺻������ �ʱ�ȭ �Ǿ����� ����!!
	}
	
	// �Ű����� 5��¥�� ������
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		this(userId, userPwd, userName); // this() : �Ǵٸ� ������ ȣ��
		// �������� : ���� ù �ٿ� �����ؾߵ�!!
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
	// �޼ҵ��
	// setter�޼ҵ� : ���޵Ǵ� �� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ(����)�����ִ� �޼ҵ� (�� ����)
	// public void setXXX(���ʵ����ڷ��� �ʵ��) { }
	public void setUserId(String userId) {
		this.userId = userId;
		// this == �ش� ��ü�� �ּҰ�
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// getter�޼ҵ� : �ش� �ʵ忡 ��� ���� ��ȯ�����ִ� �޼ҵ� (�� ��ȸ)
	// public ���ʵ����ڷ��� �޼ҵ��() { }
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	
	// information�޼ҵ� : �ش� �ʵ忡 ��䰪���� �ϳ��� ���ڿ��� ���ļ� ��ȯ�����ִ� �޼ҵ�
	public String information() {
		return "���̵� : " + userId + ", ��й�ȣ : " + userPwd + ", �̸� : " + userName 
					+ ", ���� : " + age + ", ���� : " + gender;
	}

	
	// �ʵ� + (�⺻������ + ����ʵ��ʱ�ȭ �Ҽ��ִ� �Ű�����������) + (set/getter�޼ҵ� + information�޼ҵ�)
}







