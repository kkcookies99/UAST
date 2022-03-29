 public List<List<Integer>> XXX(int[] nums) {
        int length = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(length<3){
            return res;
        }
        Arrays.sort(nums);
        if(nums[0]>0 || nums[length-1]<0){
            return res;
        }
        if(nums[0] == nums[length-1]){
            return Arrays.asList(Arrays.asList(0,0,0));
        }
        for (int i = 0; i < length-2; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = length-1;
            int amVal = -nums[i];
            while (start<end){
                int startVal = nums[start];
                int endVal = nums[end];
                int temVal = startVal+endVal;
                if(temVal == amVal){
                    res.add(Arrays.asList(nums[i], startVal, endVal));
                    start++;
                    end--;
                    while (start<length && nums[start] == startVal){
                        start++;
                    }
                    while (nums[end] == endVal){
                        end--;
                    }
                }else {
                    if(temVal > amVal){
                        end--;
                        while (nums[end] == endVal){
                            end--;
                        }
                    }else {
                        start++;
                        while (start<length && nums[start] == startVal){
                            start++;
                        }
                    }
                }
            }
        }
        return res;

    }

