import java.util.Scanner;

public class FloydPyramid {

    public static void main(String[] args) {
        //user Input
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        int num = 1;

        //row
        for(int i = 1; i <= row; i++  )
        {
            for (int j = 1; j <= i; j++,num++)
            {
                System.out.print(num + " ");


            }

            System.out.println();
        }
    }
}
