package Sort;

public class Radix {
    public static void sort(int[] A){
        int N = A.length;
        int exp = 1;
        int[] B = new int[N];

        int max = A[0];
        for(int i = 1; i < N; i++){
            if(A[i] > max) max=A[i];
        }

        while(max/exp > 0) {
            int[] C = new int[10];
            for (int i = 0; i < N; i++) C[(A[i]/exp) % 10]++;
            for (int i = 1; i < 10; i++) C[i] += C[i - 1];
            for (int i = N - 1; i >= 0; i--) B[--C[(A[i]/exp) % 10]] = A[i];
            for(int i = 0; i < N; i++){
                A[i] = B[i];
            }
            System.out.println();
            exp *= 10;
        }

    }

    public static void main(String[] args){
        int[] A = {306,208,9,33,55,859,271,179,984,93};
        Radix.sort(A);
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}
