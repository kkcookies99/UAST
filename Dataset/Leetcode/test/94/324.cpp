 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> st;
        if(root) st.push(root);
        while(!st.empty()){
            TreeNode *cur  = st.top();
            if(cur!=nullptr){
                st.pop();
                if(cur->right) st.push(cur->right);
                st.push(cur);
                st.push(nullptr);
                if(cur->left) st.push(cur->left);
            }else{
                st.pop();
                TreeNode  * temp = st.top();
                st.pop();
                res.push_back(temp->val);
            }
        }
        return res;
    }
};

