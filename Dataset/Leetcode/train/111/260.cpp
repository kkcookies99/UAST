class Solution {
public:
    int XXX(TreeNode* root) {
        if(root){
             if(root->left ==0 && root->right==0)
                return 1;
            auto lf = XXX(root->left);
            auto rg = XXX(root->right);
            if(lf==0 || rg==0)
                return lf?lf+1:rg+1;
            return min(lf+1,rg+1);
        }
        return 0;
    }
};

