package Sort;

public class Shell extends AbstractSort{
    public static void sort(Comparable[] a){
        int h = 1;
        while(3*h + 1 < a.length) h = 3*h + 1;

        while (h >= 1){
            for(int i = h; i < a.length ; i++)
                for(int j = i; j >= h && less(a[j],a[j-h]);j -= h){
                    exch(a,j,j-h);
                }
                h/=3;
        }
    }

    public static void main(String[] args){
        Integer[] a = {10,4,5,2,1,8,3,6};
        Shell.sort(a);
        Shell.show(a);
    }
}
