package MergeSortTest;

public class MergeSorting {
        public void mergesort(int[] data) {
            Sort(data, 0, data.length - 1);
        }
    
        public void merge(int[] data, int left, int middle, int right) {
            int[] temp = new int[data.length];
            for (int i = left; i <= right; i++) {
                temp[i] = data[i];
            }
            int a = left;
            int b = middle + 1;
            int c = left;
    
            // Membandingkan setiap bagian
            while (a <= middle && b <= right) {
                if (temp[a] <= temp[b]) {
                    data[c] = temp[a];
                    a++;
                } else {
                    data[c] = temp[b];
                    b++;
                }
                c++;
            }
    
            int s = middle - a;
            for (int i = 0; i <= s; i++) {
                data[c + i] = temp[a + i];
            }
        }
    
        public void Sort(int[] data, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;
                Sort(data, left, middle);
                Sort(data, middle + 1, right);
                merge(data, left, middle, right);
            }
        }
    
        public void printArray(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    // public void mergesort(int[] data) {

    // }

    // public void merge(int[] data, int left, int middle, int right) {
    //     int[] temp = new int[data.length];
    //     for (int i = left; i <= right; i++) {
    //         temp[i] = data[i];
    //     }
    //     int a = left;
    //     int b = middle + 1;
    //     int c = left;
    
    //     // membandingkan setiap bagian
    //     while (a <= middle && b <= right) {
    //         if (temp[a] <= temp[b]) {
    //             data[c] = temp[a];
    //             a++;
    //         } else {
    //             data[c] = temp[b];
    //             b++;
    //         }
    //         c++;
    //     }
    
    //     int s = middle - a;
    //     for (int i = 0; i <= s; i++) {
    //         data[c + i] = temp[a + i];
    //     }
    // }

    // public void Sort(int[] data, int left, int right) {
    //     if (left < right) {
    //         int middle = (left + right) / 2;
    //         Sort(data, left, middle);
    //         Sort(data, middle + 1, right);
    //         merge(data, left, middle, right);
    //     }
    // }

    // public void printArray(int arr[]){
    //     int n= arr.length;
    //     for (int i=0; i<n; i++)
    //     {
    //         System.out.println(arr[i]+ "");
    //     }
    //     System.out.println( "\n" );
    // }
    
    


