 class Solution {
    public boolean XXX(String s) {
       if(s == null || s=="") return true;
        char[] chs = s.toCharArray();
        int l = 0;
        int r = chs.length - 1;
        all : while(l < r){
            while(chs[l]<'0'|| chs[l]>'z'||(chs[l]>'Z'&&chs[l]<'a')||(chs[l]>'9'&&chs[l]<'A')){
                l++;
                if(l>=r) break all;
            }
            while(chs[r]<'0'|| chs[r]>'z'||(chs[r]>'Z'&&chs[r]<'a')||(chs[r]>'9'&&chs[r]<'A')){
                r--;
                if(l>=r) break all;
            }

            if(chs[l] == chs[r] || (Math.abs(chs[l]-chs[r])==32&&chs[l]>='A')){
                l++; r--;
            }else{
                return false;
            }
        }
        return true;
    }
}

