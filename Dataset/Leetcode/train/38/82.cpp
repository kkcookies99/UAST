class Solution {
public:
    string XXX(int n) {
        string str="1";
        if(n==1)return str;
        int count = 0;
        int p,q;
        for(int i=2;i<=n;i++){
            p=q=0;
            string ans="";
            while(p<=str.length()-1){
                if(q<str.length()&&str[p]==str[q])
                    {   
                        count++;
                        q++;
                    }
                else {
                    ans+=to_string(count)+str[p];
                    p=q;
                    count=0;
                }
            }
            str=ans;
        }
        return str;
    }
};

