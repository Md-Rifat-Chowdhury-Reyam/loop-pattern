package Square;

public class Rombhos {
    public static void main(String[] args) {
        int row = 5;

        for(int i = 0; i < row ; i++)
        {
            for(int space = 0; space < row - i; space++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < row; j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
