 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<pair<TreeNode *, int>> st;
        vector<int> ans;
        if (root)
            st.push(make_pair(root, 0));
        while (!st.empty()) {
            auto &item = st.top();
            if (item.first == nullptr) {
                st.pop();
                continue;
            }
            if (item.second == 0) {
                ans.push_back(item.first->val);
                item.second++;
            } else if (item.second == 1) {
                item.second++;
                st.push(make_pair(item.first->left, 0));
            } else if (item.second == 2) {
                st.push(make_pair(item.first->right, 0));
                item.second++;
            } else st.pop();
        }
        return ans;
    }
};

