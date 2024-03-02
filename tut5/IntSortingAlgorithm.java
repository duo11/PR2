package tut5;
import java.util.Arrays;
public class IntSortingAlgorithm {
    private String name;
    private int[] array;
    private int[] sortedArray;
    public IntSortingAlgorithm(){};
    public IntSortingAlgorithm(String name, int[] array) {
        this.name = name;
        this.array = array;
        this.sortedArray = array.clone();
    }

    public int[] getArray() {
        return array;
    }
    public int[] getSortedArray(){
        return sortedArray;
    }

    public void sort(){}
    public boolean isSorted() {
        return !Arrays.equals(array, sortedArray);
    }
    @Override
    public String toString() {
        StringBuilder arrayString = new StringBuilder();
        for(int i = 0; i < array.length;i++){
            arrayString.append(array[i]);
            if(i != array.length-1)arrayString.append(",");
        }

        StringBuilder sortedArrayString = new StringBuilder();
        for(int i = 0; i < sortedArray.length;i++){
            sortedArrayString.append(sortedArray[i]);
            if(i != sortedArray.length-1)sortedArrayString.append(",");
        }
        if(isSorted()){
            return "name=\""+name+"\",array=["+ arrayString +"]"+",sorted Array=["+sortedArrayString+"]";
        }
        else{
            return "name=\""+name+"\",array=["+ arrayString +"]";
        }

    }
    public static void main(String[] args) {
        IntSortingAlgorithm a1 = new MergeSort("array1",new int[]{6,9,1,7,2,4,0,3});
        IntSortingAlgorithm a2 = new BubbleSort("array1",new int[]{89,455,1,23,772,12,6,7});
        a1.sort();
        a2.sort();
        System.out.println(a1);
        System.out.println(a2);
    }

}
