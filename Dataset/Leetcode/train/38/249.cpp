class Solution {
public:
    string XXX(int n) {
        string s="";
        for(int i=0;i<n;i++){
            if(i==0) s+="1";
            else{
                string v="";
                for(int j=0,k=-1;s[j];j++){
                    //if(k==-1) {k=j;}
                    if(s[j]!=s[j+1]){
                        v+=to_string(j-k);
                        v+=s[j];
                        k=j;
                    }
                }
                s=v;
            }
        }
        return s;
    }
};

