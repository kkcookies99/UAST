 class Solution {
    public boolean XXX(String s) {
        int n = s.length();
        if(n <= 1) return true;
        int left = 0;
        int right = n-1;
        char ch[] = s.toLowerCase().toCharArray();
        while(left <= right){
            if(!((ch[left]<='9' && ch[left] >= '0') || (ch[left]<='z' && ch[left] >= 'a'))){
                left++;
                continue;
            }
            if(!((ch[right]<='9' && ch[right] >= '0') || (ch[right]<='z' && ch[right] >= 'a'))){
                right--;
                continue;
            }
            if(ch[left] != ch[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}

