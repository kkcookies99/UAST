 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        if(!root) return ans;
        stack<TreeNode*> st;
        while(root||!st.empty()){
            while(root){
                st.push(root);
                root=root->left;
            }
            root=st.top();st.pop();
            ans.push_back(root->val);
            root=root->right;
        }
        return ans;
    }
};

