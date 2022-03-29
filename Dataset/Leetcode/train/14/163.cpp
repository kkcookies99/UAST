 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size() == 0) return "";
        int min, minj = 0;
        for(int i=0;i<strs.size();i++) {
            if(min > strs[i].length()) min = strs[i].length(), minj = i;
        }
        string result = "";
        for(int j=0;j<min;j++) {
            char s = strs[minj][j];
            int yes = 1;
            for(int i=0;i<strs.size();i++){
                if(strs[i][j] != s) {yes = 0; break;}
            }
            if(yes == 1) result += s;
            else break;
        }
        return result;
    }
};

