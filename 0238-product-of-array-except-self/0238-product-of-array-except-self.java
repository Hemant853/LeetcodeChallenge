class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int resultArr[] = new int[n];

        //prefix
        for(int i=0; i<n; i++) {
            if(i == 0) {
                resultArr[i] = 1;
            } else {
                resultArr[i] = resultArr[i-1] * arr[i-1];
            }
        }

        //suffix
        int suffix = 1;
        for(int i=n-2; i>=0; i--) {
           suffix = suffix * arr[i+1];
           resultArr[i] *= suffix; 
        }

        return resultArr;
        
    }
}