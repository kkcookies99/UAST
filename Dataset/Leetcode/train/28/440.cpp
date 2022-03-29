 class Solution {
public:
    vector<int> ne;
    void buildNext(const string& p)
    {
        int now = 0;
        ne.push_back(0);
        for (int i = 1; i < p.size(); i++)
        {
            if (p[i] == p[now]) ne.push_back(++now);
            else if (now) now = ne[now - 1], i--;
            else ne.push_back(0);
        }
    }

    int XXX(string s, string p) {
        if (p == "") return 0;
        buildNext(p);

        for (int i = 0, j = 0; i < s.size(); i++)
        {
            if (s[i] == p[j]) j++;
            else if (j) j = ne[j - 1], i--;
            if (j == p.size()) return i - p.size() + 1;
        }
        return -1;
    }
};

