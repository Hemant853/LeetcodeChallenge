class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int resultArr[] = new int[n];

        //prefix
        for(int i=0; i<n; i++) {
            if(i == 0) {
               prefix[i] = 1;
            } else {
               prefix[i] = prefix[i-1] * arr[i-1];
            }
        }

        //suffix
        for(int i=n-1; i>=0; i--) {
           if(i == n-1) {
            suffix[i] = 1;
           } else {
            suffix[i] = suffix[i+1] * arr[i+1];
           }
        }

        for(int i=0; i<n; i++) {
            resultArr[i] = prefix[i] * suffix[i];
        }
        return resultArr;
        
    }
}