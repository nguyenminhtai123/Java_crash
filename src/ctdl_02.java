import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class ctdl_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }

        ArrayList<Integer> uniqueList = removeDuplicates(list);

        for(int i = 0; i < uniqueList.size(); i++) {
            System.out.print(uniqueList.get(i) + " ");
        }
    }

    private static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (Integer element : list) {
            if (set.add(element)) {
                uniqueList.add(element);
            }
        }

        return uniqueList;
    }
}
