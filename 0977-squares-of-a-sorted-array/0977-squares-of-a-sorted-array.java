class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        int[] result = new int[n];

        for(int k=n-1; k>=0; k--) {
            int leftSquare = arr[i]*arr[i];
            int rightSquare = arr[j]*arr[j];
            if(rightSquare > leftSquare) {
                result[k] = rightSquare;
                j--;
            } else {
                result[k] = leftSquare;
                i++;
            }
        }
        return result;
    }
}