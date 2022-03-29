 class Solution {
    public boolean XXX(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            char x=s.charAt(left);
            char y=s.charAt(right);
            boolean flag1=('0'<=x && x<='9') || ('a'<=x && x<='z') || ('A'<=x && x<='Z');
            boolean flag2=('0'<=y && y<='9') || ('a'<=y && y<='z') || ('A'<=y && y<='Z');
            if(!flag1) left++;
            if(!flag2) right--;
            if(!flag1 || !flag2) continue;
            left++;
            right--;
            if(!(x+"").equalsIgnoreCase(y+"")) return false;
        }
        return true;
    }
}

