 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int begin=0;
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i]>=48 & chars[i]<=57 )|| chars[i]>=97&chars[i]<=122){
                chars[begin]=chars[i];
                begin++;
            }
        }
        int end=begin;
        begin=begin%2==0?begin/2:begin/2+1;
        for (int i = 0; i < begin; i++) {
            if (chars[i]!=chars[--end]){
                return false;
            }
        }
        return true;
    }
}

