package Square;

public class $diamond {
    public static void main(String[] args) {
        int row = 5;

        for(int i = 1; i <= row; i++)
        {
            for (int space = 1; space <= row - i; space++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row -1; i >= 1; i--)
        {
            for (int space = 1; space <= row - i; space++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
