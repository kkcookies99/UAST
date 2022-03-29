 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ret;
        stack<TreeNode *> st;
        TreeNode *tmp = nullptr;

        if (root == nullptr) {
            return ret;
        }

        st.push(root);
        while (!st.empty()) {
            tmp = st.top();
            if (tmp->left != nullptr) {
                st.push(tmp->left);
                tmp->left = nullptr;
            } else {
                ret.push_back(tmp->val);
                st.pop();
                if (tmp->right != nullptr) {
                    st.push(tmp->right);
                    tmp->right = nullptr;
                }
            }           
        }

        return ret;
    }
};

