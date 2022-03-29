 class Solution {
    public int XXX(String s) {
        if(s==null||s.isEmpty()) return 0;
        int l = s.length()-1;
        while(l>=0&&!((s.charAt(l)>='a'&&s.charAt(l)<='z')||(s.charAt(l)>='A'&&s.charAt(l)<='Z'))) {
            l--;
        }
        int res = 0;
        while(l>=0&&((s.charAt(l)>='a'&&s.charAt(l)<='z')||(s.charAt(l)>='A'&&s.charAt(l)<='Z'))) {
            res++;
            l--;
        }
        return res;
    }
}

