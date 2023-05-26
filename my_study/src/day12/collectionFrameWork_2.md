# 컬렉션 프레임웍(Collection Framework)

- java.util 패키지에 들어있다.
- 배열과 비슷하게 여러 데이터를 저장할 수 있으며 배열과 다르게 많은 기능을 갖추고 있는 클래스들
  단, 배열에 비해 속도가 느려서 많은 양의 데이터를 처리할 경우 고민해 봐야 함
- 여러 데이터들을 저장하는 클래스와 인터페이스들을 표준화 한 설계를 의미
- 예전의 vector, hashtable, properties 등의 여러 데이터를 저장할 수 있는 클래스들을 새롭게 정비하여 표준화 한 것
- 컬렉션 프레임웍에는 list, set, map의 세 종류가 존재함
- list, set은 Collection interface를 상속받아 작업하는 interface, map interface는 collection interface를 상속받지 아니함
- Collection Framework 클래스들은 기본적으로 저장하는 데이터들의 자료형은 Object
  단, 대체적으로 제네릭을 사용하여 저장될 자료형(클래스)을 지정하여 사용하게 됨

## 1. Collection Interface

- list, set 상위 인터페이스로 두 인터페이스에서 상속을 받아 사용하고 있으므로 두 인터페이스가 동일한 기능을 가지게 해줌
- Collection 클래스들에서 사용하게 될 기본적인 기능 (데이터 저장, 참조, 추가, 삭제)들의 메소드들을 선언해 놓은 인터페이스
- Interface Collection<E> : 제네릭을 지정함으로써 저장할 데이터의 자료형을 강제할 수 있음
- 주요 메소드 :
  리턴타입 메소드 및 설명
  boolean	add(E e) : 제네릭으로 지정한 자료형의 데이터 e를 컬렉션에 추가 한 후 성공여부를 리턴
  boolean	addAll(Collection<? extends E> c) : 제네릭으로 지정한 자료형을 상속받은 데이터들(E도 포함)이 들어있는 컬렉션 c 전체를 컬렉션에 추가 한 후 성공여부를 리턴
void	clear() : 해당 컬렉션의 모든 데이터를 삭제한다.
boolean	contains(Object o) : 컬렉션에 지정한 데이터 o가 있는지 여부를 리턴
boolean	containsAll(Collection<?> c) : 컬렉션 c의 데이터들이 모두 들어있는지 여부를 리턴
  boolean	equals(Object o) : 동일한 컬렉션인지 여부를 리턴
  int	hashCode() : 컬렉션의 해쉬코드(해당 컬렉션의 주소값으로 JVM에서 다른 컬렉션과의 구분을 위해 사용)를 리턴
  boolean	isEmpty() : 컬렉션이 비어있는지 여부를 리턴
  Iterator<E>	iterator() : 컬렉션의 iterator(컬렉션 계열의 객체들을 동일한 방법으로 루프를 돌릴 때 사용됨)를 리턴
  boolean	remove(Object o) : 컬렉션에서 지정한 데이터를 삭제한 후 성공 여부를 리턴
  boolean	removeAll(Collection<?> c) : 지정한 컬렉션 c의 데이터들과 동일한 데이터들을 삭제한 후 성공 여부를 리턴
boolean	retainAll(Collection<?> c) : 지정한 컬렉션 c의 데이터들과 동일한 데이터들을 남기고 나머지 데이터들을 삭제 후 성공 여부를 리턴
  int	size() : 컬렉션에 저장된 데이터의 개수 (전체크기는 알 수 없고 대략 size()보다 넉넉하게 잡혀있음)
  Object[]	toArray() : 컬렉션의 데이터들을 Object형 배열로 생성하여 리턴 (배열의 빠른 처리속도를 이용하기 위함)
  <T> T[]	toArray(T[] a) : 컬렉션을 지정한 T형 배열 a에 저장

## 2. List Interface

