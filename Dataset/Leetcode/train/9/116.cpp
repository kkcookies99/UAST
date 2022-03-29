class Solution {
public:
    bool XXX(int x) {
        string a = to_string(x);
        int l = 0,r = a.size() - 1;
        while (l < r)
        {
            if(a[l] != a[r]) return false;
        }
        return true;
    }
};

