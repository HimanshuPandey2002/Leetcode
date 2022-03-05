class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        
        for(int i = zero; i <= two; i++){
            while(nums[i] == 2 && i < two){
                int temp = nums[i];
                nums[i] = nums[two];
                nums[two--] = temp;
            }
            while(nums[i] == 0 && i > zero){
                int temp = nums[i];
                nums[i] = nums[zero];
                nums[zero++] = temp;
            }
        }
    }
}