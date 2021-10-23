import java.time.LocalTime;

public class Main {
    public static void main(String[] args){
        //these are for testing purpose only...

        Restaurant restaurant1 = new Restaurant("Pardise","Secunderabad", LocalTime.parse("10:15:00"),LocalTime.parse("23:59:59"));
        Restaurant restaurant2 = new Restaurant("Bawarchi","RTC Cross Roads", LocalTime.parse("11:15:00"),LocalTime.parse("22:59:59"));
        Restaurant restaurant3 = new Restaurant("Pardise","Secunderabad", LocalTime.parse("10:15:00"),LocalTime.parse("23:59:59"));
    }


}