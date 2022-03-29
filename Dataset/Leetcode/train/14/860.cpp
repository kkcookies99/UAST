 class Solution {
public:
    string XXX(vector<string>& strs) {
        sort(strs.begin(), strs.end(), [&](string a, string b){return a < b;});
        string first = strs[0];
        string last  = strs.back();
        string out;
        for(int i = 0; i < min(first.length(), last.length()); ++i)
        {
            if(first[i] == last[i])
                out += first[i];
            else
                break;
        }

        return out;       
    }
};

