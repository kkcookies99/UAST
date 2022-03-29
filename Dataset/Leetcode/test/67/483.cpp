class Solution {
public:
    string XXX(string &a, string &b) {
        string s="";
        int la=a.length(),lb=b.length();
        int len = max(la,lb),jw=0;
        if(a.size()>b.size()){
            for(int i = 1;i <= len - lb; ++i)
                b = "0" + b;
        }else if(a.size()<b.size()){
            for(int i = 1; i <= len - la; ++i)
                a = "0" + a;  
        }
        for(int i=len-1;i>=0;--i){
            int num_a = a[i]-'0';
            int num_b = b[i]-'0';
            if((num_a^num_b)==1){
                if(jw==1) {s+="0";jw=1;}
                else {s+="1";jw=0;}
            }
            else{
                if(jw==1) s+="1";
                else s+="0";
                jw=0;
                if((num_a&num_b)==1) jw=1;
            }
        }
        if(jw==1)
            s+="1";
        reverse(s.begin(),s.end());
        return s;
    }
};

