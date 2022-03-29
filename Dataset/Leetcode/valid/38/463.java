 class Solution {
    public String XXX(int n) {
        String s="1";
        for(int i=1;i<n;++i){
            s=say(s);
        }
        return s;
    }

    public String say(String s){
        String res="";
        char[] sc=s.toCharArray();
        int count=1;
        for(int i=0;i<sc.length;++i){
            if(i==sc.length-1||sc[i]!=sc[i+1]){
                res=res+count+sc[i];
                count=1;
            }
            else ++count;
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


