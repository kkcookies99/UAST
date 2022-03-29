   public List<List<Integer>> XXX(int[] nums) {
   //数组要先排序很重要
     //数组要先排序很重要
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        //从数组开始开始循环，然后开启双指针，双指针为k，j
        for(int i = 0; i < len ;i++){
            int k = i +1;
            int j = len  - 1;
            //这个条件忘记了 导致重复
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }

            while (k < j){
                int s = nums[j] + nums[k] +nums[i];
                if (0 == s ){
                    //
                    list.add(Arrays.asList(nums[i],nums[k],nums[j]));

                    k++;
                    j--;
                    while(nums[k]== nums[k-1]&&k<j){
                        k++;
                    }
                    while(nums[j] == nums[j+1]&&k<j){
                        j--;
                    }

                }else if(s<0){
                    //s小于零 说明不够大。
                    k++;

                }else if(s > 0){
                    j--;
                }
            }

        }
        return list;
    }```

