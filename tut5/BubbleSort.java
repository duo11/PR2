package tut5;

public class BubbleSort extends IntSortingAlgorithm {
    public BubbleSort(String s, int[] a) {
        super(s,a);
    }

    @Override
    public void sort() {
        for(int i = 0; i < getSortedArray().length;i++) {
            for(int j = 0; j < getSortedArray().length-1;j++) {
                if(getSortedArray()[j+1] < getSortedArray()[j]){
                    int temp = getSortedArray()[j];
                    getSortedArray()[j] = getSortedArray()[j+1];
                    getSortedArray()[j+1] = temp;
                }
            }
        }
    }
}
