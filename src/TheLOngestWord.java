import java.util.Scanner;

public class TheLOngestWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("inter words");
        String s = scn.nextLine();
        String[] word = s.split( " " );
        String rts = " ";

        for ( int i = 0; i < word.length; i++ )
        {
            if ( word[i].length() > rts.length() )
                rts = word[i];

        }
        System.out.println( rts );
    }
}
