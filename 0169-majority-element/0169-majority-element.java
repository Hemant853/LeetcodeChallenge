class Solution {
    public int majorityElement(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int freq=0;
            for(int j=i; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    freq++;
                }
            }
            if(freq > (arr.length/2)) {
                return arr[i];
            }
        }
        return 0;
    }
}