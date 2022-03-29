 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if(!root) return res;
        stack<TreeNode*> st;
        TreeNode* curr = root;
        while(curr || !st.empty()) {
            while(curr) {
                st.push(curr);
                curr = curr->left;
            }
            curr = st.top();
            st.pop();
            res.push_back(curr->val);
            curr = curr->right;
        }
        return res;
    }
};

