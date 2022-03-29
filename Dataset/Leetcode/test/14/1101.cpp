 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0) return "";
        if(strs.size()==1) return strs[0];
        string res=strs[0];
        int max=res.length();
        for(int i=1;i<strs.size();i++){
            string next=strs[i];
            int index=0;
            while(res[index]==next[index]){
                index++;
            }
            if(index==0) return "";
            max=max>index?index:max;
            res=res.substr(0,max);
        }
        if(index==0){
            return "";
        }
        else{
            return res.substr(0,max);
        }
    }
};

