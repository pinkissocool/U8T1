public class FunWith2DArrays {
    public static int totalElements(int[][] list){
        int total = list[0].length * list.length;
        return total;

    }

    public static void fourCorners(String[][] list){
        int lastColumn = list[0].length-1;
        int lastRow = list.length-1;
        System.out.println(list[0][0]);
        System.out.println(list[0][lastColumn]);
        System.out.println(list[lastRow][0]);
        System.out.println(list[lastRow][lastColumn]);
    }
}
