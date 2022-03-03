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

    public static double average(int[][] list){
        double total = 0;
        int count = 0;
        for (int[] row : list){
            for (int element: row){
                total+=element;
                count++;
            }
        }
        return total/count;
    }

    public static int[] indexFound(String[][] list, String target){
        for (int row = 0; row < list.length; row++){
            for (int column = 0; column < list[0].length; column++){
                if (target.equals(list[row][column])){
                    int[] location = {row, column};
                    return location;
                }
            }
        }
        int[] location = {-1, 1};
        return location;

    }
}
