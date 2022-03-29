 class Solution {
public:
    string XXX(vector<string>& strs) {
        //需要取strs的第i个，strs[i]，再取strs[i]中的第[j]份，因此要两次
        if(size(strs)==0){
            return "";
        }
        string res=strs[0];
        for(int i=1;i<size(strs);i++){
            int j=0;
            string &jud=strs[i];
            int l=min(res.length(),jud.length());
            while(j<l&&res[j]==jud[j]){
                j++;
            }  
            res=res.substr(0,j);
        }
         return res;
    }
};

