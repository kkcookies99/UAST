 class Solution {
public:
    string XXX(vector<string>& strs) {
        string res = "";
        char temp = strs[0][0];
        int index = 0;
        bool flag = true;
        int maxLen = 0;
        for(int i = 0; i<strs.size();++i){
            maxLen = max(int(strs[i].length()),maxLen);
        }

        while(index<maxLen){       
            for(int i = 0; i < strs.size(); ++i){
                if(strs[i][index] != temp){
                    flag = false;
                }
            }
            if (!flag) return res;
            if (flag) res.push_back(temp);
            index++;
            temp = strs[0][index];
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

