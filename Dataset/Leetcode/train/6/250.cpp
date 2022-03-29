 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1) return s;
        int row=0,index=0;
        vector<string> ve(numRows);
        while(true){
            while(row<numRows&&index<s.size()){
                ve[row].push_back(s[index]);
                row++,index++;
            }
            if(index==s.size()) break;
            row-=2;
            while(row>=0&&index<s.size()){
                ve[row].push_back(s[index]);
                row--,index++;
            }
            row+=2;
            if(index==s.size()) break;
        }
        string res;
        for(int i=0;i<ve.size();i++) res+=ve[i];
        return res;
    }
};

