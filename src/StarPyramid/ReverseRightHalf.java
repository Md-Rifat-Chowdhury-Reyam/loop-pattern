package StarPyramid;

public class ReverseRightHalf {

    public static void main(String[] args) {
        int row = 5;

        for(int i = row; i >= 1; i-- )
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + ""); //number
            }


            for (int j = 1; j <= row - i ; j++)
            {
                System.out.print(" "); // space
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*"); // star
            }
            System.out.println();
        }
    }
}
