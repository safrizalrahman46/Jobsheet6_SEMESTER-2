package Praktikum06;

/**
 * Sorting
 */
public class Sorting {

    public static void sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Data ditemukan pada indeks ke-" + i);
                return;
            }
        }
        System.out.println("Data tidak ditemukan");
    }
    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] == key) {
                return mid;
            }
    
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    
        return -1;
    }

    
    public static void main(String[] args) {
        int[] daftarNilai = {10, 5, 20, 15, 80, 45};
        sequentialSearch(daftarNilai, 5);

        int[] sortedNilai = {5, 5, 10, 20, 30, 40, 50};
        int index = binarySearchAsc(sortedNilai, 5);
         
        if (index != -1) {
            System.out.println("Data ditemukan indeks ke- " +index);
        } else {
            System.out.println("data tidak ditemukan");
        }
    
    }
}

// package Praktikum06;

// /**
//  * Sorting
//  */
// public class Sorting {

//     public static void sequentialSearch(int[] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (i == key) {
//                 System.out.println("Data ditemukan pada indeks ke-" + i);
//             }
//         }
//         System.out.println("Data tidak ditemukan");
//     }
    
//     public static void main(String[] args) {
//         int[] daftarNilai = {10, 5, 20, 15, 80, 45};
//         sequentialSearch(daftarNilai, 5);
//     }
    
// }