import java.util.ArrayList;
import java.util.Arrays;


class TripExample{
	

	public static void main(String[]args){
		planningTrip();
	}
	public static void planningTrip(){

		String [] locationArr=location();
		ArrayList<String> list=travellers(locationArr);
		ArrayList<String> objects=essentials();

		System.out.println(Arrays.toString(locationArr));
		System.out.println(list);
		System.out.println(objects);

	}

	public static String[] location(){
		String location="DagaduSheth Ganpati";
		String time="8:50am";
		String date="09/10/2025";

		String [] locationArr={location,time,date};
		return locationArr;
	}

	public static ArrayList<String> travellers(String[]locationArr){
		String person1="Omkar";
		String person2="jivan";
		String person3="pratik";

		ArrayList<String> listPerson=new ArrayList<String>();
		listPerson.add(person1);
		listPerson.add(person2);
		listPerson.add(person3);

		return listPerson;

	}

	public static ArrayList essentials(){
		String waterBottle="MILTION";
		String mobile="SAMSUNG S21";
        double money=101;
        String flower="HIBISCUS";
        String dua="lavkar job lagu de";
        String sweet="UKIDICHA MODAK";

        ArrayList essentials=new ArrayList();
        essentials.add(waterBottle);
        essentials.add(mobile);
        essentials.add(money);
        essentials.add(flower);
        essentials.add(dua);
        essentials.add(sweet);

        return essentials;

	}
}
