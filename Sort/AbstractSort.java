package Sort;

public abstract class AbstractSort{
        public static void sort(Comparable[] a){};

        protected static boolean less(Comparable a, Comparable b){
            return a.compareTo(b) < 0; // a > b : 양수, a == b : 0, a < b : 음수
        }

        protected static boolean isSorted(Comparable[] a){
            for(int i = 1; i < a.length; i++){
                if(less(a[i],a[i-1])) return false;
            }
            return true;
        }

        protected static void exch(Comparable[] a,int i,int j){
            Comparable temp;
            temp = a[i]; a[i] = a[j]; a[j] = temp;
        }

        protected static void show(Comparable[] a){
            for(int i = 0; i < a.length ; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
}
