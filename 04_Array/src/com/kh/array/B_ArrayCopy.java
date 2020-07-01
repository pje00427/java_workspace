package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	// �迭�� ����
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("==== ���� �迭 ��� ====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		int[] copy = origin; // ��������
		
		System.out.println("\n=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n----- ���纻 �迭 �� ���� �� -----");
		
		System.out.println("==== ���� �迭 ��� ====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// �������� : �ּҰ����� ������ ���� (�ּҰ��� �����ϱ⶧���� ���� ���� �����ϰ� ����)
		System.out.println("\norigin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
				
	}
	
	// �������� ���1. for���� �̿��� ���
	public void method2() {
		
		// for�� �̿� : ���ο� �迭 ���� �� �ݺ����� �̿��� �� �ε��� ���� ����ִ� ���
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5];
		
		// copy[0] = origin[0];
		// copy[1] = origin[1];
		// ...
		// copy[4] = origin[4];
 		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n-----���纻 �迭 ������ ----");
		
		System.out.println("==== ���� �迭 ��� ====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
	}
	
	
	// ���� ���� ���2. SystemŬ���������� arraycopy()�޼ҵ带 Ȱ���
	public void method3() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ����
		
		// System.arraycopy(�����迭��, ����������ε���, ���纻�迭��, ���纻�迭�� ����� �����ε���, �����Ұ���);
		System.arraycopy(origin, 1, copy, 0, 4);
		
		System.out.println("=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		// �ּҰ� �ٸ� --> �ٸ����� �����ϰ� ���� --> �迭 ������ ���� ������ ���� ������ ����
	}
	
	// ���� ���� ���3. ArraysŬ�������� �����ϴ� copyOf() �޼ҵ� ���
	public void method4() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = Arrays.copyOf(origin, 4);
		
		System.out.println("=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
	}
	
	// ���� ���� ���4. clone() �޼ҵ� Ȱ���
	public void method5() {
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone(); // ���� �迭 ��ä�� ������ ���ο� �迭 �Ҵ�
		
		System.out.println("=== ���纻 �迭 ��� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
	}
	
	
	
	
	
	
	
	
}
