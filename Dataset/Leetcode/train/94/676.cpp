 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> st;
        while(!st.empty()||root){
            while(root){
                st.push(root);
                root=root->left;
            }
            if(!st.empty()){
                root=st.top();
                st.pop();
                ans.push_back(root->val);
                root=root->right;
            }
        }
        return ans;
    }
};

