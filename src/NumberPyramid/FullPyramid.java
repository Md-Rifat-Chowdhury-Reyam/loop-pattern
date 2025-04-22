package NumberPyramid;

public class FullPyramid {

    public static void main(String[] args) {
        int row =5; int count = 0; int k = 0; int count1 = 0;

        for(int i = 1; i <= row; i++ )
        {
            for (int space = 1; space <= row - i; space++)
            {
                System.out.print("  ");
//                                                                        1
//                                                                      2 3
//                                                                    3 4 5
//                                                                  4 5 6 7
//                                                                5 6 7 8 9
                count++;
            }

            while (k != 2 * i - 1)
            {
                if(count <= row - 1)
                {
                    System.out.print(( i + k) + " ");
//                                                                        1
//                                                                      2 3
//                                                                    3 4 5
//                                                                  4 5 6 7
//                                                                5 6 7 8 9
                    count++;
                }

                else
                {
                    count1++;
//                                  1
//                                2 3 2
//                              3 4 5 4 3
//                            4 5 6 7 6 5 4
//                          5 6 7 8 9 8 7 6 5
                    System.out.print( (i + k - 2 * count1) + " "  );
                }

                k++;
            }
            count1 = count = k = 0;
            System.out.println();
        }
    }
}
