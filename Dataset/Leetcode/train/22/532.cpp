 class Solution {
public:
    vector<string> res;
    int limit;
    void trackback(string s, int leftNum, int rightNum)
    {
        // 剪枝
        if(leftNum == limit)
        {
            s.append(leftNum - rightNum, ')');
            res.push_back(s);
            return;
        }
        if(leftNum == rightNum)
        {
            s.append(1, '(');
            trackback(s, leftNum + 1, rightNum);
        }
        else if(leftNum > rightNum)
        {
            string temp = s;
            s.append(1, '(');
            trackback(s, leftNum + 1, rightNum);
            // s.erase(s.end() - 1);
            temp.append(1, ')');
            trackback(temp, leftNum, rightNum + 1);
        }
    }
    vector<string> XXX(int n) {
        limit = n;
        trackback("", 0, 0);
        return res;
    }
};

