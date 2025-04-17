public class PascelPyramid {

    public static void main(String[] args) {

        int row = 5;
        int coEf = 1;
        for(int i = 0; i < row; i++)
        {
            for(int space = 1; space < row - i ; space ++)
            {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++)
            {
                if((j == 0) || (i == 0))
                {
                    coEf = 2;

                }
                else
                {
                    coEf = coEf * (i - j + 1) / j;
                }
                System.out.printf("%4d", coEf);
            }
            System.out.println();
        }
    }
}
