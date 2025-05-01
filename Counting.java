package Sort;

public class Counting{
    public static int[] sort(int[] a,int N){
        int[] C = new int[N]; int[] B = new int[a.length];

        for(int i = 0; i < a.length ; i++) C[a[i]]++;
        for(int i = 1; i < N; i++) C[i] += C[i-1];
        for(int i = a.length - 1; i >= 0 ; i--) B[--C[a[i]]] = a[i];

        return B;
    }

    public static void main(String[] args){
        int[] A = {10,4,5,8,1,8,3,6}, B;
        B = Counting.sort(A,11);
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }
}
