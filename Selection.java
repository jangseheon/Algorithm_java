package Sort;

/* Selection Sort(삽입 정렬): 배열에서 최소값을 찾아 그 값을 현재의 값과 교환하여 정렬하는 방법
 교환 후 위치를 다음으로 이동시켜 배열의 끝까지 반복한다*/

public class Selection extends AbstractSort{
    public static void sort(Comparable[] a){
        for(int i = 0; i < a.length - 1; i++){
            int min = i;
            for(int j = i+1; j < a.length; j++){
                if(less(a[j],a[min])) min = j;
            }
            exch(a,i,min);
        }
        assert isSorted(a);
    }

    public static void main(String[] args){
        Integer[] a = {10,4,5,2,1,8,3,6};
        Selection.sort(a);
        Selection.show(a);
    }
}
