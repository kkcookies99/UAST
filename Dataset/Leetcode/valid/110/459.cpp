class Solution {
public:
    bool res = true;
    bool XXX(TreeNode* root) {
        if(!root) return true;
        bl(root);
        return res;
    }

    int bl(TreeNode* root){
        int cnt_l = 0;
        int cnt_r = 0;
        if(root->left){
            cnt_l = 1+bl(root->left);
        }
        if(root->right){
            cnt_r = 1+bl(root->right);    
        }
        if(abs(cnt_l-cnt_r)>1){
            res = false;
        }
        return max(cnt_l,cnt_r);
    }
};

