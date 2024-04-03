package MergeSortTest;

public class SortMain {
    public static void main(String[] args) {
        int[] input_data = {10, 40, 30, 50, 70, 20, 100, 90, 80, 60};
        System.out.println("Sorting dengan merge sort:");
        MergeSorting mSort = new MergeSorting();
        System.out.println("Data awal:");
        mSort.printArray(input_data);
        mSort.mergesort(input_data);
        System.out.println("Setelah diurutkan:");
        mSort.printArray(input_data);
        // int[] input_data = {10, 40, 30, 50, 70, 20, 100, 90, 80, 60};
        // System.out.println("sorting dengan merge:");
        // MergeSorting mSort= new MergeSorting();
        // System.out.println("data awal");
        // mSort.printArray(input_data);
        // mSort.mergesort(input_data);
        // System.out.println("setalah dirut");
        // mSort.printArray(input_data);

        // new MergeSorting().printArray(input_data);

        // Panggil mergeSort
        // new MergeSorting().Sort(input_data);

        // System.out.println("Data terurut:");
        // new MergeSorting().printArray(input_data);
    }
}
