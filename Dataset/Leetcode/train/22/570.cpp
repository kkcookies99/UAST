 class Solution {
public:
    vector<string> XXX(int n) {
        if (n < 1) {
            return result;
        }
        string s = "";
        addLeft(s, 0, 0, n);
        addRight(s, 0, 0, n);
        return result;
    }

    void addRight(string s, int left, int right, const int n)
    {
        if (right >= left) {
            return;
        }
        if (right < left && left <= n) {
            s.push_back(')');
            right++;
        }
        if (right == n && left == n) {
            result.push_back(s);
            return;
        }
        addLeft(s, left, right, n);
        addRight(s, left, right, n);
    }

    void addLeft(string s, int left, int right, const int n)
    {
        if (left >= n)
        {
            return;
        }
        if (left < n) {
            s.push_back('(');
            left++;
        }
        addLeft(s, left, right, n);
        addRight(s, left, right, n);
    }

private:
    vector<string> result;

};

