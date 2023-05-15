### 배열

같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

**배열 선언** : 배열의 타입을 지정하여 알맞은 크기의 저장 공간 확보, 이름 짓기

(생성된 배열을 다루기 위한 참조변수를 위한 공간을 확보하는 것)

```java
타입[] 변수이름;   int[] score;
타입 변수이름[];   int score[];

두 방법 모두 가능하다.
```

**배열 생성** : 값을 저장할 수 있는 공간을 만듦

```java
변수이름 = new 타입[길이];
score = new int[5]
```

**배열 초기화** : 값을 저장

```java
int[] score = new int[5]
score[0] = 50;

for(int i = 0; i < score.length; i++){
		score[i] = i * 10 + 50;
}

int [] = {50, 60, 70, 80, 90}

int [] score;
// score = {50, 60, 70, 80, 90} 선언과 생성을 따로 하는 경우에는 new int[]를 생략할 수 없다. 
score = new int[] {50, 60, 70, 80, 90}

int [] score = new int[0];
int [] score = new int[]{};
int [] score = new int{};
// 세 배열은 모두 길이가 0인 배열이다.

```

배열 선언과 생성, 초기화는 동시에 가능하다

직접 초기화하지 않으면 자신의 타입에 해당하는 기본값으로 자동 초기화 된다.

배열의 요소 하나하나에 직접 값을 저장할 수 있지만 for문을 이용하는 것이 간편하다.

일정한 규칙이 없는 경우에는 {}를 사용하여 초기화 할 수 있다.

### 인덱스

배열의 요소 : 생성된 배열의 각 저장공간으로 배열이름[인덱스]의 형식으로 접근가능하다.

인덱스의 범위 :  0 ~ ‘배열길이 - 1’

### 배열 길이

배열 길이의 범위 :  0 ~ 약 20억

배열이름.length로 배열 길이를 알 수 있다.

**배열 길이의 변경**

1. 더 큰 배열을 새로 생성한다.
2. 기존 배열의 내용을 새로운 배열에 복사한다.

### 배열의 출력

for문을 이용해서 간단히 출력할 수 있다.

더 간단한 방법은 Arrays.toString(배열이름)의 메서드를 사용하여

[첫번째 요소, 두번째 요소, …]형식으로 출력이 가능하다.

char배열을 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력 된다.

### 배열의 복사

for문으로 복사가 가능하지만 arraycopy메서드를 사용하는 것이 더 효율적이다.

```java
System.arraycopy(num,0, newNum, 0, num.length);

num[0]에서 newNum[0]으로 num.length개의 데이터를 복사
```

### 배열의 활용

- 총합과 평균
- 최대값과 최소값
- 섞기
- 임의의 값으로 배열 채우기
- [정렬하기](https://www.notion.so/40115bd138f94903a95715d1220d4bbe)
- [빈도수 구하기](https://www.notion.so/aac7be494ef74c5a98cd59dec806db4a)

### String배열

[변수 타입에 따른 기본 값](https://www.notion.so/02-Variable-5b9e9f4a90a54aebaca8762313ffe080)

String 클래스는 char 배열에 기능(메서드)를 추가한 것이다.

| 메서드 | 설명 |
| --- | --- |
| char charAt(int index) | 문자열에서 해당 위치(index)에 있는 문자를 반환한다. |
| int length() | 문자열의 길이를 반환한다. |
| String substring(int from, int to) | 문자열에서 해당 범위(from~to)에 있는 문자열을 반환한다. (to는 범위에 포함되지 않음) |
| boolean equals(Object obj) | 문자열의 내용이 obj와 같은지 확인한다. 같으면 결과는 true, 다르면 false가 된다. |
| char[] toCharArray() | 문자열을 문자배열(char[])로 변환해서 반환한다. |

### 다차원 배열

배열안의 배열을 뜻한다.

주로 2차원 배열까지 사용되지만 그 이상의 차원도 가능하다.

**배열 선언**

```java
타입[][] 변수이름;    int [][] score;
타입 변수이름[][];    int score [][];
타입 [] 변수이름 [];  int [] score [];

세 방법 모두 가능하다.
```

**배열 생성**

```java
변수이름 = new 타입[행의 길이][열의 길이];
score = new int[4][3]
```

**배열 초기화**

```java
int[] score = new int[4][3]
score[0][0] = 50;

for(int i = 0; i < score.length; i++){
		for ( int j = 0; j < score[i].length; j++) { 
					score[i][j] = 10;
				}
		}

int [][] score  = {{100,100,100},
										{20,20,20},
										{10,10,10}}
```

2차원 배열에서 [향상된 for문](https://www.notion.so/04-7a51d866944140a5a4936855d3173f8e)을 사용할 때는 아래와 같이 사용한다.

```java
for ( 타입[] 변수명 : 배열 또는 컬렉션){
        for(타입 변수명:배열 또는 컬렉션){
        //반복할 문장
        }
}
```

### 가변 배열

2차원 이상의 다차원 배열을 생성할 때 전체 배열 차수 중 마지막 차수의 길이를 지정하지 않고, 추후에 각기 다른 길이의 배열을 생성하여 가변 배열을 구성할 수 있다.

### 다차원 배열의 활용

- [좌표에 X표하기](https://www.notion.so/dca9db4c6b19433aac4d0f9f8a8b3fee)
- [빙고](https://www.notion.so/33723dd1993845469e90ca333dd3b503)
- 행렬의 곱셈
- 단어맞추기