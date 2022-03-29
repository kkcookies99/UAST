class Solution {
public:
    int ans=1;
    
    int cal(TreeNode* root){
        if(!root) return 0;
        int l=cal(root->left);
        int r=cal(root->right);
        if(abs(l-r)>1) ans=0;
        return max(l,r)+1;
    }
    
    bool XXX(TreeNode* root) {
        cal(root);
        return ans;
    }
};

