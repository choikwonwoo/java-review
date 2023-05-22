## 날짜와 시간

### Calendar와 Date

Java.util 패키지

Calendar은 추상클래스이므로 메소드를 통해 완전히 구현된 클래스의 인스턴스를 얻어야 한다. (최소한의 변경으로 프로그램이 동작할 수 있도록 하기 위함)

```java
Calendar cal = new Calendar(); XX
Calendar cal = Calendar.getInstance();

//getInstance는 static
//cal은 현재 시스템의 날짜와 시간에 대한 정보를 담고 있음

// 시스템의 국가와 지역설정을 확인해서 
// 태국이면 BuddhistCalendar의 인스턴스 반환
// 그 외에는 GregorianCalendar의 인스턴스 반환
```

### Date와 Calendar간의 변환

1. Calendar를 Date로 변환

```java
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeInMillis());
```

1. Date를 Calendar로 변환

```java
Date d = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(d);
```

**get 메소드**

```java
Calendar형 인스턴스 cal

cal.get(Calendar.YEAR)
cal.get(Calendar.MONTH) (0~11)
cal.get(Calendar.DATE)
cal.get(Calendar.WEEK_OF_YEAR) 이 해의 몇 째 주
cal.get(Calendar.WEEK_OF_MONTH) 이 달의 몇 쨰 주
cal.get(Calendar.DAY_OF_YEAR) 이 해의 몇 일
cal.get(Calendar.DAY_OF_MONTH) 이 달의 몇 일
cal.get(Calendar.DAY_OF_WEEK)  1:일요일, 2:월요일 ...
cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) 이 달의 몇 째 요일
cal.get(Calendar.AM_PM) 오전_오후  0: 오전, 1: 오후
cal.get(Calendar.HOUR) 시간 (12)
cal.get(Calendar.HOUR_OF_DAY) 시간 (24)
cal.get(Calendar.MINUTE) 분
cal.get(Calendar.SECOND) 초
cal.get(Calendar.MILLISECOND) 1000분의 1초 (0~999)
cal.get(Calendar.ZONE_OFFSET) (-12~12)
cal.getActualMaximum(Calendar.DATE) 이달의 마지막 일
```

**set메소드**

```java
void set(int field, int value) // 지정한 field를 value값으로 설정
void set(int year, int month, int date)
void set(int year, int month, int date, int hourOfDay, int minute)
void set(int year, int month, int date, int hourOfDay, int minute, int second)
```

두 날짜간의 차이

1. 두 날짜를 최소단위인 초단위로 변경하여 차이를 구한다.
2. 초단위 : getTimeInMillis() 메서드로 얻은 값/1000
3. 분단위 : getTimeInMillis() 메서드로 얻은 값/1000*60(초)
4. 시단위 : getTimeInMillis() 메서드로 얻은 값/1000*60(분)*60(초)
5. 일단위 : getTimeInMillis() 메서드로 얻은 값/1000*24(시간)*60(분)*60(초)

작은 단위 → 큰 단위 : 단위만큼 나눠주기

큰 단위 → 작은 단위 : 단위만큼 곱해주기

초단위를 시,분,초로 변경

1. 초단위를 시단위(60(분)*60(초))로 나눈다. 몫이 시간 값
2. 나눈 나머지를 분단위(60(초))로 나눈다. 몫이 분 값, 나머지가 초 값

**field값의 증가, 감소**

```java
add(int field, int amount) 
// 지정한 field의 값을 원하는 만큼 증가 또는 감소
roll(int field, int amount) 
// add와 마찬가지의 기능을 하지만 다른 필드에 영향을 미치지 않음
// 단 일필드가 말일일 때, roll메서드를 이용하여 월필드를 변경하면 일필드에 영향을 미칠 수 있음
```

기타 메서드

boolean isLeapYear(int year) : 매개변수 year가 윤년이면 true, 그렇지 않으면 false를 반환

int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) : 두 날짜간의 차이를 일단위로 반환한다.

int getDayOfWeek(int year, int month, int day) : 지정한 날짜의 요일을 반환한다. (1~7, 1이 일요일)

String convertDayToDate(int day) : 일단위의 값을 년월일 형태의 문자열로 변환하여 반환

