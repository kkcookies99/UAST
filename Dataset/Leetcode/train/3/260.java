 class Solution {
    public int XXX(String s) {
   //        这个集合用来判重
        int[] chars =new int[128];
        int total = 0;
        int sum=0;
        int left=0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i!=0){
                chars[s.charAt(i-1)]=0;
                sum--;
            }
           while(left<n&&chars[s.charAt(left)]==0){
                sum++;
               chars[s.charAt(left)]=1;
               total=Math.max(total,sum);
               left++;
           }

        }

        return total;}
}

