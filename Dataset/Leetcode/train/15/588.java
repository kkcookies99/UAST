     public List<List<Integer>> XXX(int[] nums) {
      
        List<List<Integer>> list=new ArrayList<>();

        Arrays.sort(nums);
        int len=nums.length;

        for(int i=0;i<len-1;i++){
            Map<Integer,Integer> hashmap=new HashMap<>();
            //把num[i]的相反数作为target，找剩下的是否有两元素之和=target
            int target=-1*nums[i];

            for(int j=i+1;j<len;j++){  
                if(hashmap.containsKey(target-nums[j])) {   
                        List<Integer> l=new ArrayList<>();
                        l.add(nums[i]); 
                        l.add(target-nums[j]);
                        l.add(nums[j]);
                        if(!list.contains(l))
                        list.add(l);
                }else{
                    hashmap.put(nums[j],0);
                }
            }

        }        
            return list;
    }
}

