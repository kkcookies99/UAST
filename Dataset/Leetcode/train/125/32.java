 class Solution {
    public boolean XXX(String s) {
         if(s.equals("")){
            return true;
        }
        char[] charArray = s.replaceAll("[^a-zA-Z0-9\\u4E00-\\u9FA5]","")
                .toLowerCase().toCharArray();
        int l = 0;
        int r = charArray.length - 1;
        while (l <= r){
            if(charArray[l] == charArray[r]){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}

