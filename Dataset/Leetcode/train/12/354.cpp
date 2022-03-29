 class Solution {
    string romanChar = "IVXLCDM";
    vector<int> intBoundary = {1, 5, 10, 50, 100, 500, 1000};
public:
    string XXX(int num) {
        string romaNum;
        int special = 100;
        for(int i = intBoundary.size() - 1; i >= 0; --i) {
            for(int j = 0; j < num/intBoundary[i]; ++j) {
                romaNum += romanChar[i];
            }
            num %= intBoundary[i];
            if(i > 0 && num >= intBoundary[i] - special) {
                if(num/special > 5) {
                    romaNum += romanChar[i - 2];
                }
                else {
                    romaNum += romanChar[i - 1];
                }
                romaNum += romanChar[i];
                num -= intBoundary[i] - special;
            }
            if(i % 2) special /= 10;
        }
        return romaNum;
    }
};

