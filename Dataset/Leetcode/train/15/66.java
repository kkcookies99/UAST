 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //避免重复 j!=j-1     i!=i-1
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            //去重
            if(i>0&&nums[i]==nums[i-1])
                continue;
                //剪枝
                if(nums[i]>0)
                    return res;
            for(int j=i+1;j<=nums.length-2;j++){
                //去重
                if(j>i+1&&nums[j]==nums[j-1])
                    continue;
                
                int target=0-nums[i]-nums[j];
                //剪枝
                if(target<nums[j])
                    break;
                //二分法 用时logn
                // int left=j+1,right=nums.length-1;
                // while(left<=right){
                //     int mid=(left+right)>>>1;
                //     if(nums[mid]==target){
                //         List<Integer>list=new ArrayList();
                //         list.add(nums[i]);list.add(nums[j]);list.add(nums[mid]);
                //         res.add(list);
                //         break;
                //     }else if(nums[mid]<target)
                //         left=mid+1;
                //     else
                //         right=mid-1;
                // }
                //o(1)
                Integer count=map.get(target);
                if(count!=null){
                    if(target==nums[i]&&count<3)//三者重复 必须有三个以上相同
                        continue;
                    if(target==nums[j]&&count<2)
                        continue;
                    List<Integer>list=new ArrayList();
                    list.add(nums[i]);list.add(nums[j]);list.add(target);
                    res.add(list);
                }
            }
        }
        return res;
    }

