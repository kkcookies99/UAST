 class Solution {
    public boolean XXX(String s) {
        //这不就是双指针的问题吗？
        int len = s.length();
        char[] chars = s.toCharArray();
        int left = 0;
        int right = len-1;
        while(left<right){
            while(left<right&&!isValid(chars[left])){
                left++;
            }
            while(left<right&&!isValid(chars[right])){
                right--;
            }
            //都来到了对应的位置
            char charL = chars[left];
            char charR = chars[right];

            // if(charL>= 'A' && charL<= 'Z') {
            //     charL+=32;
            // }
            // if(charR>= 'A' && charR<= 'Z') {
            //     charR+=32;
            // }
            if((charL|0x20)!=(charR|0x20)){
                return false;
            }
            //能来到这，说明相等，继续下一次循环
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
            return true;
        }
        return false;
    }



}

