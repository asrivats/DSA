class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i=0;i<=nums.length-3;i++){
            if(i== 0 || nums[i] > nums[i-1]){
                int j = i+1, k=nums.length-1;
                
                while(j<k){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                    if(nums[i] + nums[j] +nums[k] < 0){
                        int curJ = j;
                        while(nums[j] == nums[curJ] && j<k)
                            j++;
                    }
                    else{
                        int curK = k;
                        while(nums[k] == nums[curK] && j<k)
                            k--;
                    }
                }
            }
        }
        return result;
    }
}
