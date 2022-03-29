 class Solution {
public:
    string temp;
    vector<string> result;

    vector<string> XXX(int n) {
        if (!n)
        {
            return result;
        }
        backTrack(n, n);
        return result;
    }

    void backTrack(int ln, int rn)  //ln，rn分别表示还需添加的左右括号数量
    {
        if (!ln && !rn)
        {
            result.push_back(temp);
        }
        if (ln)    //ln不为0就可以加"("
        {
            temp.push_back('(');
            backTrack(ln-1, rn);
            temp.pop_back();
        }
        if (rn > ln)   //ln比rn数小时,加")"才能构成完整括号
        {
            temp.push_back(')');
            backTrack(ln, rn-1);
            temp.pop_back();
        }
    }
};

