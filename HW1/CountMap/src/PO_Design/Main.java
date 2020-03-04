package PO_Design;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------unitTestAddGetCount----------");
        unitTestAddGetCount();
	    System.out.println("-------unitTestSize-----------------");
        unitTestSize();
        System.out.println("-------unitTestRemove---------------");
        unitTestRemove();
    }

    private static void unitTestRemove() {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        int ret = map.remove(6);

        System.out.println(1 == ret && map.size() == 2);  // 3
    }

    private static void unitTestSize() {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(3 == map.size());  // 3
    }

    private static void unitTestAddGetCount() {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(2 == map.getCount(5));  // 2
        System.out.println(1 == map.getCount(6));  // 1
        System.out.println(3 == map.getCount(10)); // 3
    }
}
