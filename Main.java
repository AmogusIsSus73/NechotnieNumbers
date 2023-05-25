import java.util.*;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
                int num = scan.nextInt();
                arr.add(num);
            }
        System.out.println(arr);
        sort();
        scan.close();
    }

    public static void sort(){
        int sizeArr = arr.size();

        for (int i = 0;i < sizeArr;i++) {
            int getNum = arr.get(i);
            if (getNum % 2 == 1) {
                System.out.print(getNum + " ");
            }
        }
    }
}
