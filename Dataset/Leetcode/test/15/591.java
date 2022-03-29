    public List<List<Integer>> XXX(int[] nums) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            if(nums.length < 3){
                return ans;
            }
            Arrays.sort(nums);
            for(int i = 0;i < nums.length;i++){
                if(i>0 && (nums[i] == nums[i-1])){
                    continue;
                }
                int left = i+1;
                int right = nums.length -1;
                while(left < right){
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        ans.add(temp);
                        while(right > 1 && nums[right-1] == nums[right]){ right--;}
                        while(left < nums.length-1 && nums[left+1] == nums[left]){ left++;}
                        right --;
                        left ++;
                    }else if(sum > 0){
                        right --;
                    }else {
                        left ++;
                    }
                }
            }
            return ans;

