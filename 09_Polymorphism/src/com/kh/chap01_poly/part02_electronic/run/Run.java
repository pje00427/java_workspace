package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {
	
	public static void main(String[] args) {
		
		// 납품업체
		// 1. 다형성 적용 안했을 때-----------------------------
		/*
		ElectronicController ec = new ElectronicController();
		
		// 용산전자상가에 새 데스크탑, 노트북, 태블릿 납품할꺼임!!
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 1800000, 3));
		ec.insert(new Tablet("Apple", "아이패드프로", 2500000, true));
		
		// 가게에 초기화된 물건들의 정보를 조회할꺼임!!
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		// ----------------------------------------------
		
		ElectronicController2 ec = new ElectronicController2();
		
		// 값 추가하는 요청
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 1800000, 3));
		ec.insert(new Tablet("Apple", "아이패드프로", 2500000, true));
		
		// 값 조회하는 요청
		Desktop d = (Desktop)ec.select(0);
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		Electronic[] elec = ec.select();
		
		System.out.println("====  반복문으로 출력 ====");
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
		
		// 다형성 적용하는 이유
		// 1. 부모타입의 객체 배열로 다양한 자식들을 받아줄 수 있다.
		//    부모타입 하나로 다양한 자식들을 다룰 수 있다.
		// 2. 매개변수에 다형성을 적용하게 되면 메소드 갯수를 줄일 수 있다.
		
	}

}











