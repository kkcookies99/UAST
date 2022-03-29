 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lis=new ArrayList<List<Integer>>();
        int n=nums.length;
        if(n<3)return lis;
        Arrays.sort(nums); //排序
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<n-2;i++){  //遍历，三个数最小的
            int a=nums[i];
            if(i>0&&nums[i-1]==a)continue;
            int target=0-a;
            int s=i+1,e=n-1;  //双指针
            while(s<e){
                int b=nums[s];
                int c=nums[e];
                if(e<n-1&&s>i+1){
                    if(b==nums[s-1]&&c==nums[e+1]){
                        s++;e--;
                        continue;
                    }
                }
                if(b+c==target){
                    li.add(a);li.add(b);li.add(c);
                    lis.add(li);
                    li=new ArrayList<Integer>();
                    s++; e--;
                    continue;
                }else if(b+c>target){
                    e--;
                    continue;
                }else{
                    s++;
                }
            }
        }
        return lis;
    }
}

