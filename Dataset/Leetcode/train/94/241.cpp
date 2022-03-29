 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> st;
        if(root==nullptr)
            return ans;
        st.push(root);
        while(!st.empty())
        {
            TreeNode* temp=st.top();
            if(temp->left!=nullptr)
                {
                    st.push(temp->left);
                    temp->left=nullptr;
                    continue;
                }
            ans.push_back(temp->val);
            st.pop();
            if(temp->right!=nullptr)
                st.push(temp->right);
        }
        return ans;
    }
};

