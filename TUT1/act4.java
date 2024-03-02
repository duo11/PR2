package TUT1;
public class act4 {
    /**
     2 * This class implements a simple program that
     3 * will compute the amount of interest that is
     4 * earned on 17,000 invested at an interest
     5 * rate of 0.07 for one year. The interest and
     6 * the value of the investment after one year are
     7 * printed to standard output.
     8 */
        public static void main(String[] args) {
             /* Declare the variables. */
             int principal;
             double rate;
             double interest;
             principal = (int) 17000.0;
             rate = 0.07;
             interest = principal * rate;
             principal = (int) (principal + interest);
             /* Output the results. */
             System.out.print("The interest earned is ");
             System.out.println(interest);
             System.out.print("The value of the investment after one year is ");
             System.out.println(principal);
             }

}
/**Question
*a)  Change the statement at line 16 to the following statement. Compile and run
*    the program again. Does it work? Why do you think that is?
*    principal = 17000.0;
*
*
*b)  Change the statement at line 12 to the following statement.
*    Compile the program again. Does it work? Why do you think that is? Can you fix it
*    without reversing the change?
*    int principal;
*
*Answer
*a)  Does it work? - it work
*    Why do you think that is? - because principal is double so it still correct
*b)  Does it work> - it doesn't work
*    Why do you think that is? - principal with int type can't be assign with double type in line 16 and line 19;
*    Can you fix it without reversing the change? - by change the line 16 to "principal = (int) 17000.0;"
*                                                   and line 19 to "principal = (int) (principal + interest);"
**/