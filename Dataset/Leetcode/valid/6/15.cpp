 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int span = numRows - 2;
        vector<stack<char>> vecStack;
        for(int spanIndex = numRows; spanIndex <s.length();spanIndex += numRows +span){
            stack<char> tmp;
            for(int i = spanIndex; i < span+spanIndex; i++){
                tmp.push(s[i]);
            }
            vecStack.push_back(tmp);
        }
        int k;
        string result;
        for(int i = 0; i < numRows; i++){
            bool isSpanEle = (i != 0 && i != numRows -1);
            k = 0;
            for(int j = i; j < s.length(); j += span+numRows){
                result += s[j];
                if(isSpanEle) {
                    if(k < vecStack.size() && vecStack[k].size() > 0){
                        result += vecStack[k].top();
                        vecStack[k].pop();
                        k++;
                    }
                }
            }
        }
        return result;
    }
};

