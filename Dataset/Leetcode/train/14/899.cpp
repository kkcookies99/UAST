 class Solution {
public:
    string XXX(vector<string>& strs) {
        string temp = "";
    int minNub = strs[0].length();
    for (int i = 1; i < strs.size(); i++)
    {
        if(minNub>strs[i].length())
            minNub = strs[i].length();
    }
    for (int i = 0; i < minNub; i++)
    {
        char cha=strs[0][i];
        for (int j = 1; j < strs.size(); j++)
        {
            if(strs[j][i]!=cha)
                return temp;
        }
        temp+=cha;
    }
    return temp;
    }
};

