class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res ={0,0};
        if(nums.length < 2){
            return res;
        }
        for(int i =0 ;i < nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target ){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        sort(res);
        return res;

    }
    public void sort(int[] arr){
        if(arr[0]>arr[1]){
            int temp = arr[0];
            arr[0]=arr[1];
            arr[1]=temp;
        }
    }
}