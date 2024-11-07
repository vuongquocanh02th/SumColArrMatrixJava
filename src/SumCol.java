import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Buoc 1: Tao mang ma tran co san va tinh tong cac cot
        System.out.println("1. Tinh tong cac phan tu 1 cot trong ma tran.");
        //Khoi tao nhanh 1 ma tran
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //Hien thi ma tran
        System.out.println("Ma tran co san:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Hoi nguoi dung cot nao muon tinh tong
        System.out.print("Nhap cot can tinh tong:(0-" + (matrix[0].length - 1) + "): ");
        int column = sc.nextInt();

        //Kiem tra xem nguoi dung co nhap cot hop le
        if (column < 0 || column >= matrix[0].length) {
            System.out.println("Cot khong hop le.");
        }
        //Tinh tong cac phan tu cua cot da chon
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        //In ra ket qua tong cua cot
        System.out.println("Tong cac phan tu trong cot " + column + " la " + sum);
        //Buoc 2: Thu thap mang thuc tu nhap lieu nguoi dung
        System.out.println("2. Thu thap mang thuc tu nguoi dung.");
        //Hoi kich thuoc ma tran tu nguoi dung
        System.out.print("Nhap so dong: ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int cols = sc.nextInt();

        //Khoi tao ma tran voi kich thuoc nguoi dung nhap
        int[][] userMatrix = new int[rows][cols];

        //Nhap cac phan tu cua ma tran tu nguoi dung
        System.out.println("Nhap cac phan tu cho ma tran:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap phan tu tai vi tri (" + i + "," + j + "): ");
                userMatrix[i][j] = sc.nextInt();
            }
        }

        //Hien thi ma tran nguoi dung da nhap
        System.out.println("Ma tran da nhap:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
        //Hoi nguoi dung muon tinh tong cot nao
        System.out.print("Nhap cot can tinh tong (0-" + (cols - 1) + "): ");
        column = sc.nextInt();

        //Kiem tra cot co hop le khong
        if(column<0||column>=cols){
            System.out.println("Cot khong hop le.");
        }
        //Tinh tong cac phan tu trong cot da chon
        sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][column];
        }

        //In ra ket qua tong cot
        System.out.println("Tong cac phan tu trong cot " + column + " la " + sum);
    }
}
