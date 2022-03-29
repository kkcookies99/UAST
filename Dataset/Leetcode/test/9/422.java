 class Solution {
    public boolean XXX(int x) {
        if(x < 0){
            return false;
        }

        char[] chars = String.valueOf(x).toCharArray();
        int right = chars.length - 1;
        int left = 0;
        //双指针遍历，如果不同则返回false
        while (right > left){
            if (chars[right] != chars[left]){
                return false;
            }
            right --;
            left ++;
        }
        return true;
    }
}

