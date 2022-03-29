 public List<List<Integer>> XXX(int[] nums) {
        int[] flags = new int[nums.length];
        Arrays.fill(flags,0);//0表示没有用过
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0) return res;
        backtrace(0, new ArrayList<Integer>(), res, nums, flags);
        return res;
    }
    public void backtrace(int now, List<Integer> output , List<List<Integer>> res, int nums[], int flags[]){
        if(now == nums.length){
            //res.add(output);大bug，output是同一个对象
            res.add(new ArrayList<Integer>(output));
        }else{
            for(int i = 0; i<nums.length; i++){
                if(flags[i] == 0){
                    //当前数字没有用过
                    output.add(nums[i]);
                    flags[i] = 1;
                    backtrace(now+1, output, res, nums, flags);
                    flags[i] = 0;
                    output.remove(output.size()-1);
                }
            }
        }
    }

