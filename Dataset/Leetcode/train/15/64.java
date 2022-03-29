     public List<List<Integer>> XXX(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-3;i++){
            if(i!=0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<=nums.length-2;j++){
                if(j!=i+1&&nums[j]==nums[j-1]){
                    continue;
                }
                for(int k=j+1;k<=nums.length-1;k++){
                    if(k!=j+1&&nums[k]==nums[k-1]){
                        continue;
                    }
                    if(nums[i]+nums[j]+nums[k] == 0){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                }
            }
        }
        return result;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