- Collection Interface를 상속받은 인터페이스
- 입력 순서를 유지하는 데이터의 집합으로 데이터 중복을 허용함.
- 구현 클래스 : ArrayList, LinkedList, Stack, Vector 등이 있다.
- Interface List<E> : 제네릭을 지정함으로써 저장할 데이터의 자료형을 강제할 수 있음
- 주요 메소드 :
  리턴타입 메소드 및 설명
  void	add(int index, E element) : list의 index위치에 element를 추가
  boolean	addAll(int index, Collection<? extends E> c) : list의 index위치에 E를 상속받는 컬렉션 c를 추가
  E	get(int index) : list의 index위치의 데이터를 제네릭으로 지정한 자료형으로 리턴
  int	indexOf(Object o) : list에서 지정한 데이터 o가 위치한 index번호를 리턴, 없으면 -1
  int	lastIndexOf(Object o) : indexOf() 메소드와 동일한 기능으로 찾는 위치를 뒤에서부터 시작
  ListIterator<E>	listIterator() : list 전용 iterator인 listitrator를 리턴
  E	remove(int index) : list에서 지정한 index번호에 해당하는 데이터를 삭제한 후 해당 데이터를 리턴 (잘라내기)
  E	set(int index, E element) : list의 index위치에 있는 데이터를 element로 변경 (덮어쓰기)
  List<E>	subList(int fromIndex, int toIndex) : list를 fromIndex부터 toIndex-1까지 잘라내어 새로운 리스트로 리턴 (잘라내기)

## 2-1. ArrayList 클래스

- 컬렉션 프레임웍의 클래스들 중 가장 많이 사용하는 클래스로 기존의 Vector를 개선한 클래스
- List 인터페이스를 implements한 클래스로 Collection과 List의 메소드들을 구현해 놓음
- 생성자
  ArrayList() : 기본 크기(10)로 ArrayList 인스턴스 생성
  ArrayList(Collection<? extends E> c) : 제네릭으로 지정한 E를 상속받는 컬렉션 c로 ArrayList 인스턴스 생성
- Collection을 상속 또는 구현하는 다른 객체(LinkedList, Vector, Set 종류)들로 ArrayList 인스턴스를 생성할 수 있다는 의미
  ArrayList(int initialCapacity) : 지정한 initialCapacity를 크기로 하는 ArrayList 인스턴스 생성
- 주요 메소드 :
  리턴타입 메소드 및 설명
  Object	clone() : 해당 ArrayList를 복제하여 리턴
  void	ensureCapacity(int minCapacity) : 해당 ArrayList의 최소 크기를 지정한 minCapacity로 설정
  void	trimToSize() : 용량을 크기에 맞게 줄여줌(빈 칸을 없애줌, ArrayList에 모두 저장한 후 사용해야 함)

## 2-2. LinkedList 클래스

- 불연속적인 데이터를 연결하여 여러 데이터를 저장하는 기능
- 생성자
  LinkedList() : 빈 LinkedList 인스턴스 생성
  LinkedList(Collection<? extends E> c) : 제네릭으로 지정한 E를 상속받는 컬렉션 c로 LinkedList인스턴스 생성
- 데이터를 끼워넣는 경우가 많을 때 ArrayList보다 효과적
- 주요 메소드 :
  jdk1.5와 jdk1.6에서 Queue와 Deque 인터페이스를 구현해서 메소드의 개수가 많음(겹치는 기능도 많음)
  리턴타입 메소드 및 설명
  void	addFirst(E e) : 제네릭으로 지정한 자료형의 데이터 e를 LinkedList의 처음 위치에 추가
  void	addLast(E e) : 제네릭으로 지정한 자료형의 데이터 e를 LinkedList의 마지막 위치에 추가

  Iterator<E>	descendingIterator() : 내림차순으로 조회하기 위한 Iterator 리턴
  E		getFirst() : 첫 번째 데이터 리턴
  E		getLast() : 마지막 데이터 리턴

  boolean	offer(E e) : addLast()후에 추가여부를 리턴
  boolean	offerFirst(E e) : addFirst() 후에 추가여부를 리턴
  boolean	offerLast(E e) : addLast()후에 추가여부를 리턴

  E		peek() : getFirst()와 같음
  E		peekFirst() : getFirst()와 같음
  E		peekLast() : getLast()와 같음

  E		poll() : getFirst()후에 LinkedList에서 제거
  E		pollFirst() : getFirst()후에 LinkedList에서 제거
  E		pollLast() : getLast()후에 LinkedList에서 제거

  E		pop() : Stack에서 첫 번째 데이터 리턴하고 Stack에서 제거
  void		push(E e) : addFirst()와 같음

  E		remove() : poll()과 같음
  E		removeFirst() : poll()과 같음
  boolean	removeFirstOccurrence(Object o) : 해당 LinkedList에서 지정한 데이터(o)와 처음으로 일치하는 데이터를 삭제
  E		removeLast() : pollLast()과 같음
  boolean	removeLastOccurrence(Object o) : 해당 LinkedList에서 지정한 데이터(o)와 마지막으로 일치하는 데이터를 삭제

