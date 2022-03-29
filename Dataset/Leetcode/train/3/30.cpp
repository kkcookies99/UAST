 class Solution {
public:
    int XXX(string s) {
        int res = 0;
        int pre = 0;
        unordered_map<char, int> umap;
       
        for(int i = 0; i < s.size(); ++i) {
            auto it = umap.find(s[i]);
            if(it != umap.end())
                pre = max(it->second + 1, pre);
            umap[s[i]] = i;

            res = max(i - pre + 1, res);
        }
        return res;
    }
};

