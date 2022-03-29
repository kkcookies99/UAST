 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.empty()) return "";
        for(int i = 0; ; i++ ){
            for(const auto & word: strs){
                if(i >= word.length() || (*strs.begin())[i] != word[i]){
                    return word.substr(0, i);
                }
            }
        }
        return "";
    }
};

