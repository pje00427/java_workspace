package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class Run {

	public static void main(String[] args) {

		// ����ص� ��!!  ���� '=' ������		���ʰ� ������ �� �� �ڷ���(Ÿ��)�� ���ƾߵȴ�
		
		// 1. �θ� Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		//((Child1)p1).printChild1();
		// p1���۷����δ� Parent���� ���� ����
		
		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");                                                              
		Child1 c1 = new Child1();
		c1.printChild1();
		(/*(Parent)*/c1).printParent();
		// c1���۷����δ� Parent, Child1 �� �� ���� ����
		c1.print();
		
		
		// ���� ���� ������ ����Ǵ� ����
		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Parent p2 = /*(Parent)*/new Child1();
		p2.printParent();
		// p2���۷����δ� Parent���� ���� ����
		// ���� Child1�� �����ϰ� ������ ��������ȯ�� �ϸ��!!
		((Child1)p2).printChild1();
		
		/*
		 *  * Ŭ�������� ����ȯ ���� (��, ��� �����϶���!!)
		 *  
		 *  1. UpCasting
		 *  �ڽ� Ÿ�� --> �θ� Ÿ������ ����ȯ
		 *  ���� ���� (�ڵ�����ȯ��)
		 *  
		 *  ex) �θ�Ÿ�� = �ڽİ�ü;
		 *      �ڽ�.�θ�޼ҵ�(); 
		 *      
		 *  2. DownCasting
		 *  �θ� Ÿ�� --> �ڽ� Ÿ������ ����ȯ
		 *  ���� �Ұ� (��������ȯ �ؾߵ�! -> ��������� �ۼ��ؾߵ�!)
		 *  
		 *  ex) ((�ڽ�)�θ�).�ڽĸ޼ҵ�();
		 *  
		 */
		
		//Parent p3 = new Child2();
		
		
		// �� �������� ��ߵ�?
		// ���� Child1��ü 2�� �ʿ��ϰ�, Child2��ü 2���ʿ���..
		
		// ������ ���� �� ---
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 3);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		// ������ ���� �� --- 
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 3);
		arr[1] = new Child1(2, 3, 5);
		arr[2] = new Child2(2, 1, 5);
		arr[3] = new Child2(5, 7, 2);
		// �ϳ��� �θ� Ÿ������ �پ��� �ڽİ�ü���� ������ �� �ִ�. 
		// ������ �ڽİ�ü�鿡 ������ �� �ϳ��� �θ�Ÿ������ ���� ���� --> ���ϴ�. �ڵ� ���̰� ����. ������ �ڵ� ����
		
		// �迭[�ε���] �ڷ��� : Parent
		
		System.out.println("=== ������ �����ؼ� ��ü �迭 ===");
		
		// ������ �޼ҵ� ����!
		((Child1)arr[0]).printChild1();
		//((Child2)arr[1]).printChild2(); // ������ ����ִ� �ڽİ�ü�� Ÿ������ ����ȯ�ؾ߸� ��!!
		((Child1)arr[1]).printChild1();
		((Child2)arr[2]).printChild2();
		((Child2)arr[3]).printChild2();
		
		System.out.println("=== �ݺ����� �̿��ؼ� ��� ===");
		
		for(int i=0; i<arr.length; i++) {
			
			/*
			 * instanceof ������
			 * ���� ���۷����� ������ � Ŭ����Ÿ���� �ּҸ� �����ϰ� �ִ��� Ȯ�� �� �� ���
			 * 
			 * ���۷��� instanceof Ŭ����Ÿ��
			 * 
			 * �ش� ���۷����� Ŭ���� Ÿ���� ��ġ�ϸ� true, �ƴϸ� false ��ȯ
			 */
			
			/*
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print();
			
			// �������ε� : ���α׷� ���� ������ �ش� ���۷��� Ÿ���� �޼ҵ�� ã�ư�����
			//			  ���α׷� ���� �Ǹ鼭 ���� �����ϰ� �ִ� Ŭ������ �������̵� �Ǿ����� ���
			//			  �ش� �������̵� �� �޼ҵ带 ã�ư��� ����Ǵ� ����
			
		}
		
		
		
		
		Object[] obj = new Object[3];
		obj[0] = new Parent();
		obj[1] = new Child1();
		obj[2] = new Child2();
		
		
		
		
		
		
		
		
		
		
	}

}
