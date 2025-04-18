package AlphabetPyramid;

public class RightHalfSameRow {

    public static void main(String[] args) {
        char last ='e';
        char first ='a';

        for (int i = 1; i <= last - 'a' + 1; i++, first++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print( first + "");
            }

            System.out.println();
        }
    }
}
