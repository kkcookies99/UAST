class Solution {
public:
    bool res;

    int f(TreeNode* root){
        if (!root) return 0;
        if (!res) return 0;
        int l=f(root->left);
        int r=f(root->right);
        
        if (l-r>1||l-r<-1) res=false;
        return max(l,r)+1;
    }

    bool XXX(TreeNode* root) {
        res=true;
        f(root);
        return res;
    }
};

