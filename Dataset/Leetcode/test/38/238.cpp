class Solution {
public:
    string XXX(int n) {
        string pre="1";
        for(int i=2;i<=n;i++){
            string str;
            char c=pre[0];
            int count=0;
            for(int j=0;j<pre.size();j++){
                if(pre[j]==c)
                    count++;
                else{
                    str+=to_string(count);
                    str+=c;
                    c=pre[j];
                    count=1;
                }
                if(j==pre.size()-1){
                    str+=to_string(count);
                    str+=c;
                }
            }
            pre=str;
        }
        return  pre;
    }
};

