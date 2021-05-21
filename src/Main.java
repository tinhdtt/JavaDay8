import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng và số cột = ");
        int num = sc.nextInt();


        int A[][] = new int[num][num];
        System.out.println("==Nhập mảng A==");
        inputValue(A, num);

        System.out.println("\n==In mảng A==");
        show(A, num);

        System.out.println("\n==Các phần tử trên đường chéo chính==");
        diagonal(A, num);

        System.out.println("\n==Sắp xếp lại các phần tử ở hàng 2 theo chiều tăng dần==");
        reorderAsc(A, num);




    }

    public static void inputValue(int[][] arr, int num) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("Nhập giá trị phần tử ở vị trí " + i + " - " + j + " = ");
                arr[i][j] = sc.nextInt();

            }
        }

    }

    public static void show(int[][] arr, int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void diagonal(int[][] arr, int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + "\t");
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("\nTổng các phần tử trên đường chéo chính = " + sum);
    }

    public static void reorderAsc(int[][] arr, int num) {
        for (int i = 0; i < num -1 ; i++) {
            int temp;
            if (arr[1][i] > arr[1][i+1]) {
                temp = arr[1][i];
                arr[1][i] = arr[1][i+1];
                arr[1][i+1] = temp;
            }
            System.out.print(arr[1][i] + "\t");
        }
    }
}
