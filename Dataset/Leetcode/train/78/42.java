public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        backtrack(answer,new ArrayList<>(),nums.length,0,nums);
        // for(int k=0;k<=nums.length;k++){
        //     backtrack(answer,new ArrayList<>(),k,0,nums);
        // }
        return answer;
    }

    public void backtrack(List<List<Integer>> answer,List<Integer> list,int k,int begin,int[] nums){
        if(list.size() <= k){
            answer.add(new ArrayList<>(list));
        }else
            return;

        for(int i=begin;i<nums.length;i++){
            list.add(nums[i]);
            backtrack(answer,list,k,i+1,nums);
            list.remove(list.size()-1);
        }
    }

![image-20211103132435117](https://gitee.com/xiao-ai-beimeng/beimeng/raw/master/img/202111031324618.png)
