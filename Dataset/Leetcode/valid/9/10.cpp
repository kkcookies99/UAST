class Solution {
public:
    bool XXX(int x)
    {
        string temp;
        temp = to_string(x);
        string str = temp;
        reverse(str.begin(), str.end());
        return str == temp;
    }
};

