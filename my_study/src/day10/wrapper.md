### Wrapper 클래스

- 기본 자료형 데이터들을 자료형을 유지한 채 객체(인스턴스)로 만들어 주는 클래스들을 통칭한다.
- 종류 : java.lang 패캐지안의 Boolean, Byte, Character, Double, Float, Integer, Long, Short,
- Boxing : 기본 자료형 데이터를 객체로 만드는 것
- Unboxing : 객체가 된 데이터를 다시 기본 자료형 데이터로 되돌리는 것
- 정석은 new키워드로 인스턴스를 생성해야 하지만 직접 값을 넣는 것으로 boxing과 unboxing을 처리할 수 있음
  예) Integer i1 = new Integer(10); Integer i1 = 10; // 두 명령은 동일
- 생성자 : 대표로 Integer 클래스를 사용
  Integer(int value) : 지정한 int형 데이터 value를 Integer형 인스턴스로 생성
  Integer(Stirng s) : 지정한 문자열 s를 Integer형 인스턴스로 생성
  다른 모든 Wrapper클래스의 생성자들도 본연의 자료형과 문자열을 매개변수로 사용하여 인스턴스를 생성함
  매개변수의 문자열에는 단순 문자열이 아닌 해당 자료형처럼 생긴 문자열만 가능
- 주요 메소드
  static int parseInt(String s) : 받아온 문자열 s를 int형 데이터로 변환 후 리턴
  모든 Wrapper 클래스에 parse자료형(String s)의 이름으로 존재함

  static Integer valueOf(String s) : 받아온 문자열 s를 Integer형 인스턴스로 변환 후 리턴
  모든 Wrapper 클래스에 동일한 이름으로 존재