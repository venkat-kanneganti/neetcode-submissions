class Solution {
    public boolean hasDuplicate(int[] nums) {
        int numsLength = nums.length;
        int[] emptyArray = Arrays.stream(nums).distinct().toArray();
        int emptyArrayLength = emptyArray.length;
        for(int i=0;i<numsLength;i++){
            if(numsLength != emptyArrayLength){
                return true;
            }
            
        }
    return false;
    }
}