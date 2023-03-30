import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhập cạnh a: ");
            double a = input.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = input.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = input.nextDouble();
            if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
                throw new IllegalTriangleException("Tam giác không hợp lệ!");
            }
            System.out.println("Tam giác hợp lệ!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Các cạnh phải là số dương!");
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}
