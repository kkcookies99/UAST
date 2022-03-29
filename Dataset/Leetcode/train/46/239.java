 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resultLists = new ArrayList<>();
        if (nums==null||nums.length==0){
            return resultLists;
        }
        boolean[] used = new boolean[nums.length];
        brackTrace(resultLists,0,nums,new ArrayList<Integer>());
        return resultLists;
    }
    public void brackTrace(List<List<Integer>> resultList,int index,int [] nums,List<Integer> subResult){
        if (index==nums.length){
            List<Integer> copyList = new ArrayList<>();
            copyList.addAll(subResult);
            resultList.add(copyList);
        }else{
            for (int i = 0; i < nums.length; i++) {
                if (!subResult.contains(nums[i])){
                    subResult.add(nums[i]);
                    brackTrace(resultList,index+1,nums,subResult);
                    subResult.remove(subResult.size()-1);
                }
            }
        }

    }

