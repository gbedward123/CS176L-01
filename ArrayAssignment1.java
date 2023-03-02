
import java.util.ArrayList;

public class ArrayAssignment1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add((int) 25.3);
        list.add(100);
        list.add(-10);
        list.add((int) -1.5);
        list.add(13);
        list.add((int) 98.6);
        list.add(17);
        list.add((int) 123.145);
        list.add((int) 125.6);
        list.add((int) 123.146);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(Integer val: list) {
            if(val > max) {
                max = val;
            }
            if(val < 0) {
                count++;
            }
            System.out.print(val + " ");
        }
        System.out.println("\nThe largest element in the array is " + max);
        System.out.println("There are " + count + " negative numbers in the array");
    }

}