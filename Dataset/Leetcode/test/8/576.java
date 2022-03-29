 class Solution {
    public int XXX(String s) {
        int i=0,down=1;
        long ans=0,bit=1;
        while(i<s.length()&&s.charAt(i)==' ')i++;
        if(i==s.length()) return 0;
        if(s.charAt(i)=='-'){
            down=-1;
            i++;
        }else if(s.charAt(i)=='+')i++;
        int j=i;
        while(i<s.length()&&(s.charAt(i)<='9'&&s.charAt(i)>='0'))i++;
        while(i-->j){
            ans+=(s.charAt(i)-'0')*bit;
            if(ans>Integer.MAX_VALUE) {
                ans=Integer.MAX_VALUE;
                if(down==-1) return Integer.MIN_VALUE;
            }
            if(bit<Integer.MAX_VALUE) bit*=10;
        }
        return down*(int)ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


