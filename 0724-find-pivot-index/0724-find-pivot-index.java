class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int leftSum = 0, rightSum = 0;
        for(int i=0; i<arr.length; i++) {
            leftSum += arr[i];
            rightSum = sum - (leftSum - arr[i]);

            if(leftSum == rightSum) {
                return i;
            }
        } 
        return -1;
    }
}