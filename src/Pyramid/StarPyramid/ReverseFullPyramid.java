package Pyramid.StarPyramid;

public class ReverseFullPyramid {

    public static void main(String[] args) {
        int row = 5;
        int k = 0;

        for(int i = row; i >= 1; i--, k = 0 )
        {
            for (int space = row; space >= i - 1; space--)
            {
                System.out.print(" ");
            }
            while (k != 2 * i - 1)
            {
                System.out.print("*");
                k++;

            }
            System.out.println();
        }
    }
}
