package 연산자_03;
public class 이항연산자 {
	public static void main(String[] args) {
		// 이항 연산자는 두 피연자의 타입이 일치해야 연산이 가능함
		// 보통 더 큰 타입의 연산자로 일치 시킴
		//		값의 손실을 최소화하기 위함

		// 예제1
		System.out.println(3.4f + 10); // 3.4f + 10.0f = 13.4f
		// 연산 결과는 피연산자의 타입과 일치함
		//	그래서 13.4

		// 예제2
		System.out.println(10 == 10.0f); // 10.0f == 10.0f
		// 비교 연산자도 이항 연산자.
		// 그래서 피연산자의 타입을 맞춘 후에 연산함.

		// 예제3
		System.out.println('A' == 65); // 65 == 65
		// char 타입은 유니코드가 저장되어 있음
		// 그래서 비교 시 65로 변환해서 비교함.







	}
}
