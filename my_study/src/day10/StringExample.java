package day10;

public class StringExample {
    public static void main(String[] args) {
        // indexof
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        System.out.println(location); // 3 출력

        // length
        String str = "9908251234567";
        if (str.length() == 13){
            System.out.println("주민이다");
        }else{
            System.out.println("아니다.");
        }

        //replace
        str.replace("99","00");

        // subString
        str.substring(0,6); // 0번째 부터 5번째까지!
        str.substring(7); // 7번째 부터 끝까지!

        // toUpperCase(); , toLowerCase(); 각각 소문자 대문자 변경
        // trim(); 문자열 공백 제거
        // valueOf(); 다른 기본 자료형을 String 으로 변환
    }
}
