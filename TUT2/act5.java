package TUT2;

public class act5 {
    public static int lowestCommon(long num1, long num2) {
        String binNum1 = Long.toBinaryString(num1);
        String binNum2 = Long.toBinaryString(num2);

        StringBuilder reversedBinNum1 = new StringBuilder(binNum1).reverse();
        StringBuilder reversedBinNum2 = new StringBuilder(binNum2).reverse();

        int minLen = Math.min(reversedBinNum1.length(), reversedBinNum2.length());

        for (int i = 0; i < minLen; i++) {
            if (reversedBinNum1.charAt(i) == '1' && reversedBinNum2.charAt(i) == '1') {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(lowestCommon(14,25));
    }
}
