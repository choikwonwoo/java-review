## java.lang패키지

가장 기본이 되는 클래스를 포함하여 import문 없이도 사용가능하다.

### Object클래스

| 메서드 | 설명 |
| --- | --- |
| protected Object clone() | 객체의 복사본을 반환한다. |
| public boolean equals(Object obj) | 객체 자신과 객체 obj가 같은 객체인지 알려준다 |
| protected void finalize() | 객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 호출된다. 이 때 수행되어야하는 코드가 있을 때 오버라이딩 한다.  |
| public Class getClass() |  자신의 클래스 정보를 담고 있는 Class인스턴스를 반환한다. |
| public int hashCode() | 객체 자신의 해시코드를 반환한다. |
| public String toString() | 객체 자신의 정보를 문자열로 반환한다. |
| public void notify() | 객체 자신을 사용하려고 기다리는 쓰레드를 하나만 깨운다. |
| public void notifyAll() | 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다. |
| public void wait()
public void wait (long timeout)
public void wait (long timeout, int nanos) | 다른 쓰레드가 notify()나 notifyAll()을 호출할 때까지 현재 쓰레드를 무한히 또는 지정된 시간(timeout, nanos)동안 기다리게 한다. (timeout은 천분의 1초, nanos는 10^9분의 1초) |

System.identityHashCode(Object x)는 hashCode()처럼 객체의 주소값으로 해시코드를 생성하기 때문에 모든 객체에 대해 항상 다른 해시코드값을 반환할 것을 보장한다. 호출 결과는 실행할 때마다 달라질 수 있다.