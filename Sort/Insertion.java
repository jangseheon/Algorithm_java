package Sort;

/*Insertion Sort(삽입정렬): 배열의 현재 인덱스의 원소를 이전 인덱스까지 정렬이 된 배열에 추가한다.
                          i를 n-1까지 증가하면서 반복 */

public class Insertion extends AbstractSort{
    public static void sort(Comparable[] a){
        for(int i = 1 ; i < a.length; i++){
            for(int j = i; j > 0 && less(a[j],a[j-1]); j--){
                exch(a,j,j-1);
            }
        }
    }

    public static void main(String[] args){
        Integer[] a = {10,4,5,2,1,8,3,6};
        Insertion.sort(a);
        Insertion.show(a);
    }
}
