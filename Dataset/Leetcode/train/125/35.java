 class Solution {
    public boolean XXX(String s) {
        int left  = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        while(left < right)
        {
            if(!isRightWord(c[left])){
                left++;continue;
            }     
            if(!isRightWord(c[right])){
                right--;continue;
            }  
            if(toLowercase(c[left]) != toLowercase(c[right])){
                return false;
            }
            left++;right--;
        }
        return true;
        
    }
    //验证是否为数字和字母
    public boolean isRightWord(char c){
        return (c>='0' && c<='9') || (c>='A' && c<='Z') || (c>='a' && c<='z');
    }
    //大写转换为小写
    public char toLowercase(char c){
        if(c>='A' && c<='Z')
            c+=32;
        return c;
    }
}

