    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numsList=new ArrayList<>();
        for(int i:nums){
            numsList.add(i);
        }
        XXXRecall(numsList,new ArrayList<>(),result);
        return result;
    }

    public void XXXRecall(List<Integer> nums,List<Integer> resultTmp, List<List<Integer>> result){
        if(nums.size()==0&&resultTmp.size()>0){
            result.add(resultTmp);
            return;
        }
        for(int i=0;i<nums.size();i++){
            List<Integer> tmpNums=new ArrayList<>(nums);
            List<Integer> tmpResult = new ArrayList<>(resultTmp);
            tmpResult.add(tmpNums.remove(i));
            XXXRecall(tmpNums,tmpResult,result);
        }
    }

