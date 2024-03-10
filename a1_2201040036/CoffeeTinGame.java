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

            int greens = 0;
            for (char bean : tin) {
                if (bean == GREEN)
                    greens++;
            }

            final char last = (greens % 2 == 1) ? GREEN : BLUE;

            // print the content of tin before the game
            System.out.printf("%nTIN (%d Gs): %s %n", greens, Arrays.toString(tin));


            char lastBean = tinGame(tin);

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

    public static char[] BeansBag = new char[30];

    static{
        for (int i = 0; i <10; i++ ){
            BeansBag[i] = BLUE;
        }
        for (int i = 10; i <20; i++ ){
            BeansBag[i] = GREEN;
        }
        for (int i = 20; i <30; i++ ){
            BeansBag[i] = REMOVED;
        }
    }
    public static char tinGame(char[] tin){
        int numberOfBeans = tin.length;

        while(numberOfBeans>=2){
            numberOfBeans=0;
            char bean1 = takeOne(tin);
            char bean2 = takeOne(tin);
            updateTin(tin,bean1,bean2);
            for (char c : tin) {
                if (c == BLUE || c == GREEN) {
                    numberOfBeans++;
                }
            }
        }
        for(int i =0; i< tin.length; i++){
            if(tin[i]==GREEN||tin[i]==BLUE){
                return tin[i];
            }
        }
        return NULL;
    }

    public static char getBean(char[] beansBag, char beanType){
        int a = randInt(beansBag.length);
        while(beansBag[a] != beanType){
            a = randInt(beansBag.length);
        }
        char temp = beansBag[a];
        beansBag[a]=REMOVED;
        return temp;
    }
    public static char takeOne(char[] beansBag){
        int numberOfSpaces = 0;
        for (char c : beansBag) {
            if (c==NULL) {
                numberOfSpaces++;
            }
        }
        if(numberOfSpaces!=beansBag.length){
            
            int a = randInt(beansBag.length);
            
            while(beansBag[a]==NULL){
                a = randInt(beansBag.length);
            }
            
            char temp = beansBag[a];
            beansBag[a]= NULL;
            return temp;
        }
        else{
            return NULL;
        }
    }

    public static void updateTin(char[] tin, char bean1, char bean2){
        if (bean1 == bean2){
            char newBlueBean = getBean(BeansBag,BLUE);
            int index = randInt(tin.length);
            while(tin[index]!=NULL){
                index = randInt(tin.length);
            }
            tin[index] = newBlueBean;
        }
        else{
            int index = randInt(tin.length);
            while(tin[index]!=NULL){
                index = randInt(tin.length);
            }
            tin[index] = GREEN;
        }
    }

    public static int randInt(int n){
        Random rand = new Random();
        return rand.nextInt(n);
    }
}