 class Solution {
    public boolean XXX(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            while(!(('0' <= s.charAt(left) && s.charAt(left) <= '9')||('a' <= s.charAt(left) && s.charAt(left) <= 'z')||('A' <= s.charAt(left) && s.charAt(left) <= 'Z'))){
                left++;
                if(left > s.length()-1)return true;
            }
            while(!(('0' <= s.charAt(right) && s.charAt(right) <= '9')||('a' <= s.charAt(right) && s.charAt(right) <= 'z')||('A' <= s.charAt(right) && s.charAt(right) <= 'Z'))){
                right--;
            }
            if(s.charAt(left) != s.charAt(right) && (s.charAt(left) <= '9'||s.charAt(right) <= '9')){
                return false;
            }
            if(s.charAt(left) != s.charAt(right) && Math.abs(s.charAt(left)-s.charAt(right)) != 32){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

