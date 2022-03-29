 public int[] XXX(int[] nums, int target) {
        int[] answer = new int[2];
        HashMap map = new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                answer[0] = (int)map.get(nums[i]);
                answer[1] = i;
                break;
            }
            map.put(target-nums[i],i);
        }
        return answer;
    }

