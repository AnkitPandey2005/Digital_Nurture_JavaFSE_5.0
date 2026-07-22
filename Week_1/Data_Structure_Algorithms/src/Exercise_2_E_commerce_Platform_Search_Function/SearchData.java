package Exercise_2_E_commerce_Platform_Search_Function;

import java.util.Arrays;

public class SearchData {

    // Linear Search
    public static Item linear(Item arr[], int key) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i].getId() == key) {
                return arr[i];
            }
        }

        return null;
    }

    // Binary Search
    public static Item binary(Item arr[], int key) {

        Arrays.sort(arr, (a,b) -> a.id - b.id);

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid].id == key)
                return arr[mid];

            if(arr[mid].id < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

}