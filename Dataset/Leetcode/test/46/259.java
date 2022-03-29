class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        /*
            深度优先搜索:
            以[1,2,3]为例:
                开始有三个选择 分别为 1,2,3
                选其中一个 1
                    题目变为 [2,3]的全排列
                再选下一个.....
        */
        int len=nums.length;
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(len==0) return new LinkedList<List<Integer>>();
        if(len==1){
            List<Integer> p=new LinkedList<Integer>();
            p.add(nums[0]);
            res.add(p);
            return res;
        }
        for(int i=0;i<len;i++){
            List<List<Integer>> temp;
            temp=XXX(this.rm(nums,nums[i]));
            for(int j=0;j<temp.size();j++){
                List<Integer> t=temp.get(j);
                t.add(nums[i]);
                res.add(t);
            }
        }
        return res;
    }
    public int[] rm(int[] nums,int x){
        int[] temp=new int[nums.length-1];
        int c=0;  //由于nums不重复所以只会有一个x，故c=0或则1
        for(int i=0;i<temp.length;i++){
            if(nums[i+c]==x) c++;
            temp[i]=nums[i+c];  
        }
        return temp;
    }
}