int convertDateToDay(int year, int month, int day) : 년월일을 입력받아서 일단위로 변환

## 형식화 클래스

java.text패키지

형식화에 사용될 패턴을 정의하는 클래스

형식화 : 숫자, 날짜, 텍스트 데이터를 일정한 형식에 맞게 표현하는 것

### DecimalFormat

숫자를 형식화

| 기호 | 의미 | 패턴                                                                                                                              | 결과(1234567.89)                                                                                                                                                    |
| --- | --- |---------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 0 | 10진수 (값이 없을 때는 0) | 0,0.0,0000000000.0000                                                                                                           | 1234568 (반올림),1234567.9 (반올림),0001234567.8900                                                                                                                     |
| # | 10진수 | #,#.#,##########.####                                                                                                           | 1234568 (반올림),1234567.9 (반올림),1234567.89                                                                                                                          |
| . | 소수점 |                                                                                                                                 |                                                                                                                                                                   |
| - | 음수부호 | #.#--#.#                                                                                                                        | 1234567.9-,-1234567.9                                                                                                                                             |
| , | 단위 구분자 | #,###,##              \#,####,##                                                                                                | 1,234,567,89\123,4567,89                                                                                                                                          |
| E | 지수기호 | #E0,0E0,##E0,00E0,####E0,0000E0,#.#E0,0.0E0,0.000000000E0,00.00000000E0,000.0000000E0,#.#########E0,##.########E0,###.#######E0 | .1E7,1E6,1.2E6,12E5,123.5E4 (반올림),1235E4 (반올림),1.2E6,1.2E6,1.234567890E6,12.34567890E5,123.4567890E4,1.23456789E6,1.23456789E6,1.23456789E6                       |
| ; | 패턴구분자 | #,###.##+;#,###.##-                                                                                                             | 1,234,567.89+(양수일 때)                                                                                                                        ,1,234,567.89-(음수일 때) |
| % | 퍼센트 | #.#%                                                                                                                            | 123456789％                                                                                                                                                        |
| \u2030 | 퍼밀 (퍼센트 x 10) | #.#\u2030                                                                                                                       | 1234567890‰                                                                                                                                                       |
| \u00A4 | 통화 | \u00A4 #.###                                                                                                                    | ￦ 1,234,568 (반올림)                                                                                                                                                 |
| ‘ | escape문자 | ‘#’#,###,’’#,###                                                                                                                | #1,234,568 (반올림),’1,234,568                                                                                                                                       |

```java
double number = 1234567.89;
DecimalFormat df = new DecimalFormat("#.#E0");
String result = df.format(number)

//1.2E6
```

### SimpleDateFormat

날짜 데이터를 원하는 형태로 다양하게 출력

| 기호 | 의미 | 보기 |
| --- | --- | --- |
| G | 연대(BC,AD) | AD |
| y | 년도 | 2022 |
| M | 월(1~12 또는 1월~12월) | 7 또는 7월, July |
| w | 년의 몇 번째 주(1~53) | 50 |
| W | 월의 몇 번째 주(1~5) | 4 |
| D | 년의 몇 번째 일(1~366) | 100 |
| d | 월의 몇 번째 일(1~31) | 26 |
| F | 월의 몇 번째 요일(1~5) | 1 |
| E | 요일 | 월 |
| a | 오전/오후 (AM,PM) | PM |
| H | 시간(0~23) | 20 |
| k | 시간(1~24) | 13 |
| K | 시간(0~11) | 10 |
| h | 시간(1~12) | 11 |
| m | 분(0~59) | 35 |
| s | 초(0~59) | 55 |
| S | 천분의 일초(0~999) | 253 |
| z | Time zone(General time zone) | GMT+9:00 |
| Z | Time zone(RFC 822 time zone) | +0900 |
| ‘ | escape문자 (특수문자 표현) | 없음 |

```java
Date today = new Date();
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
String result = df.format(today);

//2022-07-12
//format의 매개변수로 Date인스턴스가 들어감

Date d = df.parse("2022년 7월 12일");
//parse(String source) 문자열 source를 Date인스턴스로 변환
```

### ChoiceFormat

특정 범위에 속하는 값을 문자열로 변환

