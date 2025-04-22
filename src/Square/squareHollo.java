package Square;


public class squareHollo {

   public void patternPrint(int n)
    {
        for (int i = 1; i <= n; i++ )
        {
            for (int j = 1; j <= n; j++)
            {
               if (i == 1 || i == n || j == 1 || j== n)
               {
                   System.out.print(" *");
               }
               else
               {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        squareHollo s = new squareHollo();
        s.patternPrint(5);
    }
}
