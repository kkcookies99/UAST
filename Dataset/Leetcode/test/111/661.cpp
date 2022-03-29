 class Solution {
public:
    int XXX(TreeNode* root) {
        if(nullptr == root) return 0;
        int l=0,r=0;
        if(nullptr!=root->left) l=minHeight(root->left);
        if(nullptr!=root->right) r=minHeight(root->right);
        if(r==0&&l==0) return 1;
        else if((l>=r&&r!=0) || (r>=l&&l==0)) return r+1;
        else if((l>=r&&r==0) || (r>=l&&l!=0)) return l+1;
        return 0;//没用
    }
    int minHeight(TreeNode* root){
        int l = 0,r = 0;
        if(nullptr!=root->left) l = minHeight(root->left);
        if(nullptr!=root->right) r = minHeight(root->right);
        if(r==0&&l==0) return 1;
        else if((l>=r&&r!=0) || (r>=l&&l==0)) return r+1;
        else if((l>=r&&r==0) || (r>=l&&l!=0)) return l+1;
        return 0;//没用，不会走到这。
    }
};

