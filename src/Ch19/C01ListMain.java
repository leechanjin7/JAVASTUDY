package Ch19;

import java.util.ArrayList;
import java.util.List;

//CRUD(Create, Read, Update, Delete)
//삽입
//조회
//수정
//삭제

public class C01ListMain {
	
	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		//추가, 삽입
		l1.add("HTML/CSS/JS");
		l1.add("React");
		l1.add("Redux");
		l1.add("Typescript");
		l1.add("Mysql");
		l1.add("JAVA");
		l1.add("JSP/Servlet");
		l1.add("SpringFramework");
		l1.add("SpringBoot");
		l1.add("Git/Github");
		l1.add("AWS");
		l1.add("AWS");
		
		//조회
		System.out.println("개수 확인 : " + l1.size());
		System.out.println("1 idx의 값 : " + l1.get(1));
		System.out.println("JAVA가 저장된 idx : " + l1.indexOf("JAVA"));
		//삭제
		l1.remove(0);
		l1.remove("Mysql");
		System.out.println("------------------");
		
		for(String el : l1) {
			System.out.println(el);
		}
		
		//전체삭제
		l1.clear();
		
	}

}
