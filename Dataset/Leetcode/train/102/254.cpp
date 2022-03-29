class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> q({root});
        int n = q.size();
        vector<int> thisLine;
        vector<vector<int>> ans;
        while (!q.empty()) {
            for (int i = 0; i < n; ++i) {
                if (q.front()) {
                    thisLine.push_back(q.front()->val);
                    if (q.front()->left) q.push(q.front()->left);
                    if (q.front()->right) q.push(q.front()->right);
                }
                q.pop();
            }
            if (!thisLine.empty()) ans.push_back(thisLine);
            thisLine.clear();
            n = q.size();
        }
        return ans;
    }
};

