package Sort;

//Bottom-up 방식의 merge

import static java.lang.Math.min;

public class Merge2 extends AbstractSort{

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
        for(int i = 1; i < a.length; i *= 2){
            for(int j = 0; j < a.length; j += 2*i){
                Comparable[] aux = new Comparable[a.length];
                merge(a,aux,j,i+j-1,Math.min(j + 2 * i -1, a.length - 1));
            }
        }
    }

    public static void main(String[] args){
        Integer[] A = {1,5,8,43,1,3,56,4,3,1};
        Merge2.sort(A);
        Merge2.show(A);
    }
}
