package ArrayDuplicates;

import java.util.*;
public class RemoveDuplicateWithoutHashset {
    public static void main(String[] args)
    {
        int a[] = { 1, 1, 2, 2, 2 };
        int size = a.length;
        removeDuplicates(a,size);
        removeDuplicatesInPlace(a);
    }

    static void removeDuplicates(int a[],int size) {
        int temp[] = new int[size];
        int j = 0;
        for(int i=0;i < size-1;i++) {
            if(a[i] != a[i+1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[size-1];
    }

    public static void  removeDuplicatesInPlace(int[] data){
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                data[index++] = data[i];
            }
        }
         for(int re : Arrays.copyOf(data, index)) {
             System.out.println(re);
         }
    }

}
