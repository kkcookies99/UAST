class Solution {
    public boolean XXX(int x) {
        String str = Integer.toString(x);
        int len = str.length();
        for(int i=len-1;i>0;i--){
            if(str.charAt(i)!=str.charAt(len-i-1))    return false;
            if(i<=len-i-1)    break;
        }
        return true;
    }
}

