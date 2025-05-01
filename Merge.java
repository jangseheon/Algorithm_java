package Sort;

//Top-down 방식 Merge sort

public class Merge extends AbstractSort{
    public static void merge(Comparable[] a,Comparable[] aux, int lo, int mid, int hi){
        for(int i = lo; i <= hi; i++){
            aux[i] = a[i];
        }

        int j = lo, k = mid + 1;
        for(int i = lo; i <= hi ; i++){
            if(j > mid) a[i] = aux[k++];
            else if(k > hi) a[i] = aux[j++];
            else if(less(aux[k],aux[j])) a[i] = aux[k++];
            else a[i] = aux[j++];
        }
    }

    public static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }

    public static void sort(Comparable[] a,Comparable[] aux, int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi - lo) / 2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid + 1,hi);
        merge(a,aux,lo,mid,hi);
    }



    public static void main(String[] args){
        Integer[] A = {1,5,8,43,1,3,56,4,3,1};
        Merge.sort(A);
        Merge.show(A);
    }
}
