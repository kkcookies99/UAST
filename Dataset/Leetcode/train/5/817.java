 class Solution {
    public String XXX(String s) {
        int[] dp = new int[s.length()];
        int[] result = new int[2];
        int length = 0;
        char[] array = s.toCharArray();
        for(int i=0;i<array.length;i++){
            int[] h = get(array,i,i,array[i],dp);
            int length_temp = getLength(h);
            if(length_temp>length) {
                result = h;
                length = length_temp;
            }

        }
        return s.substring(result[0],result[1]+1);
    }
    private int getLength(int[] array){
        if(array==null)return 0;
        else return array[1]-array[0]+1;
    }
    private int[] get(char[] array,int l,int r,char s,int[] dp){
        if(l<0||r>=array.length)return null;
        if(array[l]!=array[r])return null;
        if(s=='*'||array[l]!=s){
            int[] next = get(array,l-1,r+1,'*',dp);
            if(next==null)return new int[]{l,r};
            else return next;
        }else {
            if(dp[l]==1&&dp[r]==1)return null;
            if(l!=r)dp[l]=dp[r]=dp[(l+r)>>1]=1;
            int[] result3 = get(array,l-1,r+1,s,dp);
            int[] result1 = get(array,l-1,r,s,dp);
            int[] result2 = get(array,l,r+1,s,dp);
            if(result1==null&&result2==null&&result3==null)return new int[]{l,r};
            int[] temp = getLength(result1)>getLength(result2)?result1:result2;
            return getLength(temp)>getLength(result3)?temp:result3;
        }
    }
}

