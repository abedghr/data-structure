import java.util.HashMap;
import java.util.Map;

public class Array {
    public static void main(String[] args) {
        
        // Simple Array
        System.out.println("Simple Array (One Dimensional Array)");
        int [] array = new int[4];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        // Adding Elements using Array Literal
        System.out.println("Array Literal");
        int [] arrayLiteral = {10, 20, 30, 40, 50};
        for (int i = 0; i < arrayLiteral.length; i++) {
            System.out.println(arrayLiteral[i]);
        }
        System.out.println("");
        // 2 Dimensional Array
        System.out.println("Two Dimensional Array:");
        int rows = 3;
        int cols = 4;
        int [][] my2darray = new int [rows][cols];
        for (int i = 0; i < my2darray.length; i++) {
            
            for (int j = 0; j < my2darray.length; j++) {
                my2darray[i][j] = i+j;
                System.out.println(my2darray[i][j]);    
            }
        }

        // Get Odd Number from Array and put it in another array
        System.out.println("Get Odd Number from Array and put it in another array");
        int arr [] = {1,2,3,4,5,6,7};
        int oddLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) oddLength++;
        }

        int oddArray [] = new int[oddLength];
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                oddArray[oddIndex] = arr[i];
                System.out.println(oddArray[oddIndex]);
                oddIndex++;
            }
        }

        // Merge Two sorted Array and sort data
        System.out.println("Merge Two sorted Array and get new array with all elements sorted");
        int arr1 [] = {1,3,5,7,8};
        int arr2 [] = {2,4,6,9,10};
        int arr3 [] = new int [arr1.length + arr2.length];
        int i1 = 0; int j1 = 0; int k1 = 0;
        while(i1 < arr1.length && j1 < arr2.length) {
            
            if(arr1[i1] <= arr2[j1]) {
                arr3[k1++] = arr1[i1++]; 
            } 
            
            else {
                arr3[k1++] = arr2[j1++];
            }
        }

        while(i1 < arr1.length || j1 < arr2.length) {
            if(i1 < arr1.length) {
                arr3[k1++] = arr1[i1++];
            }
            if(j1 < arr2.length) {
                arr3[k1++] = arr2[j1++];
            }
        }

        for (int k2 = 0; k2 < arr3.length; k2++) {
            System.out.println(arr3[k2]);
        }

        // Sum Of Two Number given "n"
        System.out.println("Sum Of Two Number given n (return the two numbers)");
        int sumArray [] = {1,3,12,2,5, 6};
        int n = 8;
        for (int i = 0; i < sumArray.length; i++) {
            
            for (int j = i; j < sumArray.length; j++) {
                if(sumArray[i] + sumArray[j] != n) continue;
                
                System.out.print(sumArray[i] + " " + sumArray[j] + " ");
            }
        }
        System.out.println("");

        // All Elements Except Itself
        System.out.println("All Elements Except Itself");
        int multArr [] = {4, 2, 1, 5, 0}; // {4, 2, 1, 5, 0} {1,2,3,4}
        int arr_result [] = new int [multArr.length];

        // 1st Solution
        int mulVal = 1;
        boolean has_zero = false;
        for (int i = 0; i < multArr.length; i++) {
            if(multArr[i] != 0) {
                mulVal *= multArr[i];
                continue;
            }
            has_zero = true;
        }

        for (int i = 0; i < multArr.length; i++) {
            if(multArr[i] == 0){
                arr_result[i] = mulVal;
                continue;
            }
            if(has_zero)
                arr_result[i] = 0;
            else
                arr_result[i] = mulVal / multArr[i];
        }
        
        for (int i = 0; i < arr_result.length; i++) {
            System.out.print(arr_result[i] + " ");
        }

        System.out.println("");
        
        /* 2nd Solution

        int temp = 1;
        for (int i = 0; i < multArr.length; i++) {
            arr_result[i] = temp;
            temp *= multArr[i];
        }

        temp = 1;
        for (int i = multArr.length-1; i >= 0; i--) {
            arr_result[i] *= temp;
            temp *= multArr[i];
        }
       
        for (int i = 0; i < arr_result.length; i++) {
            System.out.print(arr_result[i] + " ");
        }
        */

        /* Another Solution :

        for (int i = 0; i < multArr.length; i++) {
            arr_result[i] = 1;
            for (int j = 0; j < multArr.length; j++) {
                if(j == i) continue;
                
                
                arr_result [i] *= multArr[j];
            }
            
        }

        for (int i = 0; i < arr_result.length; i++) {
            System.out.print(arr_result[i] + " ");
        }

        */

        // First Non-Repeating Integer in an Array
        System.out.println("First Non-Repeating Integer in an Array");

        int nonArray [] = {9, 2, 3, 2, 6, 9, 6,1};
        Map <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nonArray.length; i++) {
            if(map.containsKey(nonArray[i])) {
                int value = map.get(nonArray[i]) + 1;
                map.put(nonArray[i], value);
                continue;
            }
            map.put(nonArray[i], 1);
        }

        int nonRes = -1;
        for (int i = 0; i < nonArray.length; i++) {
            if(map.get(nonArray[i]) == 1) {
                nonRes = nonArray[i];
                break;
            }
        }
        
        System.out.println(nonRes);

        // Find Second Maximum Value in an Array
        System.out.println("Find Second Maximum Value in an Array");

        int secMaxArray [] = {9,2,3,6}; // {4, 2, 1, 5, 0}
        int max = 0; int sec_max = 0;

        for (int i = 0; i < secMaxArray.length; i++) {
            if(secMaxArray[i] >= max) {
                sec_max = max;
                max = secMaxArray[i];
            }
            else if(secMaxArray[i] > sec_max) {
                sec_max = secMaxArray[i];
            }
        }

        System.out.println(sec_max);

        // Reverse Array
        System.out.println("Reverse Array");

        int rev_array [] = {1,2,3,4,5,2};

        // 1st Solution

        for (int i = 0; i < rev_array.length / 2; i++) {
            int x = rev_array[i];
            rev_array[i] = rev_array[(rev_array.length-1)-i];
            rev_array[(rev_array.length-1)-i] = x;
        }
       
        /* Another Solution

        for (int i = 0; i < secMaxArray.length; i++) {
            if(rev_i < i) break;
            int x = rev_array[i];
            rev_array[i] = rev_array[rev_i];
            rev_array[rev_i] = x;
            rev_i--;
        }

        for (int i = 0; i < rev_array.length; i++) {
            System.out.print(rev_array[i]);
        }

        */
        for (int i = 0; i < rev_array.length; i++) {
            System.out.print(rev_array[i]);
        }
        System.out.println();

        // Re-arrange Positive & Negative Values
        System.out.println("Re-arrange Positive & Negative Values");

        int arangeArray [] = {10, -1, 20, 4, 5, -9, -6};
        int newArangeArray [] = new int[arangeArray.length];
        int neg_count = 0;
        
        for (int i = 0; i < arangeArray.length; i++) {
            if(arangeArray[i] < 0) {
                newArangeArray[neg_count++] = arangeArray[i];
            }    
        }

        for (int i = 0; i < arangeArray.length; i++) {
            if(arangeArray[i] > 0) {
                newArangeArray[neg_count++] = arangeArray[i];
            }
        }

        for (int i = 0; i < newArangeArray.length; i++) {
            System.out.print(newArangeArray[i] + " ");
        }

        System.out.println("");
        
        // Maximum Sum Subarray
        System.out.println("Maximum Sum Subarray");

        // using Kadane’s algorithm 
        
        // currMax = A[0]
        // globalMax = A[0]
        // for i = 1 -> size of A
        //     if currMax is less than 0
        //         then currMax = A[i]
        //     otherwise 
        //         currMax = currMax + A[i]
        //     if globalMax is less than currMax 
        //         then globalMax = currMax;

        int sumSubArray [] = {1, 7, -2, -5, 10, -1};
        int currMax = sumSubArray[0];
        int globalMax = sumSubArray[0];
        for (int i = 1; i < sumSubArray.length; i++) {
            if(currMax < 0) {
                currMax = sumSubArray[i];
            } else {
                currMax += sumSubArray[i];
            }

            if(globalMax < currMax) {
                globalMax = currMax;
            }
        }

        System.out.println(globalMax);
    }
    
}
