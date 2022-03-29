 class Solution {
    public boolean XXX(String s) {
        s = s.toLowerCase(); // 转换为小写
        if (s.length() == 0 ||s.length() == 1) return true;

        int left = 0, right = s.length() - 1;
        while (left < right) {

            char cL = s.charAt(left), cR = s.charAt(right);

            if (!('a' <= cL && cL <= 'z') && !('0' <= cL && cL <= '9')) { // 左指针指向字符不合法，左指针右移
                left++;
            } else if (!('a' <= cR && cR <= 'z') && !('0' <= cR && cR <= '9')){ // 右指针指向字符不合法，右指针左移
                right--;
            } else if (cL == cR) { // 都合法的话，判断字符是否相等，相等的话，左指针右移，右指针左移
                left++;
                right--;
            } else if (cL != cR) { // 否则，提前退出
                return false;
            }
        }
        return true;
    }
}

