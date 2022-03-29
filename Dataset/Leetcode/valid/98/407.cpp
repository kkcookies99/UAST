 class Solution {
public:
    vector<int>value;
    void inorder(TreeNode* root){
        if(!root)return;
        inorder(root->left);
        value.push_back(root->val);
        inorder(root->right);
    }
    bool XXX(TreeNode* root) {
        inorder(root);
        int n=value.size();
        for(int i=0;i<n-1;i++){
            if(value[i+1]<=value[i])
            return false;
        }
        return true;
    }
};

