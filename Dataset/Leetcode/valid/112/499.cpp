 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL) return false;
        stack<TreeNode*> st;
        st.push(root);
        root->val-=sum;
        while(!st.empty()){
            root=st.top();
            st.pop();
            if(root->left==NULL&&root->right==NULL){
                if(root->val==0) return true;
                continue;
            } 
            if(root->left!=NULL){
                st.push(root->left);
                root->left->val+=root->val;
            }
            if(root->right!=NULL){
                st.push(root->right);
                root->right->val+=root->val;
            }
        }
        return false;
    }
};

