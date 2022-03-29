 class Solution {
public:
    string XXX(vector<string>& strs) {
        sort(strs.begin(),strs.end());
        string left=strs[0],right=strs[strs.size()-1];
        int len=min(left.length(),right.length()),i=0;
        while(i<len&&left[i]==right[i]) i++;
        return strs[0].substr(0,i);
    }
};

