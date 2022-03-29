  public int[] XXX(int[] nums, int target) {
        int index;
        int indexArrayMax=2047;
        int[] indexArrays=new int[indexArrayMax+1];
        int diff;
        for(int i=1;i<nums.length;i++){
            diff=target-nums[i];
            //i=0时索引无效,所以单独处理
            if(diff==nums[0]){
                return new int[]{0,i};
            }
            index=diff&indexArrayMax;
            if(indexArrays[index]!=0){
                return new int[]{indexArrays[index],i};
            }
            indexArrays[nums[i]&indexArrayMax]=i;
        }
        return new int[2];
    }

