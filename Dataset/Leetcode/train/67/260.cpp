 class Solution {
public:
    string XXX(string a, string b) {
        string c="";
        int pre=0;
        while(a.length()>b.length()){
            b="0"+b;
        }
        while(a.length()<b.length()){
            a="0"+a;
        }
        int l=a.length()-1;
        while(l>=0){
            if(a[l]=='1'&&b[l]=='1'){
                if(pre==0){
                    pre=1;
                    c='0'+c;
                }else{
                    pre=1;
                    c='1'+c;
                }
            }else if(a[l]=='0'&&b[l]=='0'){
                if(pre==0){
                    c='0'+c;
                }else{
                    pre=0;
                    c='1'+c;
                }
            }else{
                if(pre==0){
                    c='1'+c;
                }else{
                    pre=1;
                    c='0'+c;
                }
            }
            l--;
        }
        if(pre==1){
            c='1'+c;
        }
        return c;
    }
};