- 순차적인 작업에서는 ArrayList가 빠르며, 비순차적인 작업에서는 LinkedList가 빠름
  단, 순차적인 작업이 많이 이루어지므로 ArrayList를 사용하는 경우가 더 많음
  데이터가 많아질수록 LinkedList는 접근성이 떨어짐

## 2.3. Stack 클래스

- List 인터페이스를 implements한 Vector 클래스를 상속받는 클래스로
  마지막에 저장한 데이터가 가장 먼저 추출되는 형식의 저장공간
- LIFO(Last In First Out)의 특징을 가지는 저장공간으로 웹브라우저의 뒤로가기 같은 기능에서 사용됨
- 생성자
  Stack() : 빈 stack 인스턴스 생성
- 주요 메소드
  리턴타입 메소드 및 설명
  boolean	empty() : Stack이 비어있는지 여부를 리턴
  E	peek() : Stack의 맨 위에 저장된 데이터를 리턴, 없으면 EmptyStackException 발생
  E	pop() : Stack에서 맨 위에 저장된 데이터 리턴하고 Stack에서 제거
  E	push(E item) : Stack에 지정된 데이터 item을 저장
  int	search(Object o) : Stack에서 지정한 데이터(o)를 찾아 위치를 리턴 (1부터 시작(맨 위)) - 못찾으면 -1을 리턴

## 2.4 Queue Interface

- Collection interface를 상속받는 interface로 List는 상속받지 않으므로 List의 기능을 사용할 수 없음
- FIFO(First In First Out)의 특징을 가져 처음 넣은 데이터가 처음 추출됨
- 인터페이스이므로 인스턴스 생성이 불가하며 Queue 인터페이스를 구현한 클래스를 이용해야 하며 대표적으로 LinkedList가 있음
- 주요 메소드
  리턴타입 메소드 및 설명
  boolean	offer(E e) : 제네릭으로 지정한 자료형의 데이터 e를 큐의 마지막 위치에 저장
  E	peek() : 첫 번째 데이터 리턴(원본 데이터 유지)
  E	poll() : 첫 번째 데이터 리턴(원본 데이터 삭제)
  E	remove() : 첫 번째 데이터 리턴(원본 데이터 삭제)

## 3.Set Interface

- Collection Interface를 상속받음
- 입력 순서를 유지하지 않는 데이터의 집합으로 데이터 중복을 허용하지 않음
- 구현 클래스 : HashSet, TreeSet 등이 있음
- Set 전용 메소드 없이 상속받은 Collection의 메소드들만 사용

## 3-1. HashSet Class

- Set Interface를 구현한 클래스들 중 가장 많이 사용되는 클래스
- 로드 팩터 : 컬렉션의 저장공간이 가득 차기 전에 미리 용량을 확보하기 위한 것으로 이 값만큼 채워졌을 때 용량을 두배로 늘림
  기본값은 0.75로 저장공간의 75%를 채우면 자동으로 용량이 늘어남
- 생성자
  HashSet() : 기본 HashSet 인스턴스 생성(기본용량 16/ 로드 팩터 0.75)
  HashSet(Collection<? extends E> c) : 제네릭으로 지정한 자료형 E를 상속받는 데이터들이 저장되어 있는 Collection c로 HashSet 인스턴스 생성
  HashSet(int initialCapacity) : 지정한 initialCapacity를 초기 용량으로 하는 HashSet 인스턴스 생성
  HashSet(int initialCapacity, float loadFactor) : 지정한 initialCapacity를 초기용량으로, 지정한 loadFactor를 로드팩터로 설정하여 HashSet 인스턴스 생성

## 4. Map Interface

- List와 Set과는 다르게 Collection Interface를 상속받지 않음
- 키(key)와 값(value)의 쌍(pair)으로 저장되는 데이터 집합
- 입력 순서를 유지하지 않으며, 키는 중복불가, 값은 중복가능
- 구현 클래스 : HashMap, TreeMap, Hashtable, Properties 등이 있음
- 주요 메소드 :
  리턴타입 메소드 및 설명
  void	clear() : Map에 저장된 모든 객체를 제거
  boolean	containsKey(Object key) : 지정한 key가 Map에 있는지 여부를 리턴
  boolean	containsValue(Object value) : 지정한 value가 Map에 있는지 여부를 리턴
  V	get(Object key) : 지정한 key에 해당하는 value를 Map에서 리턴, 없으면 null을 리턴
  default V	getOrDefault(Object key, V defaultValue) : get()과 같으나, 찾는 값이 없으면 지정한 defaultValue를 리턴
  int	hashCode() : Map의 해쉬코드를 리턴
  boolean	isEmpty() : Map이 비어있는지 여부를 리턴
  Set<K>	keySet() : 맵의 key들을 Set으로 생성하여 리턴 - valueSet() 메소드는 없음
  V	put(K key, V value) : 지정한 key와 value를 맵에 저장
  void	putAll(Map<? extends K,? extends V> m) : K를 상속받는 key와 V를 상속받는 value들을 가진 Map의 모든 요소를 해당 맵에 저장
  V	remove(Object key) : 지정된 key에 해당하는 값을 삭제한 후 리턴
  default boolean	remove(Object key, Object value) : 지정된 key와 value에 해당하는 값을 삭제한 후 삭제 여부를 리턴
  default V	replace(K key, V value) : 지정된 key에 해당하는 value을 지정한 value로 변경 후 리턴
  default boolean	replace(K key, V oldValue, V newValue) : 지정된 key와 oldValued에 해당하는 value를 newValue로 변경
  int	size() : Map에 저장된 데이터의 개수
  Collection<V>	values() : Map에 저장된 모든 요소의 값들을 컬렉션 형태로 리턴