```java
double[] limits = {60, 70, 80, 90}; //낮은값부터 순서대로
String[] grades = {"D","C","B","A"}; //limits과 순서가 맞게

int[] scores = {100,95,88,70,52,60,70};
ChoiceFormat form = new ChoiceFormat(limits, grades)

for(int i = 0; i <scores.length; i++) {
System.out.println(scores[i] + ":" + form.format(scores[i]));

/* 100:A
	 95:A
   88:B ... */

String pattern = "60#D|70#C|80<B|90#A"
// # 경계값 포함, < 포함 안함
// B : 81~99 , 80은 C  
```

limits 배열에 의해 60~69, 70~79, 80~89, 90~의 범위가 정의됨

### MessageFormat

데이터를 양식에 넣어서 출력

```java
String msg = "Name : {0} Tel : {1}"
Object[] argumetns = {"이자바","02-123-1234"}
String result = MessageFormat.format(msg, arguments);

//Name : 이자바 Tel : 02-123-1234
```

출력된 데이터로부터 필요한 데이터만을 뽑아내는 방법 (parse)

```java
String[] data = { 
"INSERT INTO CUST_INFO VALUES ('이자바','02-123-1234','27','07-09')",
"INSERT INTO CUST_INFO VALUES ('김프로','032-333-1234','33','10-07')"
}
// String 배열 data
String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
// data의 패턴 저장
MessageFormat mf = new MessageFormat(pattern);
//pattern을 가진 MessageFormat형 인스턴스 생성

for(int i = 0; i < data.length; i++) {
	Object[] objs = mf.parse(data[i]);
 //문자열 data[i]를 Date인스턴스로 변환한 후, Object 배열 objs에 추가
	for(int j = 0; j < objs.length; j++) {
		System.out.print(objs[j] + ",");
		//objs배열의 j 인덱스 위치의 값 출력
	}
	Systemo.out.println(); //개행
}

/* '이자바','02-123-1234','27','07-09'
	 '김프로','032-333-1234','33','10-07' */
```

## Java.time패키지

java.time : 날짜와 시간을 다루는데 필요한 핵심 클래스들을 제공

### 4개의 하위패키지

java.time.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스들을 제공

