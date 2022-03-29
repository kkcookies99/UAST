 class Solution {
public:
    string XXX(vector<string>& str) {
        sort(str.begin(),str.end());
        string &s1=str.front();
        string &s2=str.back();
        int i=0;
        while(i<s1.size()&&i<s2.size()&&s1[i]==s2[i]){
            ++i;
        }
        return string(s1.begin(),s1.begin()+i);
    }
};

