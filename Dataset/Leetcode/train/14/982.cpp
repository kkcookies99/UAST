 class Solution {
public:
    string XXX(vector<string>& strs) {
        string output="";
        for(int i=0;i<strs[0].size();i++){
            char s= strs[0][i];
            for(int ii=1;ii<strs.size();ii++){
                if(strs[ii][i]!=s){
                    return output;
                }
            }           
            output += s;
        }
        return output;
    }
};

