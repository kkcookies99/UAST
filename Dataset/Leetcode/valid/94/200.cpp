 class Solution {
public:
    vector<int> connect(const vector<int> &v1, const vector<int> &v2)
    {
        vector<int> ans = v1;
        for (auto p = v2.begin(); p != v2.end(); ++p) ans.push_back(*p);
        return ans;
    }

    vector<int> XXX(TreeNode* root) {
        if (!root) return vector<int>{};
        vector<int> ans{};
        vector<int> left = XXX(root -> left);
        ans = connect(left, vector<int>{root -> val});
        vector<int> right = XXX(root -> right);
        ans = connect(ans, right);
        return ans;
    }
};

