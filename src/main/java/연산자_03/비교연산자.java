package 연산자_03;

public class 비교연산자 {

	public static void main(String[] args) {

		// 비교 연산시 주의할 점
		// -------------------------------------------------------------------- //
		// 1. double과 float를 비교할 때는 double을 float로 형변환 후 비교해야 안전하다
		float f1 = (float) 0.1;
		double d1 = 0.1;

		boolean isEqual1 = (f1 == d1);
		System.out.println("isEqual1 = " + isEqual1); // false

		float f2 = (float) 0.125;
		double d2 = 0.125;
		boolean isEqual2 = (f2 == d2);
		System.out.println("isEqual2 = " + isEqual2); // true

		// 기대값: isEqual1, isEqual2 모두 true
		// 결과  : isEqual2만 true
		// 이유  : 0.1을 2진수로 변환로 변환하는 과정에서 오차가 발생하기 때문
		//        0.1을 2진수로 표현하면 0.00011001100110011.... (계속 0011이 반복됨)
		//        그런데 0.125를 2진수로 변환하면 0.001로 딱 떨어지기 때문에 오차가 발생하지 않음
		// 해결  : double을 float로 변환한 후에 (일부러 오차를 발생시킴) 비교


		// 2. 문자열을 비교 할 때는 equals()을 써야한다.
		String str1 = "123";
		String str2 = "123";
		System.out.println("str1 == str2 is " + str1==str2);
		System.out.println("str1.equals(str2) is " + str1.equals(str2));

		// 기대값: 둘다 true
		// 결과 : equals()로 비교한 것만 true
		// 이유 : String은 객체이기 때문에 ==로 비교하면 객체의 주소값을 봄.
		//       str1과 str2는 다른 객체이기 때문에 당연히 주소값이 달라서 false 임
		//       equals()는 문자열이 같은지를 확인하기 때문에 true임
		// 결론 : 문자열을 비교할 때는 equals()를 사용하자.

	}
}
