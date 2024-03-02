package TUT2;

public class act4 {

    public static int[][] transpose (int[][] arr) {

        for(int i = 0; i < arr.length;i++){
            for(int j = i; j < arr[i].length;j++){

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        return arr;

    }
    public static void print2dArr (int[][] arr) {
        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j <  arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        print2dArr(arr);

        System.out.println("transpose:");

        int[][] arrT = transpose(arr);
        print2dArr(arrT);

    }
}
