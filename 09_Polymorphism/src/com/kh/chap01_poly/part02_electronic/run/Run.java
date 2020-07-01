package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {
	
	public static void main(String[] args) {
		
		// ��ǰ��ü
		// 1. ������ ���� ������ ��-----------------------------
		/*
		ElectronicController ec = new ElectronicController();
		
		// ������ڻ󰡿� �� ����ũž, ��Ʈ��, �º� ��ǰ�Ҳ���!!
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 1800000, 3));
		ec.insert(new Tablet("Apple", "�����е�����", 2500000, true));
		
		// ���Կ� �ʱ�ȭ�� ���ǵ��� ������ ��ȸ�Ҳ���!!
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		// ----------------------------------------------
		
		ElectronicController2 ec = new ElectronicController2();
		
		// �� �߰��ϴ� ��û
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 1800000, 3));
		ec.insert(new Tablet("Apple", "�����е�����", 2500000, true));
		
		// �� ��ȸ�ϴ� ��û
		Desktop d = (Desktop)ec.select(0);
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		Electronic[] elec = ec.select();
		
		System.out.println("====  �ݺ������� ��� ====");
		for(int i=0; i<elec.length; i++) {
			//System.out.println(elec[i]/*.toString()*/);
			
			if(elec[i] instanceof Desktop) {
				System.out.println(((Desktop)elec[i]).getGraphic());
			}else if(elec[i] instanceof NoteBook) {
				System.out.println(((NoteBook)elec[i]).getUsbPort());
			}else {
				System.out.println(((Tablet)elec[i]).isPenFlag());
			}
		}
		
		// ������ �����ϴ� ����
		// 1. �θ�Ÿ���� ��ü �迭�� �پ��� �ڽĵ��� �޾��� �� �ִ�.
		//    �θ�Ÿ�� �ϳ��� �پ��� �ڽĵ��� �ٷ� �� �ִ�.
		// 2. �Ű������� �������� �����ϰ� �Ǹ� �޼ҵ� ������ ���� �� �ִ�.
		
	}

}











