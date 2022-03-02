package kh.java;
//연관된 클래스 묶음. 디렉토리로 표현
//클래스의 실제이름은 패키지를 포함. = kh.java.HelloWorld
//패키지명은 단어단위로 끊어쓸 것. =my.friend
//모두 소문자로 작성할 것.
//클래스를 고유하게 관리하기 위해서 패키지명 또한 url을 뒤집어서 고유하게 만든다.
//예를 들어 com.kh.java  com.facebook.app -> 3레벨이상 사용하는 것을 추천.
//java로 시작하는 메소드명은 안됨

public class HelloWorld {
	//클래스 이름은 늘 대문자로 시작함
	//연결된 단어의 첫글자는 다시 대문자로 시작 "HelloWorld"
	//myfavoriteapp -> MyFavoriteApp (관례상)

	
	public static void main(String[] args) { //메인메소드라고 부름. 자바 프로그램의 시작과 끝이라고 할수잇음
		System.out.println("HelloWorld~~~~"); 	//출력문, 모든 명령은 ;로 종결됨! 
	//객체 사용법(레시피)
	//클래스가 재료고, 객체가 결과라고 생각하기
	//클래스를 객체로 만드는거기 때문
	//클래스명 변수명 = new 클래스명();
	//변수명은 아무거나 해도 상관없음. 나머지는 다 그대로!
	//객체를 만들어놓으면 다른 메소드를 호출 가능
	HelloWorld hw = new HelloWorld();
	//밑은 메소드 선언!
	//선언만 해서는 아무일도 일어나지 않고, 선언 후 호출해야 실행된다.
	//메소드 호출 : 객체변수.메소드명();
	hw.test1();
	hw.test2();
	System.out.println("안녕~~~!");
	}
	
	public void test1() {
		System.out.println("test1~~~~~");
	}
		
	public void test2() {
		System.out.println("test2~~~~");
		System.out.println("abc"+ 1 + 2 + 3);
		System.out.println(1 + 2 + 3 +"abc");
	}
}	
	
	
	//한줄주석
   //	단축키는 컨트롤 +/
	/*
	 여러줄 주석
	 */
	/**
	 * java doc 주석
	 * 프로그램 문서를 만들 때 사용하는 주석
	 * 
	 */

	/**
	 * 값 Literal
	 * ("값");
	 * 값에 들어갈 수 있는것.
	 * 정수(123); 실수(34.5); 논리값 (true,false소문자로);
	 * 문자('한'); 문자열("여러개"); 계산식(12 + 34);-> 계산 수행 후 계산결과를 println메소드에 전달!
	 * 계산은 + - / % * 오칙연산 가능! (단, 나누기했을 때 나머지까지 나오지 않고, 몫만 나옴)
	 * 문자열 더하기 연산 - 연결연산 가능("abc" +123)= abc123
	 * 왼쪽에서 오른쪽으로 실행되기 때문에
	 * ("abc"+ 1 + 2 + 3) = abc123
	 * (1 + 2 + 3 +"abc")= 6abc
	 */
	