import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3};
        HeapsAlgorithm<Integer> heapsAlgorithm = new HeapsAlgorithm<>(new ArrayList<>());
        heapsAlgorithm.perm(arr,arr.length);
        heapsAlgorithm.traverse();
    }


}
