 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)
            return s;
        vector<vector<char>> v(numRows, vector<char>());
        int index = 0;
        bool isAdd = true;
        for(auto & i : s)
        {
            v[index].push_back(i);
            if(isAdd)
            {
                index++;
                if(index == numRows - 1)
                    isAdd = false;
            }
            else
            {
                index--;
                if(index == 0)
                    isAdd = true;
            }
        }
        string ret = "";
        for(auto & i : v)
        {
            for(auto & j : i)
            {
                ret = ret + j;
            }
        }
        return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

