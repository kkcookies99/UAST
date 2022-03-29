 class Solution {
    public int XXX(String s) {
        //字符取值范围是-128-127
        int [] num = new int[256];
        char [] str = s.toCharArray();
        int res = 0;
        //双指针      
        for(int i = 0 , j = 0 ;i < str.length; i++){
            num[str[i]+128]++;
            while(num[str[i]+128]>1){
                num[str[j]+128]--;
                j++;
            }
            res = Integer.max(res, i-j+1);
        }
        return res;
    }
}
