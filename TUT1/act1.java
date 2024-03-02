package TUT1;
import java.util.Scanner;
public class act1 {
    public static void main(String[] args) {
        String[] D = {
                "******       ",
                "**    **     ",
                "**     **    ",
                "**      **   ",
                "**      **   ",
                "**      **   ",
                "**     **    ",
                "**    **     ",
                "******       "

        };
        String[] J = {
                " **************   ",
                "       **         ",
                "       **         ",
                "       **         ",
                "       **         ",
                "       **         ",
                "**     **         ",
                " **    **         ",
                "   **  **         ",
                "     ****         "
        };
        String[] E = {
                "**********",
                "**",
                "**",
                "**",
                "********",
                "**",
                "**",
                "**",
                "**********",
        };
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str.toUpperCase();
        for (int k = 0; k < 9; k++) {
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case 'D':
                            System.out.print(D[k]);
                            break;
                    case 'J':
                            System.out.print(J[k]);
                            break;
                    case 'E':
                        System.out.print(E[k]);
                        break;

                }
            }
            System.out.println();
    }

    }
}
