 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1) return s;
        vector<vector<int> > myVec(numRows); 
        int flag = -1;
        for(int i=0,j=0;i<s.size();i++){
            myVec[j].push_back(s[i]);
            if(j==numRows-1 || j==0) flag++;
            if(flag%2==0) j++;
            else j--;
        }
        string ans;
        for(int i=0;i<myVec.size();i++){
            for(int j=0;j<myVec[i].size();j++){
                ans += myVec[i][j];
            }
        }
        return ans;
    }
};

