 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> st;
        vector<int> ans;
        while (root||st.size()){
            while (root){
                st.push(root);
                root=root->left;
            }
            root=st.top();
            st.pop();
            ans.push_back(root->val);
            root=root->right;
        }
        return ans;
    }
};

