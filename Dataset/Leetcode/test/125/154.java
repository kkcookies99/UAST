 class Solution {
    public boolean XXX(String s) {
        int f = 0, l = s.length()-1;
        while(f<l) {
            if(!((s.charAt(f)>='a'&&s.charAt(f)<='z')||(s.charAt(f)>='A'&&s.charAt(f)<='Z')||s.charAt(f)>='0'&&s.charAt(f)<='9')){
                f++;
                continue;
            }
            if(!((s.charAt(l)>='a'&&s.charAt(l)<='z')||(s.charAt(l)>='A'&&s.charAt(l)<='Z')||s.charAt(l)>='0'&&s.charAt(l)<='9')) {
                l--;
                continue;
            }
            if(s.charAt(f)==s.charAt(l)||(s.charAt(f)==s.charAt(l)+32&&s.charAt(l)>='A')||(s.charAt(f)==s.charAt(l)-32&&s.charAt(l)>='a')) {
                f++;
                l--;
            }else {
                return false;
            }
        }
        return true;
    }
}

