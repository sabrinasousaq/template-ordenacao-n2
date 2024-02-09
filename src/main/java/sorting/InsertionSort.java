package sorting;

public class InsertionSort implements SortingStrategy {

    public void sort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            orderedInsertion(v, i);
        }
    }

    private void orderedInsertion(int[] v, int from) {
        while (from > 0 && v[from] < v[from - 1]) {
            int aux = v[from - 1];
            v[from - 1] = v[from];
            v[from] = aux;
            from--;
        }
    }

}
