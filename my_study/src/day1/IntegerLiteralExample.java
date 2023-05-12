package day1;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        // int 는 4바이트, 32비트의 메모리를 사용한다.
        int var1 = 0b1011; // 2진수
        int var2 = 0206; // 8진수
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        // byte 는 1바이트, 8비트의 메모리를 사용한다.
        byte bvar1 = 0b1011111; // 2진수
        byte bvar2 = 0x1f; // 16진수
//        byte bvar3 = 128; // 용량 초과
//        byte bvar4 = -129; // 용량 초과
        System.out.println(bvar1);
        System.out.println(bvar2);

        // long 은 8바이트, 64비트의 메모리를 사용한다.
        long lvar1 = 1000000000000L; // int 허용범위 이내 일 경우 L 생략 가능
        System.out.println(lvar1);

        // char 은 2바이트, 16비트의 메모리를 사용한다.
        char cvar1 = 'a';
        char cvar2 = '가';
        char cvar3 = 65;
        char cvar4 = 0x0041; // 유니코드 표현 가능
        System.out.println(cvar1);
        System.out.println(cvar2);
        System.out.println(cvar3);
        System.out.println(cvar4);

        // string은 기본타입이 아니다.
        String svar1 = "하이";
        String svar2 = " \" \n \t \\"; // 특정 문자를 표시하기 위해 이스케이프 문자를 사용한다.
        System.out.println(svar1);

        // float은 4바이트 32비트의 메모리를 사용한다. + 소수 7자리 까지 표현 가능
        float fvar1 = 32.125872F;
        float fvar2 = 5e2F;
        float fvar3 = 0.12E-2F;
        System.out.println(fvar1);
        System.out.println(fvar2);
        System.out.println(fvar3);

        // double은 8바이트 64비트의 메모리를 사용한다. + 소수 15자리표현 가능 소수점의 기본 타입이다.
        double dvar1 = 12.1;
        System.out.println(dvar1);

        // boolean은 1바이트의 메모리를 차지한다.
        boolean tvar = true;
        boolean fvar = false;
    }
}