## 4-1. HashMap Class

- 생성자
  HashMap() : 기본 HashMap 인스턴스 생성(기본용량 16/ 로드 팩터 0.75)
  HashMap(Map<? extends K,? extends V> m) : 제네릭으로 지정한 자료형 K를 상속받는 key와 V를 상속받는 value들을 가진 Map m의 모든 요소들을 포함하는 HashMap 인스턴스 생성
  HashMap(int initialCapacity) : 지정한 initialCapacity를 초기 용량으로 하는 HashMap 인스턴스 생성
  HashMap(int initialCapacity, float loadFactor) : 지정한 initialCapacity를 초기용량으로, 지정한 loadFactor를 로드팩터로 설정하여 HashMap 인스턴스 생성
- 메소드들은 Map 인터페이스의 메소드들과 같음

## 5. Iterator, ListIterator, Enumeration

- 컬렉션에 저장된 데이터들에 접근할 때 사용되는 인터페이스들로 동일한 방식으로 루프를 돌릴 수 있게 해줌

## 5-1. Enumeration Interface

- 컬렉션 프레임웍이 만들어지기 전의 Iterator 구버전
- 호환을 위해 남겨 두고 있을 뿐 최근에는 거의 사용하지 않고 Iterator를 사용함
- 주요 메소드
  리턴타입 메소드 및 설명
  boolean	hasMoreElements() : 루프의 조건으로 사용되는 메소드로 남은 요소가 있는지 여부를 리턴
  E	nextElement() : 다음 요소의 데이터를 참조하는 메소드

## 5-2. Iterator Interface

- Enumeration interface의 신버전으로 Collection interface의 iterator() 메소드를 받을 수 있음
- Collection interface를 상속받는 List와 Set에서 모두 사용할 수 있음(모두 동일한 방식으로 루프를 돌릴 수 있음)
- Enumeration interface의 메소드와 이름만 다를 뿐 기능은 같음.
- Iterator Interface를 이용하여 루프를 돌리면 인덱스번호가 없어서 for문을 사용못하는 Set 등에서도 손쉽게 루프를 돌릴 수 있음
- 단 1회용이며, 순방향으로 처음부터 끝까지 돌려야 함
- 주요 메소드
  리턴 타입 메소드 및 설명
  boolean	hasNext() : hasMoreElements()
  E	next() : nextElemetn()
  default void	remove() : next()로 읽어들인 요소의 데이터를 삭제함. 단, 반드시 next() 다음에 사용해야 함

## 5-3. ListIterator Interface

- List 전용으로 Iterator Interface를 상속받아 순방향 뿐만 아니라 역방향으로도 루프를 돌릴 수 있게 메소드를 추가한 Interface
- 주요 메소드
  리턴 타입 메소드 및 설명
  boolean	hasNext() : hasMoreElements()
  boolean	hasPrevious() : 이전 요소가 있는지 여부를 리턴
  E	next() : nextElemetn()
  int	nextIndex() : 다음 요소의 인덱스를 리턴하는 메소드
  E	previous() : 이전 요소의 데이터를 참조하는 메소드
  int	previousIndex() : 이전 요소의 인덱스를 리턴하는 메소드
  default void	remove() : next()나 previous()로 읽어들인 요소의 데이터를 삭제함. 단, 반드시 next()나 previous() 다음에 사용해야 함
  void	set(E e) : next()나 Previous()로 읽어들인 요소의 데이터를 지정한 데이터(e)로 변경
- 단, 반드시 next()나 previous() 다음에 사용해야 함