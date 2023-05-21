## 예외처리(exception handling)

### 프로그램 오류

**컴파일 에러** :  컴파일 시에 발생하는 에러 @

**런타임 에러** : 실행 시에 발생하는 에러

**논리적 에러** : 실행은 되지만, 의도와는 다르게 동작하는 것

**에러(error)** : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류

**예외(exception)** : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류

Exception클래스에 여러 예외 클래스와 RuntimeException클래스가 포함된다.

하지만 RuntimeException은 프로그래머의 실수로 발생하고, 나머지 Exception들은 사용자의 실수와 같은 외적인 요인에 의해 발생하기 때문에 구분한다.

**Exception 클래스 (checked예외)** : 처리하지 않으면 컴파일 에러 발생

**RuntimeException 클래스 (unchecked예외)** : 컴파일 에러는 발생하지 않지만 런타임 에러가 발생

### 예외처리

**정의** : 프로그램 실행 시 발생할 수 있는 예외에 대비한 코드를 작성하는 것

**목적** : 프로그램의 비정상적인 종료를 막고, 정상적인 실행상태를 유지하는 것

## 예외처리하기 1 - try-catch문

```java
try {
								//예외가 발생할 가능성이 있는 문장들
} catch (Exception1 e1) {
								//Exception1이 발생할 경우, 이를 처리하기 위한 문장들
} ...catch문은 여러개 사용 가능하다.
```

**printStackTrace()** : 예외 발생 당시의 호출스택에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.

**getMessage()** : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

### 멀티 캐치블럭

```java
try {
} catch (Excaption A | Excaption B e) {}
```

‘|’기호로 예외 클래스를 연결할 수 있다. 연결 개수에는 제한이 없다.

### 예외 발생시키기

```java
Exception e = new Exception();
throw e;
↓
throw new Exception();
```

Exception인스턴스를 생성할 때, 생성자에 String을 넣어주면 이 String이 Exception [인스턴스에 메시지로 저장](https://www.notion.so/08-Exception-Handling-c4b4711562e9449096cd08604128700c)된다.

## 예외처리하기 2 - 메서드에 예외 선언하기

```java
void method() throws Exception1, Exception2, ...{
}
```

메서드 내에 발생할 수 있는 예외(Exception클래스 예외)를 메서드 선언부에 적어준다.

[JavaAPI문서](https://docs.oracle.com/javase/7/docs/api/index.html)에서 메서드에서 발생할 수 있는 예외를 찾을 수 있다.

예외를 직접적으로 처리하는 것이 아니며, 메서드를 호출한 메서드에 예외처리를 떠넘기는 방식이다.

예외가 발생한 메서드 내에서 자체적으로 처리해도 되는 것은 메서드 내에서 처리하고, 메서드에 호출 시 넘겨받아야 할 값을 다시 받아야 하는 경우에는 예외를 메서드에 선언해서, 호출한 메서드에서 처리해야 한다.

### finally 블럭

예외의 발생여부에 상관없이 실행되어야 할 코드를 포함한다.

try-catch-finally 형태로 사용한다. try나 catch문에 return문이 있어도 finally블록의 문장들이 수행된 후에 메서드가 종료된다.

## 예외처리하기 3 - 자동 자원 반환 - try-with-resources문

입출력에 사용되는 클래스 중 어떤 것들은 사용했던 자원들을 반환하기 위해서 사용후에 꼭 닫아줘야만 한다. 하지만 메서드 close() 는 예외를 발생시킬 수 있다.

따라서 finally문에서 try-catch문을 사용해 close()를 수행하는데,

이런 방법은 코드를 복잡하게 하고, try블럭과 finally블럭 모두에서  예외가 발생하면 try블럭의 예외가 무시되는 문제가 있다.

 try-with-resources문은 이러한 문제를 해결하기 위해 사용된다.

```java
try (객체 생성;
		 ...) {
 ...
} catch () {
} finally {
}
```

try-with-resources문의 괄호()안에 객체를 생성하는 문장을 넣으면, 이 객체는 따로 close()를 호출하지 않아도 try블럭을 벗어나는 순간 자동으로 close()가 호출된다. (객체의 클래스가 AutoCloseable 인터페이스를 구현해야 한다) 그 다음에 catch, finally 블럭이 수행된다.

두 예외가 동시에 발생할 수는 없기 때문에 두개 이상의 예외가  발생할 때 나중에 발생한 예외는 억제된 예외로 저장된다.

**void addSuppressed (Throwable exception)** : 억제된 예외를 추가

**Throwable [] getSuppressed()** : 억제된 예외 (배열)을 반환

## 예외처리하기 4 - 사용자정의 예외 만들기

Exception클래스 또는 RuntimeException클래스로부터 상속받아 사용자정의 예외클래스를 만들 수 있다.

### 예외 되던지기

예외를 처리한 후에 인위적으로 다시 발생시키는 방법을 통해 

예외가 발생한 메서드와 호출한 메서드 양쪽에서 처리한다.

```java
호출 메서드() {
				try { 호출될 메서드
				} catch (예외클래스 참조변수) {
				}
		}
		호출될 메서드() throws 예외 {
				try {
							...
				} catch (예외클래스 참조변수) {
							throw e;
				}
		}
}
```

반환값이 있는 return문의 경우 try블럭뿐만 아니라 catch블럭에도 return문이 있어야 하는데, catch블럭에서 예외 되던지기를 해서 호출한 메서드로 예외를 전달하면, return문이 없어도 된다.

### 연결된 예외

원인 예외 1 → 발생 예외   원인 예외 2 → 발생 예외 … 

한 예외가 다른 예외를 발생시킬 수 있다. 이 때, 다른 예외를 발생시킨 예외를 ‘원인 예외’라고 한다.

이때 발생예외의 원인예외를 등록하고, 이 발생예외를 던져 원인예외와 함께 해결하는 방법이 있다. 

발생예외를 원인예외의 조상으로 설정해 해결할 수도 있지만  이렇게 하면 실제로 발생한 원인예외가 어떤 것인지 알 수 없고 원인예외의 상속관계를 변경해야 한다는 부담이 있다.

원인예외등록을 통해서 checked예외를 unchecked 예외로 바꿀 수 있다. 

**Throwable initCause (Throwable cause)** : 지정한 예외를 원인 예외로 등록

**RuntimeException (Throwable cause)** :  원인예외를 등록하는 생성자

**Throwable getCause** : 원인 예외를 반환