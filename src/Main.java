import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> arrayList = new ArrayList<>();

        City city = new City(82321, "Moscow");
        City city2 = new City(13564, "Bishkek");
        City city3 = new City(45987, "Osh");
        City city4 = new City(65786, "Istanbul");

        arrayList.add(city);
        arrayList.add(city2);
        arrayList.add(city3);
        arrayList.add(city4);

        for (City cityName : arrayList) {
            if (cityName.getCode() % 2 != 0) {
                Set<City> ts = new TreeSet<>((o1, o2) -> o2.getCode() - o1.getCode());
                ts.add(cityName);
                System.out.println(ts);
            }
        }
        System.out.println(arrayList);

    }
}