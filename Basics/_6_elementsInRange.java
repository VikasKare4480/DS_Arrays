import java.util.Scanner;

class _6_elementsInRange {

    static boolean elementRange(int[] arr, int A, int B) {

        int found[] = new int[B - A+ 1];

        for(int i =0; i < )

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter size of arary : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {

            System.out.print("Enter " + (i + 1)  + " element : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Start of Range : ");
        int A = sc.nextInt();

        System.out.print("Enter end of Range : ");
        int B = sc.nextInt();

        int num = A;

        elementRange(arr, A, B);
    }   
}
