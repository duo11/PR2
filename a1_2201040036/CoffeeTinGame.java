package a1_2201040036;
import java.util.Arrays;
import java.util.Random;

public class CoffeeTinGame {
    private static final char GREEN = 'G';
    private static final char BLUE = 'B';
    private static final char REMOVED = '-';
    private static final char NULL = '\u0000';

    public static void main(String[] args) {

        char[][] tins = {
                {BLUE, BLUE, BLUE, GREEN, GREEN},
                {BLUE, BLUE, BLUE, GREEN, GREEN, GREEN},
                {GREEN},
                {BLUE},
                {BLUE, GREEN}
        };

        for (int i = 0; i < tins.length; i++) {
            char[] tin = tins[i];
            // expected last bean
            // p0 = green parity /\
            // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)
            // count number of greens
            int greens = 0;
            for (char bean : tin) {
                if (bean == GREEN)
                    greens++;
            }
            // expected last bean
            final char last = (greens % 2 == 1) ? GREEN : BLUE;

            // print the content of tin before the game
            System.out.printf("%nTIN (%d Gs): %s %n", greens, Arrays.toString(tin));

            // perform the game
            // get actual last bean
            char lastBean = tinGame(tin);
            // lastBean = last \/ lastBean != last

            // print the content of tin and last bean
            System.out.printf("tin after: %s %n", Arrays.toString(tin));

            // check if last bean as expected and print
            if (lastBean == last) {
                System.out.printf("last bean: %c%n", lastBean);
            } else {
                System.out.printf("Oops, wrong last bean: %c (expected: %c)%n", lastBean, last);
            }
        }
    }
    
    //2a. Create BeanBags
    public static char[] BeansBag = new char[30];

    static {
        for(int i = 0; i < BeansBag.length-2;i+=3) {
            BeansBag[i] = BLUE;
            BeansBag[i+1] = GREEN;
            BeansBag[i+2] = REMOVED;
        }
    }
//2b. Change tinGame and takeOne to public
    //2h. Procedure tinGame: must be modified to use procedure updateTin
    public static char tinGame(char[] tin) {
        while (hasAtLeastTwoBeans(tin)) {
            char[] twoBeans = takeTwo(tin);
            char b1 = twoBeans[0];
            char b2 = twoBeans[1];
            updateTin(tin, b1, b2); //modified
        }
        return anyBean(tin);
    }
    //2e. Procedure takeOne
    public static char takeOne(char[] tin) {
        int i = 0;
        while(tin[i] == REMOVED ) i++;
        if(i != tin.length){
            int a = randInt(tin.length);
            while(tin[a] == REMOVED){
                a = randInt(tin.length);
            }
            char bean = tin[a];
            tin[a] = REMOVED;
            return bean;
        }
        // no beans left
        else{
            return NULL;
        }

    }
    
//2c. Create 3 new public procedures: randInt, getBean, updateTin.
    //2d. Procedure randInt.
    public static int randInt(int n) {
        Random rand = new Random();
        return rand.nextInt(n);
    }
    //2f. Procedure getBean
    public static char getBean(char[] beansBag, char beanType) {

        int a = randInt(beansBag.length);
        while(beansBag[a] != beanType){
            a = randInt(beansBag.length);
        }
        char bean = beansBag[a];
        beansBag[a] = REMOVED;
        return bean;
    }
    //2g. Procedure updateTin
    public static void updateTin(char[] tin, char beanOne, char beanTwo) {
        if (beanOne == beanTwo) {
            putIn(tin,getBean(BeansBag, BLUE));
        } else {
            putIn(tin,GREEN);
        }
    }
    private static char anyBean(char[] tin) {
        for (char bean : tin) {
            if (bean != REMOVED) {
                return bean;
            }
        }

        // no beans left
        return NULL;
    }

    private static boolean hasAtLeastTwoBeans(char[] tin) {
        int count = 0;
        for (char bean : tin) {
            if (bean != REMOVED) {
                count++;
            }

            if (count >= 2) // enough beans
                return true;
        }

        // not enough beans
        return false;
    }
    private static char[] takeTwo (char[] tin) {
        char first = takeOne(tin);
        char second = takeOne(tin);
        return new char[]{first,second};
    }
    private static void putIn(char[] tin, char bean) {
        for (int i = 0; i < tin.length; i++) {
            if (tin[i] == REMOVED) { // vacant position
                tin[i] = bean;
                break;
            }
        }
    }




}

