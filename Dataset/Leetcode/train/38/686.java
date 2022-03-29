 class Solution {
    public String XXX(int n) {
        if (n==1) return "1";
        //else if(n==2) return "11";
        else{
            char[] ch = XXX(n-1).toCharArray();
            String str ="";
            int num=1;
            char val=ch[0];
            int last_len=ch.length;
            for (int i=1;i<last_len;i++){
                if(ch[i]==ch[i-1]){
                    num++;
                }
                else {
                    str=str+num+val;
                    num=1;
                    val=ch[i];
                }
            }
            str=str+num+val;
            return str;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


