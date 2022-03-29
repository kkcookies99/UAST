 public List<List<Integer>> XXX(int[] nums) {
                List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null || nums.length<3){
            return ans;
        }
        int len=nums.length;
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<len;i++){
            int flag=nums[i];
            int left=i+1;
            int right=len-1;
            while (left<right){
                int sum=flag+nums[left]+nums[right];
                if(sum==0){
                    List<Integer>tempList=new ArrayList<>();
                    tempList.add(flag);
                    tempList.add(nums[left]);
                    tempList.add(nums[right]);
                    Collections.sort(tempList);
                    set.add(tempList);
                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        ans.addAll(set);
        return ans;
    }

