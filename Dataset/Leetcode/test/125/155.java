 class Solution {
    public boolean XXX(String s) {
        char[] chars = s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<=right){
            if (!((chars[left]>=48&&chars[left]<=57)
                    ||(chars[left]>=65&&chars[left]<=90)
                    ||(chars[left]>=97&&chars[left]<=122))){
                left++;
            }else if (!((chars[right]>=48&&chars[right]<=57)
                    ||(chars[right]>=65&&chars[right]<=90)
                    ||(chars[right]>=97&&chars[right]<=122))){
                right--;
            }else{
                if (!(chars[left]==chars[right]||(
                        (!((chars[right]>=48&&chars[right]<=57)
                                ||((chars[left]>=48&&chars[left]<=57)))) &&
                        (chars[left]+32==chars[right]
                        ||chars[left]-32==chars[right]))))
                    return false;
                left++;
                right--;
            }
        }
        return true;
    }
}

