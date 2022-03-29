 class Solution {
public:
    string XXX(vector<string>& strs) {
        int minlen=0;
        for(int i=0;i<strs.size();i++){
            if(strs[i].size()<strs[minlen].size())
                minlen=i;
        }
        int maxlen=INT_MAX;
        for(int j=0;j<=strs[minlen].size();j++){
            char mychar=strs[minlen][j];
            int i=0;
            while(i<strs.size()&&strs[i][j]==mychar)
                    i++;      
            if(i==strs.size())
                maxlen=j;
            else
              break;
            
        }
        return maxlen==INT_MAX?"":strs[minlen].substr(0,maxlen+1);
    }
};

