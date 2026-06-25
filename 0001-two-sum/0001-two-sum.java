class Solution {
    public int[] twoSum(int[] arr, int target) {
       Map<Integer, Integer> map = new HashMap<>();

       for(int i=0; i<arr.length; i++) {
          int complement = target - arr[i];

          if(map.containsKey(complement)) { // it checks key present or not
            return new int[]{map.get(complement), i}; // it returns complement value , current index
          }
          map.put(arr[i], i);
       }
       return new int[]{};
    }
}