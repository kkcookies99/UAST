 class Solution {
public:
    string XXX(vector<string>& strs) {
    string result;
    int min_length=200;
    for (auto & str : strs) {
        int length = str.length();
        if (length<min_length){
            min_length = length;
        }
    }
    for (int i = 0; i < min_length; ++i) {
        char temp = strs[0][i];
        for (auto & str : strs) {
            if (str[i]!=temp){
                return result;
            }
        }
        result.append(1,temp);
    }
    return result;
}
};

