 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        if (root==NULL) return vector<int>{};
        vector<int> ans;
        stack<TreeNode* > st;
        st.push(root);
        while (st.size()){
            root=st.top();
            st.pop();
            if (root==NULL){
                ans.push_back(st.top()->val);
                st.pop();
            }else{
                if (root->right)    st.push(root->right);
                st.push(root);
                st.push(NULL);
                if (root->left)     st.push(root->left);
            }
        }
        return ans;
    }
};

