package company;

public class CWH_29_practice_set_6 {
    public static void main(String[] args) {
        /*
        //Practice Problem 1
        float [] marks = {45.7f, 56.8f, 87.6f, 59.7f, 68.f};
        float sum = 0;
        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The Value of sum is " + sum);

        //Practice Problem 2
        float [] marks = {45.7f, 56.8f, 87.6f, 59.7f, 68.f};
        float num = 59.7f;
        boolean isInArray = false;
        for(float element: marks){
            if (num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.printf("The Value %f is present in an array!", num);
        }
        else {
            System.out.printf("The Value %f is not present in an array!", num );
        }

        // Practice Problem 3
        float [] marks = {45.7f, 56.8f, 87.6f, 59.7f, 68.f};
        float sum = 0;

        for(float element: marks){
            sum = sum + element;
        }
        System.out.println("The Value of average marks is " + sum/ marks.length);

        // Practice Problem 4
        int [][] mat1 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] mat2 = {
                {7,8,9},
                {10,11,12}
        };
        int [][] result = {
                {0,0,0},
                {0,0,0}
        };

        for (int i=0;i<mat1.length;i++){  // row number of times
            for (int j=0;j<mat1[i].length;j++){  // column number of time
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }

        // printing the element of 2-D array
        for (int i=0;i<mat1.length;i++) {  // row number of times
            for (int j = 0; j < mat1[i].length; j++) {  // column number of time
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];

            }
            System.out.println("");
        }


        // Practice Problem 5
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for(int i=0; i<n; i++){
            // swap arr[i] and arr[l-1-i]
            // |3| |4| ||  -swapping logic
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }


        // Practice Problem 6
        int [] arr = {1,2,3,4,5,666,98,67,56};
        int max = Integer.MIN_VALUE; //-2147483648
        for (int element: arr){
            if(element>max){
                max = element;
            }
        }
        System.out.printf("The Maximum elements from array is %d", max);
        System.out.println(Integer.MIN_VALUE);


        // Practice Problem 7
        int [] arr = {1,2,3,4,5,-666,98,67,56};
        int min = Integer.MAX_VALUE;
        for (int element: arr){
            if(element<min){
                min = element;
            }
        }
        System.out.printf("The Minimum value from array is %d", min);
         */

        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1,2,3,4,5,66,90,101};
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }




    }
}