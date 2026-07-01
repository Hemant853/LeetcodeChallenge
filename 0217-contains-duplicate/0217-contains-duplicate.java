class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashSet<Integer> list = new HashSet<>();
        for(int i : arr) {
           if(!list.add(i)) {
            return true;
           }
        }
        return false;
    }
}