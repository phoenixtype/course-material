import java.util.*;
import java.util.stream.Collectors;

public class DuplicateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        System.out.println("ArrayList with duplicates: " + list);
        ArrayList<Integer> newList = Duplicate1.removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: " + newList);
        List<Integer> newList2 = Duplicate2.removeDuplicates2(list);
        System.out.println("ArrayList with duplicates removed: " + newList2);
    }

    class Duplicate1 {
        public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list1) {
            Set<T> set = new LinkedHashSet<>();
            set.addAll(list1);
            list1.clear();
            list1.addAll(set);
            return list1;
        }
    }

    class Duplicate2 {
        public static List<Integer> removeDuplicates2(ArrayList<Integer> list) {
            List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
            return newList;
        }
    }
}