package Pyramid.StarPyramid;

public class butterFly {
    public static void main(String[] args) {

        int row = 5;
                for(int i = 1; i <= row; i++)
                {
                    for(int star = 1; star <= 2 * row; star++)
                    {
                        if( star > i &&  star <= 2 * row - i )
                        {
                            System.out.print(" ");
                        }
                        else
                        {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }

                for (int i = row -1 ; i >= 1; i--)
                {
                    for(int col = 1; col <= 2 * row; col++)
                    {
                        if( col > i && col <= 2 * row - i)
                        {
                            System.out.print(" ");
                        }
                        else
                        {
                            System.out.print("*");
                        }

                    }
                    System.out.println();
                }
    }
}
