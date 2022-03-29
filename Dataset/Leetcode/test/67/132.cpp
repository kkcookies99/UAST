 class Solution {
public:
    string XXX(string a, string b) {
        reverse(a.begin(),a.end());
        reverse(b.begin(),b.end());
        string s="";
        int j=0;
        while(a.size()>b.size()) b+='0';
        while(a.size()<b.size()) a+='0';
        for(int i=0;a[i]&&b[i];i++){
            if(a[i]=='0') {
                if(j==0) s+=b[i];
                else if(b[i]=='0') {s+='1';j=0;}
                else s+='0';
                }
            else if(b[i]=='0') {
                if(j==0) s+=a[i];
                else if(a[i]=='0') {s+='1';j=0;}
                else s+='0';
                }
            else if(a[i]=='1'&&b[i]=='1') {
                if(j==0) {s+='0';j++;}
                else s+='1';
                }
        }
        if(j==1) s+='1';
        reverse(s.begin(),s.end());
        return s;
    }
};

