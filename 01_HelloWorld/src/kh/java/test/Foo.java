package kh.java.test;


import kh.java.test.other.Other;
import java.util.Date;
import java.util.*; //Java.util 패키지의 모든 클래스를 import

public class Foo {

	public static void main(String[] args) {
		
		//객체레시피
		//클래스 -> 객체 -> 메소드호출
		//같은 클래스의 메소드
		Foo foo = new Foo();
		foo.test1();
		
		//다른 클래스의 메소드
		//Bar #test2 
		Bar bar = new Bar();
		bar.test2();
		
		//다른 패키지의 클래스 메소드
		//kh.java.other.Other #test3 
		Other oth = new Other();
		oth.test3();
		
		//jdk가 제공하는 다른 패키지클래스 사용하기
		//java.util.Date
		Date now = new Date();
		System.out.println(now);
		
		ArrayList al = new ArrayList();
		
	}
	
	public void test1() {
		System.out.println("안녕~");
	}
	
}
