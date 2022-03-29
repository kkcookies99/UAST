 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> a;
        if(root==NULL)
            return a;
        inorder(root,a);
        return a;
    }
    
    void inorder(TreeNode* root,vector<int> &v){
        if(root->left!=NULL)
            inorder(root->left,v);
        v.push_back(root->val);
        if(root->right!=NULL)
            inorder(root->right,v);
    }
};

