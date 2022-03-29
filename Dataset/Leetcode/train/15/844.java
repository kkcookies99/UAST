     public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> resp=new ArrayList<>();
        int len=nums.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<len;i++)
        {       
            if(!map.containsKey(nums[i]))
            {
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
            else
            {
                List<Integer> list=map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }
        }
        for(int i=0;i<len;i++)
        {
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1;j<len;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1])continue;
                if(map.containsKey(0-(nums[i]+nums[j])))
                {
                    List<Integer> list=map.get(0-(nums[i]+nums[j]));
                    for(int k=0;k<list.size();k++)
                    {
                        if(list.get(k)>j)
                        {
                            List<Integer> temp=new ArrayList<>(3);
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[list.get(k)]);
                            resp.add(temp);
                            break;
                        }
                    }
                }
            }
        }
        return resp;
    }

