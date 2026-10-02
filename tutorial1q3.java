import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        if (seat % 2 == 0) {
            System.out.println("Seat number is Even");
        } else {
            System.out.println("Seat number is Odd");
        }

        sc.close();
    }
}