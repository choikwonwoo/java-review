package day6;

public class Computer extends Calculator{
    @Override
    double areaCircle(double R) {
        super.areaCircle(R); // 얘는 오버라이딩 전의 메소드
        return Math.PI * R*R;
    }
}
