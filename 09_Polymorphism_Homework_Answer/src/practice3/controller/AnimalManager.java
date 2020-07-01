package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("�ǻ�", "��Ƽ��", 5);
		arr[1] = new Cat("�߻���", "�丣�þ�", "����", "���");
		arr[2] = new Cat("�̻�", "���þȺ��", "��", "ȸ��");
		arr[3] = new Dog("��", "�ú�����", 30);
		arr[4] = new Dog("ū��", "��������", 40);
		
		for(Animal a : arr) {
			a.speak();
		}
	}

}
