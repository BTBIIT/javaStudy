package forexample;

public class ForExample1 {

	public static void main(String[] args) {
		// for문 예제
		int i;
/*
		for(초기식, 조건식, 증감식) {
			반복실행문;
		}
		/*
		for(i=1; i<=10; i++) {	//증감식 : i +=1, ++i, i=i+1
			System.out.print(i + " ");	
		}
		System.out.println();
		System.out.println("i값 : " + i);
		for(i=10; i>=0; --i) {
			System.out.print(i + " ");
		}
		System.out.println("i값 : " + i);
		
		//0부터 90까지 10씩 증가하며 출력하고 싶다
		for(i=0; i<=90; i+=10) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(i=3; i<=100; i+=3) {
			System.out.print(i + " ");
		}

		
		
			1 ~ 10
			11 ~ 20
			21 ~ 30
			...
			91 ~ 100
		 
		
		for(i=1; i<=91; i+=10) {
			System.out.println(i+ " ~ " + (i+9));
			System.out.printf("%3d ~ %3d\n",i,i+9);
		}
	
	 2 * 1 = 2
	 2 * 2 = 4
	 ...
	 2 * 9 = 18	
 
		for(i=1; i<=9; i+=1) {
			System.out.println("2 x " + (i) + " = " + i*2);
			System.out.printf("2 * %d = %2d\n",i , (i*2));
		}	
	
		// 합계를 구할 변수
		int sum = 0;
		// 100 ~ 500까지의 합계는 []입니다. (1씩 증가)
		for(i = 100; i<=500; i++) {
			sum = sum+i;
		}
	System.out.println("100부터 500까지의 합계는 " + sum + " 입니다.");

		//1 ~ 100 까지의 범위에서 3의 배수 합계는 %d입니다. \n
		int sum1 = 0;
		int totalInt = 0;
		for(i=0;i<=100;i+=3) {
			if(i%2 !=0) {
				System.out.print(i + "");
				sum1 +=i;
				totalInt ++;
			}
	}
	System.out.println();
	System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, 2의 배수가 아닌 수의 합계는 %3d입니다.\n",sum1);
	System.out.printf("1 ~ 100 까지의 범위에서 3의 배수, 2의 배수가 아닌 수의 개수는 %3d입니다.\n",totalInt);
*/	
	/***************************
	 0도 ~ 100도까지의 섭씨 온도를 화씨 온도로 변환한 표를 작성해보자.
	 섭씨 온도는 5도씩 증가하며 출력한다
	 화씨온도 = (섭씨 온도 * 1.8) + 32
	 ***Celsius 온도 => Fahrenheit 온도 환산표
	 ****************************/
	
	int celsius;
	double fahrenheit;
	for(celsius=0; celsius<=100; celsius += 5) {
		fahrenheit = (celsius * 1.8) + 32 ;
		System.out.printf("%-5d => %8.2f\n", celsius, fahrenheit);
	}
		
	}

}
