 class Solution {
    public boolean XXX(String s) {
        if(s.length()<2) return true;
        int left=0,right=s.length()-1;
        char a='a',b='b';
        while(left<right){
            a=s.charAt(left);
            b=s.charAt(right);
            if(!((a>='0'&&a<='9')||(a>='a'&&a<='z')||(a>='A'&&a<='Z'))){
                left++;
                continue;
            }
            if(!((b>='0'&&b<='9')||(b>='a'&&b<='z')||(b>='A'&&b<='Z'))){
                right--;
                continue;
            }
            if(a>='A'&&a<='Z') a+=32;
            if(b>='A'&&b<='Z') b+=32;
            if(a!=b) return false;
            left++;
            right--;
        }
        return true;
    }
}

