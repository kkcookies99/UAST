 public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ansList=new ArrayList<List<Integer>>();
        if(nums.length<3)
            return ansList;
        Arrays.sort(nums);
        if(nums[0]>0)
            return ansList;
        if(nums[0]==0&&nums[1]==0&&nums[2]==0){
            List<Integer> tem=new ArrayList<Integer>();
            tem.add(0);
            tem.add(0);
            tem.add(0);
            ansList.add(tem);
            return ansList;
        }
        if(nums[0]==0)
            return ansList;
        int k,j;
       
        for(int i=0;i<nums.length-2;i++){
            k=i+1;
            j=nums.length-1;
            while(k<j){
                if(nums[k]+nums[j]+nums[i]==0){
                    List<Integer> tem=new ArrayList<Integer>();
                    tem.add(nums[i]);
                    tem.add(nums[k]);
                    tem.add(nums[j]);
                    ansList.add(tem);
                    while(k<j&&nums[k]==nums[k+1])
                        k++;
                    while(k<j&&nums[j]==nums[j-1])
                        j--;
                    k++;
                }
                else if(nums[k]+nums[j]+nums[i]>0){
                    j=j-1;
                }
                else if(nums[k]+nums[j]+nums[i]<0){
                    k=k+1;
                }
                while(nums[i]==nums[i+1]&&i<nums.length-2) i++;
            }
        }
        return ansList;
    }

