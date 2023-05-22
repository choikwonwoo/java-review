package day10;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        String photo1Path = clazz.getResource("photo1.jpg").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
        // car 클래스가 위치하는 경로에 이미지가 있는 경우 위와같이 추출.
    }
}
