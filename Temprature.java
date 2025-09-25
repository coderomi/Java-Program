import java.util.Scanner;

public class Temprature
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        float temp=29.3f;
        float uvIndex=7.5f;
        float humidity=68.4f;
        float maxtemp=25;
        float mintemp=28;
        float airQuality=37;
        float windspeed=2;
        float pressure=100.5f;
        float visibility=4.02f;
        System.out.println("weather forcasting of :-"+name );
        System.out.println("Temperature:-"+temp+"");
        System.out.println("uvIndex:-"+uvIndex+"");
        System.out.println("humidity:-"+humidity+"");
        System.out.println("max temp:-"+maxtemp+"");
        System.out.println("min temp:-"+mintemp+"");
        System.out.println("air Quality:-"+airQuality+"");
        System.out.println("windSpeed"+windspeed+"");
        System.out.println("pressure :-"+pressure+"");
        System.out.println("visibility:-"+visibility+"");





    }
}
