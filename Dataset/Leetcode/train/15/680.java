 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
         List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3){
            return result;
        }
        sort(nums);
        for(int a = 0;a<nums.length&&nums[a]<=0;a++){
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            int b=a+1,c=nums.length-1;
            while(b<c){
                int temp = nums[a]+nums[b]+nums[c];
                if(nums[a]+nums[b]+nums[c]==0){
                    List list = Arrays.asList(nums[a],nums[b],nums[c]);
                    result.add(list);
                    while (b<c && nums[b] == nums[++b]) {
                    }
                    while (b<c &&nums[c] == nums[--c]) {
                    }
                }else if(temp<0){
                    while (b<c && nums[b] == nums[++b]) {
                    }
                }else {
                    while (b<c &&nums[c] == nums[--c]) {
                    }
                }
            }
        }
        return result;
    }

    public void sort(int[] nums){
        int minIndex,temp;
        for(int i=0;i<nums.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}

