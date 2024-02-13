import java.util.HashMap;

public class Main {

    private static HashMap<Integer,String> map = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
        long start = System.currentTimeMillis();
        int a =1;//im wieksza wartosc tym wieksza wydajnosc
        for (int i = 0; i < 5000000; i++) {
            map.put(i/a,"tramwaj");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}