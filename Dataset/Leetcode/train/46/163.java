class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {//1-2-3
        premuting(nums,new ArrayList<>());
        return res;
    }

    public void premuting(int[] nums,List<Integer> now){
        //break;
        if(now.size() == nums.length){//;->->-> ==;
            res.add(new ArrayList<>(now));//res.add(now)1,2,3;
            return;//back 1;
        }
        //loop once
        for(int i : nums){//1-2-3
            if(!now.contains(i)){//1；-> !1;2 ->!1;!2;3->
                now.add(i);//now:1;now:1,2;now:,1,2,3
                premuting(nums,now);//->->->;
                now.remove(now.size() - 1);
            }
        }
            //
    }

}

