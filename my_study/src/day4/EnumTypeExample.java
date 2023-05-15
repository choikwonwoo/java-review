package day4;

import java.util.Calendar;

public class EnumTypeExample {
    public static void main(String[] args) {
        SeasonEnum season1 = SeasonEnum.SPRING;
        SeasonEnum season2 = SeasonEnum.SUMMER;
        SeasonEnum season3 = SeasonEnum.FALL;
        SeasonEnum season4 = SeasonEnum.WINTER;

        boolean a = season1 == SeasonEnum.SPRING;
        // 변수 season1 은 힙 영역에서 SeasonEnum(SPRING) 객체를 참조하고
        // SPRING 은 힙영역에서 SeasonEnum(SPRING) 같은 객체를 참조 하므로 true

        // Application
        SeasonEnum nowSeason = null;
        Calendar cal = Calendar.getInstance();
        int season = cal.get(Calendar.DAY_OF_MONTH);
        if(3<=season && season<=5){
            nowSeason = SeasonEnum.SPRING;
        }else if(6<=season && season<=8){
            nowSeason = SeasonEnum.SUMMER;
        }else if(9<=season && season<=11){
            nowSeason = SeasonEnum.FALL;
        }else if(season==12 && season<3){
            nowSeason = SeasonEnum.WINTER;
        }
    }
}
