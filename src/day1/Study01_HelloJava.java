package day1;

import java.util.Scanner;

/*
클래스    ----------- java파일명과 클래스의 이름은 동일해야한다
   class 클래스명 {         
      필드(멤버변수)            
      생성자( )
      메소드( )
   }
   
입출력
   . 입력: Scanner scaner = new Scanner(System.in);  - 스캐너준비
          String 변수 = scanner.next() - 문자를 읽는다.
          int    변수 = scanner.nextInt() - 정수를 읽는다.
          long   변수 = scanner.nextLong() - 더 큰 정수를 읽어올수 있다.
          float  변수 = scanner.nextFloat() - 실수를 읽는다.
          double 변수 = scanner.nextDouble() - 더 큰 실수를 읽는다.
             
          
   . 출력: sysout(단축어)
          System.out.println("값");   - 줄바꿈이 된다(개행이 된다)
          System.out.print("값");     - 줄바꿈이 안된다(개행이 안된다)
          System.out.printf("%s님의 나이는 %d살이고 몸무게는 %.1fkg입니다","홍길동",30,75.6) - 줄바꿈이 안된다
                           %s:문자열, %c: 문자,  %f 실수, %d: 정수
         System.out.println(name+"님의 나이는"+ age+"살이고 몸무게는 " +weight+"kg입니다") 

기본내용
  . 자바는 대소문자를 구분한다 :   ex)  name 과 Name은 다른다, student와 Student는 다르다
  . 문자 (char) - 한글자  'a' "a",  문자열(String) - 두글자이상 "ab", 숫자 - 따옴표가 없다
  . 문자 + 숫자 => 결합 : ex)  "2000"+2025 = "20002025" (숫자+숫자=연산)
  . 문자 + 문자 => 결합
  . 숫자 + 숫자 => 연산(숫자계산이된다)
  . 식별자 : 우리가 작명하는 이름 >> 변수,     클래스이름,               메서드이름 
                               (소문자)  StudentScore(대문자시작)  (소문자시작)
                            >> 상수
                               (대문자로만한다) - py(x),  PY(o)
                            
            - 숫자로 시작할 수 없다.(첫글자)
            - 예약어(자바프로그램에서 사용하는 단어)는 사용할 수 없다.
            - 특수문자는  '_','$'만 사용가능하다. 
            - 길이제한은 없다. 
            - 목적을 나타내는 이름을 붙여라.  --- > 가독성을 높이기 위해서 
  
변수
  . 변수는 데이터를 저장하는 공간이다                [100]
  . 변수는 우리가 변수명을 설정해야한다.                x  ---->  int  x = 100
  . 변수는 반드시 한번 선언하고 사용해야 한다.                          x = 200
  . 변수는 하나의 값만 저장한다. 
  
데이터타입 종류
1) 기본데이터 타입
  . 불린(boolean) : 참과 거짓 - true,false                       [ b ]
  . 문자          : char ----------------- > char a = 'b'; -- >  a
  . 정수          : short, [int] , long
  . 실수          : float, [double]      --- > double value = 3.15;
                                                     value = 2.25;
 2) 참조데이터 타입
  . 배열, 클래스 (String)
                                                   
                                                   
활용
              데이터타입   변수명   =  값;
              -----------------------
              데이터타입   변수명 ;
              변수명 = 값;
              
*/

public class Study01_HelloJava {
	public static void main(String[] args) {

//1.println()  - 줄바꿈이 된다(개행이된다)
		System.out.println("하나");
		System.out.println("두울");
		System.out.println("세엣");

		System.out.println(); // 구분하기 위해 사용

//2.print() - 줄바꿈이 안된다(개행이 안된다)
		System.out.print("하나");
		System.out.print("두울");
		System.out.print("세엣");

		System.out.println();

// 1) 직접값을 대입한 경우
//String name = "홍길동";
//int    age  = 30;
//float  weight = 75.345f;

// 4. 콘솔에서 입력받을때 스캐너를 사용한다
// 2) 외부에서 값을 입력받아서 대입한 경우
		Scanner scanner = new Scanner(System.in); // 스캐너준비

		System.out.println("이름>>");
		String name = scanner.next(); // next()는 문자를 읽어온다
		System.out.println("나이>>");
		int age = scanner.nextInt(); // nextInt()는 정수를 읽어온다
		System.out.println("몸무게>>");
		float weight = scanner.nextFloat(); // nextFloat(),nextLong()는 실수를 읽어온다.

		scanner.close();

		System.out.printf("%s님의 나이는 %d살이고 몸무게는 %.1f kg입니다", name, age, weight);

//3. printf() - 문자형식을 만들어서 사용할수있다. 개행이 안된다.

	}
}
