import java.util.ArrayList;

public class HeapsAlgorithm<T extends Comparable<T>> {
    private ArrayList<Comparable<T>[]> list;

    public HeapsAlgorithm(ArrayList<Comparable<T>[]> list) {
        this.list = list;
    }

    public void traverse() {
        for (Comparable<T>[] i : list) {
            for(Comparable<T> j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }


    public void perm(T[] arr, int n) {
        if(n == 1) {
            Comparable[] permArr = new Comparable[arr.length];
            for (int i =0; i < arr.length; i++) {
                permArr[i] = arr[i];
            }
            list.add(permArr);
        } else {
            for(int i=0; i<n; i++) {
                perm(arr,n-1);
                swap(n-1, ( n % 2 == 0 ) ? i : 0, arr);
            }
        }
    }

    public void swap(int num1, int num2, T[] list) {
        T temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
    }


}
