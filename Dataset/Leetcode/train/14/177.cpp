 class Solution {
public:
    string XXX(vector<string>& strs) {
        string res=strs[0];
        for(int i=1;i<strs.size();++i)
        {
            int index=0;
            while(index<res.size())
            {
                if(res[index]==strs[i][index]){
                    index++;
                }else{
                    break;
                }
            }
            res=res.substr(0,index);
        }
        return res;
    }
};