[java.time.format](https://www.notion.so/10-cd571387f24648538a50e8d8bf43b919) : 날짜와 시간을 파싱하고, 형식화하기 위한 클래스들을 제공

java.time.temporal : 날짜와 시간의 필드(field)와 단위(unit)를 위한 클래스들을 제공

[java.time.zone](http://java.time.zone) : 시간대(time-zone)와 관련된 클래스들을 제공

Calendar클래스와 달리 불변이므로 멀티쓰레드 환경에서도 안전하다

기존의 객체를 변경하는 대신 항상 변경된 새로운 객체를 반환한다.

### 핵심 클래스와 인터페이스

**인터페이스**

[Temproal, TemporalAccesser, TemporalAdjuster](https://www.notion.so/10-cd571387f24648538a50e8d8bf43b919)

**구현클래스**

LocalDate : 날짜 클래스

LocalTime : 시간 클래스

LocalDateTime : 날짜, 시간

ZonedDateTime : 날짜, 시간, 시간대

**인터페이스**

[TemporalAmount](https://www.notion.so/10-cd571387f24648538a50e8d8bf43b919)

**구현클래스**

Period : 두 날짜간의 차이

Duration : 두 시간간의 차이

**인터페이스**

TemporalUnit

**구현클래스**

ChronoUnit : 날짜와 시간의 단위 (열거형)

**인터페이스**

TemporalField

**구현클래스**

ChronoField : 년, 월, 일 등 날짜와 시간의 필드를 정의 (열거형)

### Temproal, TemporalAccesser, TemporalAdjuster

### LocalDate, LocalTime, LocalDateTime, ZonedDateTime

**객체 생성 방법**

static 메서드 now()와 of()를 사용

now() : 현재 날짜와 시간을 저장하는 객체 생성

of(): 해당 필드의 값을 순서대로 지정하는 객체 생성

```java
LocalDate today = LocalDate.now(); //오늘의 날짜
LocalTime now = LocalTime.now(); //현재 시간

static LocalDate of(int year, Month month, int dayOfMonth)
static LocalDate of(int year, int month, int dayOfMonth)

static LocalTime of(int hour, int min)
static LocalTime of(int hour, int min, int sec)
static LocalTime of(int hour, int min, int sec, int nanoOfSecond)
```

### LocalDate, LocalTime

**get(), getXXX()**

```java
//LocalDate
getYear() 년도
getMonthValue() 월 (12)
getMonth() 월 (DECEMBER)
getDayOfMonth() 일
getDayOfYear() 같은 해의 1월 1일부터 몇번째 일 (365)
getDayOfWeek() 요일
lengthOfMonth() 같은 달의 총 일수
lengthOfYear() 같은 해의 총 일수(365) 윤년이면 366
isLeepYear() 윤년여부확인
//LocalTime
getHour() 시(23)
getMinute() 분(59)
getSecond() 초(59)
getNano() 나노초
```

```java
LocalDate형, LocalTime형 인스턴스 local
자료형마다 사용할 수 있는 Field는 다름 

local.get(ChronoField.ERA) 시대
local.get(ChronoField.YEAR)
local.get(ChronoField.YEAR_OF_ERA) 년
local.get(ChronoField.MONTH_OF_YEAR) (1~12)
local.get(ChronoField.AMPM_OF_DAY) 오전/오후 
local.get(ChronoField.HOUR_OF_DAY) 시간 (0~23)
local.get(ChronoField.CLOCK_HOUR_OF_DAY) 시간 (1~24)
local.get(ChronoField.HOUR_OF_AMPM) 시간 (0~11)
local.get(ChronoField.CLOCK_HOUR_OF_AMPM) 시간 (1~12)
local.get(ChronoField.MINUTE_OF_HOUR) 분
local.get(ChronoField.SECOND_OF_MINUTE) 초
local.get(ChronoField.MILLI_OF_SECOND) 천분의 1초 (0~999)
local.get(ChronoField.MICRO_OF_SECOND) 백만분의 1초 
local.get(ChronoField.NANO_OF_SECOND) 10억분의 1초 
local.get(ChronoField.DAY_OF_YEAR) 이 해의 몇 일
local.get(ChronoField.EPOCH_DAY) EPOCH (1970.1.1)부터 몇번째 날
local.get(ChronoField.MINUTE_OF_DAY) 그 날의 몇 번째 분 (시간을 분으로 환산)
local.get(ChronoField.SECOND_OF_DAY) 그 날의 몇 번째 초 (시간을 초로 환산)
local.get(ChronoField.MILLI_OF_DAY) 그 날의 몇 번째 분 (시간을 분으로 환산)
local.get(ChronoField.MICRO_OF_DAY) 그 날의 몇 번째 분 (시간을 분으로 환산)
local.get(ChronoField.NANO_OF_DAY) 그 날의 몇 번째 분 (시간을 분으로 환산)
local.get(ChronoField.MINUTE_OF_DAY) 그 날의 몇 번째 분 (시간을 분으로 환산)
local.get(ChronoField.ALIGNED_WEEK_OF_MONTH) 그 달의 몇 째 주(1~7일 1주...)
local.get(ChronoField.ALIGNED_WEEK_OF_YEAR) 그 해의 몇 째 주
local.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH) 요일 (그달의 1일을 월요일로 간주하여 계산)
local.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR) 요일 (그 해의 1월 1일을 월요일로 간주하여 계산)
local.get(ChronoField.INSTANT_SECONDS) 년월일을 초단위로 환산 Instant에만 사용가능
local.get(ChronoField.OFFSET_SECONDS) UTC와의 시차 ZoneOffset에만 사용가능
local.get(CHronoField.PROLEPTIC_MONTH) 년월을 월단위로 환산 (2015년 11월 = 2015*12+11)
```

**필드 값 변경하기 - with(), plus(), minus()**

**with()**

```java
LocalDate withYear(int year)
LocalDate withMonth(int month)
LocalDate withDayOfMonth(int dayOfMonth)
LocalDate withDayOfYear(int dayOfYear)

LocalTime withHour(int hour)
LocalTime withMinute(int minute)
LocalTime withSecond(int second)
LocalTime withNano(int nanoOfSecond)

LocalDate with(TemporalField field, long newValue)
//필드를 변경하는 메서드는 항상 새로운 객체를 생성해서 반환한다
```

**plus(), minus()**

```java
LocalDate plusYears(long yearsToAdd)
LocalDate plusMonths(long monthsToAdd)
LocalDate plusDays(long daysToAdd)
LocalDate plusWeeks(long weeksToAdd)

LocalTime plusHours(long hoursToAdd)
LocalTime plusMinutes(long minutesToAdd)
LocalTime plusSeconds(long secondsToAdd)
LocalTime plusNanos(long nanosToAdd)

//LocalTime의 truncatedTo()
//지정된 것보다 작은 단위의 필드를 0으로 만든다
// 12시 34분 56초 -> truncatedTo(ChronoUnit.HOURS) -> 12:00
```

### 날짜와 시간의 비교 - isAfter(), isBefor(), isEqual()

compareTo()로도 비교가 가능하다

```java
int result = date1.compareTo(date2);
//같으면 0, date1이 이전이면 -1, 이후면 1
```

**isAfter(), isBefor(),isEqual()**

```java
//모두 boolean형이다
boolean isAfter (ChronoLocalDate other)
```

equals()는 필드의 모든 값을 비교하는 메소드지만

isEqual()은 오직 날짜만 비교한다.

### Instant

UTC : Coordinated Universal Time ‘세계 협정시’ 1972년 1월 1일부터 시행한 국제 표준시다. 이전에 사용하던 Greenwich Mean Time와 거의 같지만 UTC가 좀 더 정확하다

에포크 타임(1970-01-01 00:00:00 UTC)부터 경과된 시간을 초,  나노초 단위로 표현

밀리초단위로 바꾸려면 toEpochMilli()를 사용한다.

**[객체 생성](https://www.notion.so/10-cd571387f24648538a50e8d8bf43b919)**은 now()와 ofEpochSecond()를 사용한다 ****

UTC(+00:00)를 기준으로 하기 때문에 시간대가 (+09:00)인 한국시각과 차이가 있다.

**Instat와 Date 간의 변환**

```java
static Date from(Instant instant); // Instant -> Date
Instant toInstant // Date -> Instant
```

### LocalDateTime과 ZonedDateTime

**객체생성**

```java
// LocalDateTime
// of()와 now()를 사용하거나
// LocalDate와 LocalTime을 합치는 방법이 있다.
LocalDate date = LocalDAte.of(2015,12,31);
LocalTime time = LocalTime.of(12,34,56);

LocalDateTime dt = LocalDateTime.of(date,time);
LocalDateTime dt2 = date.atTime(time);
LocalDateTIme dt3 = time.atDate(date);
LocalDateTime dt4 = date.atTime(12,34,56);
LocalDateTime dt5 = time.atDate(LocalDate.of(2015,12,31));
LocalDateTime dt6 = date.atStartOfDay();

//ZonedDateTime (GregorianCalendar와 가장 유사)
//ZoneId클래스를 사용: 일광 절약 시간 (DST, Daylight Saving Time) 자동 처리
ZoneId zid = ZoneId.of("Asia/Seoul");
ZoneDateTime zdt = dateTime.atZone(zid);
//Localdate의 atStartOfDay()메소드 사용 (0시0분0초로 설정)
ZonedDateTime sdt = LocalDate.now().atStartOfDay(zid);
//ZOneDateTime의 withZoneSameInstant()메소드 사용 (특정 지역의 시간으로 설정)
ZonedDateTime time = ZonedDateTime.now().withZoneSameInstant(zid);
```

**LocalDateTime의 변환**

```java
LocalDate date = dt.toLocalDate(); // LocalDateTime -> LocalDate
LocalTime time = dt.toLocalTime(); // LocalDateTime -> LocalTime
```

### **OffsetDateTime**

ZoneOffset을 사용한 DateTime클래스

서로 다른 시간대에 존재하는 컴퓨터간의 통신에 사용함

**ZoneOffset**

UTC로부터 얼마만큼 떨어져 있는지를 표현하는 클래스

**객체생성**

```java
OffsetDateTime odt = OffsetDateTime.of(date, time, krOffset);
OffsetDateTime odt = zdt.toOffsetDateTime();
//zdt는 ZonedDateTime 객체
```

**ZonedDateTime의 변환**

```java
toLocalDate()
toLocalTime()
toLocalDateTime()
toOffsetDateTime()
toEpochSecond()
toInstant()

from(ZonedDateTime zdt) //ZonedDateTime -> GragorianCalendar
toZonedDateTime() //GragorianCalendar -> ZonedDateTime
```

### TemporalAdjusters

**클래스**

자주 쓰일만한 날짜 계산들을 대신 해주는 메서드 정의

```java
firstDayOfNextYear() //다음 해의 첫 날
firstDayOfNextMonth() //다음 달의 첫 날
firstDayOfYear() //올 해의 첫 날
firstDayOfMonth() //이번 달의 첫 날
lastDayOfYear() //올 해의 마지막 날
lastDayOfMonth() //이번 달의 마지막 날
firstInMonth(DayOfWeek dayOfWeek) //이번 달의 첫번째 ? 요일
lastInMonth(DayOfWeek dayOfWeek) //이번 달의 마지막 ? 요일
previous(DayOfWeek dayOfWeek) //지난 ?요일(당일 미포함)
previousOrSame(DayOfWeek dayOfWeek) //지난 ?요일(당일 포함)
next(DayOfWeek dayOfWeek) //다음 ?요일(당일 미포함)
nextOrSamte(DayOfWeek dayOfWeek) //다음 ?요일(당일 포함)
dayOfWeekInMonth(int ordinal, DayOfWeek dayOfWeek) //이번 달의 n번째 ?요일
```

**인터페이스**

필요 시 자주 사용되는 날짜 계산 메서드를 직접 만들 수 있다.

Temporal adjustInto(Temporal temporal)을 구현하고

with(TemporalAdjuster adjuster) 메서드로 사용할 수 있다.

### TemporalAmount

### Period, Duration

**Period : 날짜 차이 계산**

**Duration : 시간 차이 계산**

```java
Period pe = Period.between(date1, date2); //static메서드
Period pe = today.until(myBirthDay); //instance메서드
long dday = totay.until(myBirthDay, ChronoUnit.Days)  //년,월,일이 아니라 일로만 구하고 싶을 때
long sec = LocalTime.now().until(endTime, ChronoUnit.SECONDS);
Duration du = Duration.betwwen(time1, time2); //Duration을 반환하는 until()은 없음

//특정 필드의 값을 얻을 때
long year = pe.get(ChronoUnit.YEARS) //int getYears()
long month = pe.get(ChronoUnit.MONTHS) //int getMonths()
long day = pe.get(ChronoUnit.DAYS) //int getDays()

long sec = du.get(ChronoUnit.SECONDS) //long getSeconds()
int nano = du.get(ChronoUnit.NANOS) //int getNanos()

//Period와 달리 Duration에는 getHours(), getMinutes()메서드가 없다
//따라서 초를 변형해서 사용하거나
//Duration을 LocalTime으로 변환한 다음에 get메서드를 사용한다.
LocalTime tmpTime = LocalTime.of(0,0).plusSeconds(du.getSeconds());
```

**of(), with()**

```java
Period
of(), ofYears(), ofMonths(), ofWeeks(), ofDays()

Duration
of(), ofDays(), ofHours(), ofMinutes(), ofSeconds()

pe.withYears(2);
du.withSeconds(120);
//특정 필드 값 변경
```

**다른 단위로 변환**

```java
Period
toTotalMonths() // 년월일을 월단위로 변환 (일단위 무시)

Duration
toDays() // 일단위로
toHours() //시간단위로
toMinutes() //분단위로
toMillis() //천분의 일초 단위로
toNanos() //나노초 단위로 
```

### 파싱과 포맷

java.time.format 패키지

**포맷**

```java
LocalDate date = LocalDate.of(2022,7,22);
String yyyymmdd = DateTimeFormatter.ISO_LOCAL_DATE.format(date);
//"2022-07-22"
String yyyymmdd = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
//"2022-07-22"
```

**DateTimeFormatter에 상수로 정의된 형식**

[https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html)

**ofPattern()**

원하는 출력형식을 직정 작성할 수도 있다.

**파싱**

```java
static LocalDateTime parse(CharSequence text) // 자주 사용되는 기본적인 형식
static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter);
//ofPattern()도 사용 가능하다.
```