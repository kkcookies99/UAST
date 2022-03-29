 class Solution {
    public boolean XXX(String s) {
        int l = 0,r = s.length()-1;
        while(l<r){
            while(l<r&&(s.charAt(l)<'0'||(s.charAt(l)>'9'&&s.charAt(l)<'A')||(s.charAt(l)>'Z'&&s.charAt(l)<'a')||s.charAt(l)>'z'))l++;
            while(r>l&&(s.charAt(r)<'0'||(s.charAt(r)>'9'&&s.charAt(r)<'A')||(s.charAt(r)>'Z'&&s.charAt(r)<'a')||s.charAt(r)>'z'))r--;
            if(s.charAt(l)>='0'&&s.charAt(l)<='9'){
                if(s.charAt(l)!=s.charAt(r))return false;
            }else if(s.charAt(l)!=s.charAt(r)&&(s.charAt(l)+32)!=s.charAt(r)&&s.charAt(l)!=(s.charAt(r)+32))return false;
            l++;
            r--;
        }
        return true;
    }
}

