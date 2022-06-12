package Demo_Student;

import java.util.Arrays;
import java.util.Comparator;

public class demo_Arrays {
    public static void main(String[] args) {
        int[] arr= {45,26,734,27,16,10678,85};
        System.out.println (arr);
        System.out.println (Arrays.toString (arr));
        Arrays.sort(arr);
        System.out.println (Arrays.toString (arr));
        System.out.println (Arrays.binarySearch(arr,26));

        Integer[] arr1 = {45,26,734,27,16,10678,85};
        Arrays.sort(arr1,new Comparator<Integer> () {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println (Arrays.toString(arr1));
        System.out.println ("---------------------------");
        Students[] students = new Students[3];
        students[0] = new Students("肥波",12,150);
        students[1] = new Students("肥啾",22,160);
        students[2] = new Students("修狗",8,120);

        Arrays.sort (students, new Comparator<Students> () {
            @Override
            public int compare(Students o1, Students o2) {
                return Double.compare (o1.getHeight () ,o2.getHeight ());
            }
        });
        System.out.println (Arrays.toString(students));
    }
}
