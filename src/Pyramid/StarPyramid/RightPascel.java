package Pyramid.StarPyramid;

public class RightPascel {

    public static void main(String[] args) {
        int  row = 5;

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = row -1 ; i >= 1; i--)
        {
            for (int j = 1; j <= i ; j++ )
            {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
