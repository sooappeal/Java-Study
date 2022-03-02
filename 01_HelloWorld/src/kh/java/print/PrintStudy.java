package kh.java.print;

public class PrintStudy {

	public static void main(String[] args) {
		PrintStudy study = new PrintStudy();
		study.test1();
		study.test2();
	}
	/**
	 * Escape 문자
	 * - 인쇄할 수 없거나 키보드 출력불가한 문자를 표현할 때 사용
	 * - 역슬래시 + 문자 로 사용할 수 있음
	 * \n 개행문자
	 * \t 탭
	 * \" 문자 문자그대로의 쌍따옴표 (문자열의 시작과 끝을 의미하는게 아니라 그대로)
	 * \\ 문자그대로의 \ (Escape 문자의 시작을 의미하는게 아니라 그대로)
	 */
	public void test2() {
		System.out.println("안\t녕\t하\t세\t요");
		System.out.println("안    녕    하    세    요");
		
		System.out.println("그는 말했다. \"잘가~\"");
		
		System.out.println("C:\\Workspaces\\Java_workspace\\01_HelloWorld");
		
	}
	/**
	 * println 메소드
	 * : 내용을 출력 후 개행처리
	 * print 메소드
	 * : 내용을 출력 후 개행처리 X
	 * ln은 내용 출력 후 개행처리하기 때문에 앞선 것에 ln 쓰면
	 * 자동으로 커서가 넘어가잇음.
	 * 개행문자는 \n = ln
	 */
	 
	public void test1() {
		System.out.print("가나다");
		//sysout+ctrl+spacebar 자동완성됨
		System.out.println("라마바사");
		System.out.print("아\n");
		System.out.print("자\n\n\n");
		System.out.print("차\n");
		
	}
}
