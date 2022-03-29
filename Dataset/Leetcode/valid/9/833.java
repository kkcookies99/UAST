 class Solution {
    public boolean XXX(int x) {
        char[] chars = Integer.toString(x).toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right){
            if(chars[left]!=chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

