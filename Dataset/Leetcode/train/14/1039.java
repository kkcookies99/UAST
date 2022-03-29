 class Solution {
    public String XXX(String[] strs) {
        //大笨蛋解法
       int n=strs.length;
       String ans="";
       //边界
      if(n<1) return ans;
      //遍历数组，找到最短字符串，以此为遍历的前提，这样能保证不会出现遍历的时候越界
       int len=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int temp=strs[i].length();
            len=Math.min(len,temp);
        }
        //遍历，纵向对比字符，不相同则返回，相同加到ans中
        for(int i=0;i<len;i++){
            
            for(int j=0;j<n;j++){
                if(strs[j].charAt(i)!=(strs[0].charAt(i))) 
                 return ans;
            }
            ans+=strs[0].charAt(i);
        }
        return ans;

    }
}

