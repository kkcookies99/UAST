 class Solution {
    public boolean XXX(String s) {
        if(s.isEmpty()){
            return true;
        }
        char test[] = s.toLowerCase().toCharArray();
        int left = 0;
        int right = test.length-1;
        while(left != right){
            if(left > right){
                return true;
            }
            if(!isLetterOrDigit(test[left])){
                left += 1;
                continue;
            }
            if(!isLetterOrDigit(test[right])){
                right -= 1;
                continue;
            }
            if(test[left] == test[right]){
                left += 1;
                right -= 1;
            }else{
                return false;
            }
        }
        return true;
    }

    private boolean isLetterOrDigit(char c) {
        int byteAscii1 = (int) c;
        if((c>=48 && c<=57) || (c>=97 && c<=122) || (c>=65 && c<=90)){
            return true;
        }else{
            return false;
        }
    }
}

