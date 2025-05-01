package Sort;

public class Bucket {
    public static int[] sort(int[] A){
        int[] C1 = new int[10],C2 = new int[10], B = new int[A.length];

        int index1 = 0, index2 = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] < 10) index1++;
            else index2++;
        }


        int[] Bucket1 = new int[index1], Bucket2 = new int[index2], NewB1 = new int[index1], NewB2 = new int [index2];

        for(int i = A.length - 1; i >= 0; i--){
            if(A[i] < 10) Bucket1[--index1] = A[i];
            else Bucket2[--index2] = A[i];
        }

        for(int i = 0; i < Bucket1.length; i++) C1[Bucket1[i]]++;
        for(int i = 1; i < 10; i++) C1[i] += C1[i-1];
        for(int i = Bucket1.length - 1; i >= 0; i--) NewB1[--C1[Bucket1[i]]] = Bucket1[i];


        for(int i = 0; i < Bucket2.length; i++) C2[Bucket2[i] % 10]++;
        for(int i = 1; i < 10; i++) C2[i] += C2[i-1];
        for(int i = Bucket2.length - 1; i >= 0; i--) NewB2[--C2[Bucket2[i] % 10]] = Bucket2[i];

        for(int i = 0; i < NewB1.length; i++) B[i] = NewB1[i];
        for(int i = 0; i < NewB2.length ; i++) B[i + Bucket1.length] = NewB2[i];

        return B;
    }

    public static void main(String[] args){
        int A[] = {1,3,8,15,13,17,2,13,7,9};
        int B[] = sort(A);
        for(int i = 0; i < B.length; i++) System.out.print(B[i] + " ");
        System.out.println();
    }
}
