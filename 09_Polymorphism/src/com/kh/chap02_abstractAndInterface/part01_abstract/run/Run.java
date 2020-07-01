package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class Run {
	
	public static void main(String[] args) {
		
		/*
		 * * �߻�Ŭ���� 
		 * - �̿ϼ� Ŭ����
		 * - �߻�޼ҵ带 ������ Ŭ���� (��, �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�])
		 *   --> �߻�޼ҵ带 ���� Ŭ������ �ݵ�� �߻�Ŭ���� ����ؾߵ�
		 *   --> ��, �߻�޼ҵ尡 ���� ��� �߻�Ŭ���� ����� �� ����!!
		 *   	 --> ��¿��? Ŭ������ ���� ������ �̿ϼ��� �����ΰ� ���� �� (��ü ������ �Ұ��ϰԲ�)
		 * 
		 * - �̿ϼ��� Ŭ������ ������ new�� ���� ��ü ���� �Ұ�!! 
		 *   --> ��, ���۷���(���������� Ÿ��)�δ� ��� ����
		 *       --> ������ �����ؼ� �θ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�°� ����! 
		 *       
		 * * �߻�޼ҵ� 
		 * - �̿ϼ��� �޼ҵ�� �����({})�� �����Ǿ����� ���� �޼ҵ�
		 * - �߻�Ŭ������ ��ӹ޴� �ڽ� Ŭ���������� �ݵ�� �������̵� �ؾߵ�! (������ �ο�)
		 * 	 --> �������̵� ������ ������ ���� �߻�
		 *   --> �޼ҵ� ����� ���ϼ� Ȯ�� ����
		 *   --> ǥ��ȭ�� Ʋ�� ������ �������� ���
		 *   
		 */
		
		//Sports s = new Sports(); // �߻�Ŭ������ ��ü ���� �Ұ�!! ��? �̿ϼ� Ŭ�����ϱ�!!
		Sports s; // ��ü ������ �ȵɻ����� ���۷����δ� ��밡��!! 
		
		// ������ �����ؼ� �ڽ� ��ü �����ؼ� �޾��� �� �ִ�!!
		s = new FootBall();
		s = new BasketBall();
		
		
		Sports[] arr = new Sports[2];
		arr[0] = new FootBall();
		arr[1] = new BasketBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		// �߻�Ŭ������ �߻�޼ҵ带 �̿��ؼ� �ڽ�Ŭ������ �������� �ο��� �� ���� (�߻�޼ҵ� --> ���� �������̵�)
		
	}

}
