package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {
	
	public static void main(String[] args) {
		Circle[] cir = new Circle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		
		
		Rectangle[] rec = new Rectangle[2];
		
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Circle c : cir) {
			c.draw(); // �θ��� draw �޼ҵ尡 �ƴ� �ڽ��� draw �޼ҵ尡 ����
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rec) {
			r.draw(); // �θ��� draw �޼ҵ尡 �ƴ� �ڽ��� draw �޼ҵ尡 ����
		}
		
		
		/*
		 * * ����� ����
		 * 1. ���� ���� ���� �ڵ�� ���ο� Ŭ���� �ۼ� ����
		 * 2. �ڵ带 ���������� �����ϱ� ������ �ڵ��� �߰��� ���濡 ����
		 * 3. �ڵ��� �ߺ��� �����Ͽ� ���α׷��� ���꼺�� ���������� ũ�� �⿩
		 * 
		 * * ����� Ư¡
		 * - Ŭ������ ��� ���� ���� ���� ��Ӹ� �����ϴ� (�θ�� �ϳ�!)
		 * - ��õǾ����� ������ ��� Ŭ������ Object Ŭ������ �ļ��̴�. 
		 *   --> ��, Object Ŭ������ �����ϴ� �޼ҵ���� ����� �� �ְ�
		 *       �������̵��Ͽ� �޼ҵ� ���ۼ��� �����ϴٴ� ����!
		 * - �θ�Ŭ������ ������, �ʱ�ȭ����� ����� �ȵȴ�. (�ڽ�Ŭ���� ������, �θ� Ŭ���� �����ڰ� ���� ����)
		 * - �θ��� private ���(�ʵ�,�޼ҵ�)�� ����� ������ ���� ���� �Ұ��ϴ�. (��, protected�� �ϰԵǸ� �ļ�Ŭ������ ���� ���� ����)
		 * - --> setter/getter�� �̿��Ͽ� ����
		 */
		
		
	}

}
