class Solution {
public:
    string XXX(int n) {
    string res = "1";
    for (int i = 1; i < n; ++i) {
        string temp = "";
        for (int j = 0; j < res.size(); ++j) {
            int k = 1;
            while (j+1<res.size()&&res[j]==res[j+1]){
                k++;
                j++;
            }
            temp.append(1,k+'0');
            temp.append(1,res[j]);
        }
        res = temp;
    }
    return res;
}
};

