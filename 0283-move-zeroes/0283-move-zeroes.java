class Solution {
    public void moveZeroes(int[] arr) {
        int count=0, k=0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            } else {
                arr[k] = arr[i];
                k++;
            }
        }

        for(int i=0; i<count; i++) {
            arr[k] = 0;
            k++;
        }
    }
}