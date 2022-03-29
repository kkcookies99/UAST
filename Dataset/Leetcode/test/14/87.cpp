 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.empty()||strs[0].empty()) return "";
        //if(strs.size()==1) return strs[0];
        int n=strs.size();
        int n1=strs[0].size();
        for(int i=0;i<n1;i++){ //遍历flower的长度
            char c=strs[0][i];
            for(int j=1;j<n;j++){//遍历三个字符串
                if(strs[j][i]!=c){
                    return (i==0)?"":strs[0].substr(0,i);
                }
            }
        }
        return strs[0];
    }
};

