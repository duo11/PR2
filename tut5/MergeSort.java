package tut5;

public class MergeSort extends IntSortingAlgorithm{

    public MergeSort(String s, int[] a) {
        super(s,a);
    }

    @Override
    public void sort() {
        mergeSort(getSortedArray(),0,getSortedArray().length-1);
    }
    public static void mergeSort(int[] a,int start,int end) {
        if(start < end){
            int middle = (start+end)/2;
            mergeSort(a,start,middle);
            mergeSort(a,middle+1,end);
            merge(a,start,middle,end);
        }

    }
    public static void merge(int[] a,int start,int middle,int end){
        int i = start,j=middle+1,k = start;

        int[] temp = new int[a.length];

        while(i <= middle && j <= end){
            if(a[i] < a[j]){
                temp[k++] = a[i++];
            }
            else{
                temp[k++] = a[j++];
            }
        }
        while(i <= middle){
            temp[k++] = a[i++];
        }
        while(j <= end){
            temp[k++] = a[j++];
        }
        for(int m = start; m <= end;m++){
            a[m] = temp[m];
        }


    }
}
