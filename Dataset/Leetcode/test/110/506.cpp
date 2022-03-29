class Solution {
public:
    bool flag=false;
    int cheight(TreeNode* root){
        if(root){
            int hl=cheight(root->left);
            int hr=cheight(root->right);
            hl++; hr++; 
            if(abs(hl-hr)>1) flag=true;
            return max(hl,hr);
        }
        else return 0;
    }
    bool XXX(TreeNode* root) {
        int a=cheight(root);
        return !flag;
    }
};

