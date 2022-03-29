 class Solution {
    public String XXX(String s) {
        String max = "";
        for(int i=0;i<s.length();i++){
            String temp = getCurrentMax(s,i-1,i+1);
            String temp1 = getCurrentMax(s,i,i+1);
            max = temp.length()>max.length()?temp:max;
            max = temp1.length()>max.length()?temp1:max;
        }
        return max;
    }

    String getCurrentMax(String s,int left,int right){
     
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
}

