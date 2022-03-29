 class Solution {
    public String XXX(int num) {
char[][] base={{'I','V','X'},{'X','L','C'},{'C','D','M'},{'M','M','M'}};
        char[] str=new char[15];
        int n,start=14,pos;
        for(int i=0;;i++){
            pos=start+1;
            n=num%10;
            if(n==0)
            {
                num/=10;
                continue;
            }
            else if(n<4)
                while(start>=pos-n)
                    str[start--]=base[i][0];
            else if(n==5)
                str[start--]=base[i][1];
            else if(n==4) {
                str[start--]=base[i][1];
                str[start--]=base[i][0];
            }
            else if(n<9)
                while(start>=pos+4-n)
                {
                    str[start--]=base[i][0];
                    if(start==pos+4-n)
                        str[start--]=base[i][1];
                }
            else if(n==9){
                str[start--]=base[i][2];
                str[start--]=base[i][0];
            }
            num/=10;
            if(num==0) 
                return String.valueOf(str).trim();
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


