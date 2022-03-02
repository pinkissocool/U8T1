import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        String[][] names = new String[3][4];
//        String[] row1 = {"Abby", "Don", "George", "Dan"};
//        String[] row2 = {"Brian", "Elenor", "Ryan", "David"};
//        String[] row3 = {"Cathy", "Fred", "Jed", "Matt"};
//        names[0] = row1;
//        names[1] = row2;
//        names[2] = row3;
//
//        for (String[] row : names){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//        names[1][2] = "Paul";
//        for (String[] row : names){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//        String temp = names[0][0];
//        names[0][0] = names[2][3];
//        names[2][3] = temp;
//        for (String[] row : names){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//
//        String[] temporary = names[0];
//        names[0] = names[1];
//        names[1] = temporary;
//        for (String[] row : names){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//        int[][] list1 = new int[2][3];
//        int[][] list2 = new int[3][2];
//
//        for (int[] row : list1){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//        for (int[] row : list2){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println("---------------------");
//        list1[0][0] = 1;
//        list1[0][1] = 2;
//        list1[0][2] =3 ;
//        list1[1][0] = 4;
//        list1[1][1] = 5;
//        list1[1][2] = 6;
//        for (int[] row : list1){
//            System.out.println(Arrays.toString(row));
//        }
//
//
//        System.out.println("---------------------");
//        list2[0][0] = 1;
//        list2[0][1] = 4;
//        list2[1][0] =2 ;
//        list2[1][1] = 5;
//        list2[2][0] = 3;
//        list2[2][1] = 6;
//        for (int[] row : list2){
//            System.out.println(Arrays.toString(row));
//        }
//        System.out.println(list1[0][2] + list2[2][0]);
        int[][] list1 = {{}};
        System.out.println(FunWith2DArrays.totalElements(list1));

        String[][] list2 = {{"time"}};
        FunWith2DArrays.fourCorners(list2);
    }
}
