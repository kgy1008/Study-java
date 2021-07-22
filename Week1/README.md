## 자바 기본 익히기

 ### 1. 변수와 자료형
![](https://images.velog.io/images/kgy1008/post/12c8bbe5-7765-439b-8c03-a21f5709127f/image.png)

c언어의 자료형과 거의 차이가 없으며 각각의 자료형은 사용하는 메모리 크기와 방식이 다르다.
자바 언어는 기본적으로 정수를 int 실수를 double 형태로 저장한다.

 #### ** **주의사항🙌****
1.  int의 값의 범위가 넘어가는 값을 자료형 long을 이용해 변수에 대입할 때, 8바이트로 저장하기 위해 아래와 같이 맨 뒤에 L을 붙인다.
```
package [패키지 명];

public class [클래스 명] {
   public static void main(String[] args) {
      long num = 12345678900L;
      System.out.println(num);
   }
}
```

2. 자바 언어는 위에서 언급했듯이 실수를 double 자료형으로 저장한다, 따라서 float 자료형을 사용할 때는 아래 예시와 같이 숫자 뒤에 F를 붙여주어야 한다.
```
public class [클래스 명]{
   public static void main(String[] args) {
      float num = 12.87F; // 소문자 f를 사용하여도 무방
      System.out.println(num);
   }
}
```
<hr />

### 2. 변수 선언
변수명을 짓는 방식이나 제약은 우리가 배웠던 C언어와 동일하다.
- 변수의 이름은 알파벳, 숫자, _, $로 구성된다.
- 대소문자를 구분한다.
- 변수의 이름은 숫자로  시작할 수 없고, 키워드도 변수의 이름으로 사용할 수 없다.
- 이름 사이에 공백이 있을 수 없다.
- 변수의 이름을 정할 때는 변수의 역할에 어울리는, 의미 있는 이름을 짓는 것이 좋다.



#### **자료형 없이 변수 사용**
var 을 통해 선언해준다.  —> 대입되는 값을 보고 컴파일러가 자료형을 추론
다만 이의 경우 해당 자료형의 타입의 변경이 불가능하며 지역변수만 사용이 가능하다. 
```
public class [클래스 명]{
   public static void main(String[] args) {
      var num = 10;
   }
}
```
위의 코드에서 컴파일러가 10이라는 대입인자를 보고 변수 num의 자료형을 int로 고정시킨다. 때문에 후에 변수 num에 문자 형태나 자료형 범위 이상의 값을 대입할 경우 오류가 발생하게 된다.



#### **상수**
상수는 변하지 않는 값을 의미하며 **final** 키워드를 통해 선언한다.
```
public class [클래스 명]{
   public static void main(String[] args) {
      final int num = 10;  
    // 이때 num의 값에 다른 값을 대입할 수 없다
   }
}
```
프로그램 내에서 변경되지 말아야하는 값을 선언해야 할 때 주로 사용한다. 



#### **형 변환(Type Conversion)**
서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어난다.
- 묵시적 형 변환

작은 수에서 큰 수로 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
```
int x = 3;
long num = x; // int값에서 long으로 자동 형 변환
```
- 명시적 형 변환

묵시적 형 변환의 반대의 경우
변환 되는 자료형을 명시하지 않을 경우 자료의 손실이 발생할 수 있다.
```
double Num = 3.14;
int num = (int) Num // 명시적 형 변환 
```
위의 예시의 경우 명시적 형 변환을 통해 소수점 값을 버리고 num에 3을 대입하였다.
```
double num1 = 9.8;
float num2 = 0.3F;

int result1 = (int)num1 + (int)num2;
int result2 = (int)(num1+num2);

System.out.println(result1);  // 결과:9
System.out.println(result2);  // 결과:10
```
위는 명시적 형 변환을 통해 변수 result1과 result2에 값을 대입한 과정을 나타낸 것이다.  
하지만 둘의 결과 값이 차이가 나는 이유는 명시적 형 변환을 한 과정에 차이를 보이기 때문이다.

**result1**의 경우 변수 num1과 변수 num2의 값을 각각 변환해주어 결과적으로 9+0이 계산되었고 **result2**의 경우 num1과 num2가 합한 값인 10.1에 형 변환을 해주어 10이 출력된 것이다.
<hr />

### 3. 연산자
java의 연산자는 C 언어와 동일하다.

#### ***연산자 종류***
- 산술연산자

  +, -, *, /, %  등

- 관계 연산자

  <,>,>=, <=, == 등

- 논리 연산자

  &&, ||, ! 

- 복합 대입 연산자

   +=, -=, *=, /=, %= 등

- 조건 연산자

  조건식 ? 결과 1 : 결과 2;
  조건식이 참일 경우 결과 1을, 거짓일 경우 결과 2를 수행한다.
```
int num = (4 < 1) ? 5 : -1;  
System.out.println(num);  // 조건식이 항상 거짓이므로 num의 값은 -1이 된다.
```
해당 조건식이 참일 때 결과 1을 거짓일 때 결과 2를 실행한다.
- 증가/감소 연산자
```
int num1 = 10;
System.out.println(num1++);  // 10
System.out.println(num1);    // 11

// num++의 경우 선 대입 후 1 증가
// 따라서 10이 먼저 출력된 후 1이 증가되게 되고 그 다음 코드에서는 11이 출력된다.

int num2 = 10;
System.out.println(++num2);  // 11
System.out.println(num2);    // 11

// ++num의 경우 선 1 증가 후 대입
// 따라서 1이 증가된 상태로 코드가 실행되어 두 줄의 코드 모두 11이 출력되게 된다.
```
- 비트 연산자

  정수에만 사용이 가능하다. 
  컴퓨터는 2진법을 사용한다는 점을 이용하여 값을 계산하는데 사용하는 것이 비트 연산자이다.  
  ~, &, |, ^, << , >> 등
```
int num1 = 4; // 5를 이진법의 형태로 나타내면 00000100
int num2 = 9; // 10을 이진법의 형태로 나타내면 00001001

int result = num1 | num2; // result의 값: 0001101 (10진법으로 변환하면 13)

System.out.println(result); // 13 
```

#### ***연산자 우선 순위***
![](https://images.velog.io/images/kgy1008/post/612c0e88-aab4-496c-9951-01609fb8b731/image.png)

연산자의 계산 순서는 위 사진의 순서를 따른다.

<hr />

### 4. 제어흐름
#### 조건문
- if 문
```
int entrance_year = 20;
if (entrance_year == 20){
   System.out.println("우리는 동기");
}
else if (entrance_year > 20){
   System.out.println("파릇파릇한 후배");
}
else {
   System.out.println("화석이 되어가는 중..ㅠㅠ");
}
```
- switch 문

조건에 대한 값이 하나의 값(정수, 문자열)으로 표현이 될 수 있을 때 주로 사용
```
char grade = 'A';

switch (grade){
   case 'A': System.out.println("사랑해요. 교수님");
                  break;
   case 'B': System.out.println("교수님 미워");
                  break;
   case 'C': System.out.println("이번학기 망했어요");
                  break;
   case 'D': System.out.println("전 이런 알파벳 모릅니다");
                  break;
   default: System.out.println("함께해요~ 즐거운 재수강");
                  break;
}
```

#### 반복문
- while 문

 하나의 조건에 대해 반복수행이 이루어질 때 주로 사용
- do while문

 whlie문과 다르게 do while문은 수행문을 먼저 한번 수행한 후 조건식을 체크한다.
수행문이 반드시 한 번 이상 수행되어야 하는 경우 주로 사용
```
int num = 1;
int sum = 0;

do {  
   sum += num;
   num++;  
}while(num<1);  // 조건식을 만족하지 못하지만 sum += num 이라는 수행문을 먼저 수행하기 때문에 sum = 1이 된다.

System.out.println(sum);  // 1
```
- for 문

특정 범위 내 반복을 하거나 조건의 제약이 횟수일 경우 주로 사용

> **부록❤**
> - continue 문
> continue 사용 시, 그 아래 코드들의 내용을 수행하지 않고  반복문으로 돌아가게 된다.
> ```
>  // continue 사용 예시
> int total = 0;
> 
> for (int num = 1; num <= 100; num++){
>   if (num%2 != 0) {  //홀수
>       continue;  // 홀수일때 X의 코드를 실행하지 않고 다시 반복문으로 돌아간다. 
>    }
>    total += num;  // X 
> }
> ```
>
> - break 문
> 더 이상 반복을 수행하지 않고 반복문을 빠져나온다.
> ```
> int sum = 0;
> while (true){
>    if (sum > 50) {
>       break;  // 무한루프에서 탈출할 수 있다.
>    }
>    sum += 2;
> }
> ```
