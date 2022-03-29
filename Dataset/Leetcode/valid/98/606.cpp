 class Solution {
public:
    bool XXX(TreeNode* root) {
        return isB(root,nullptr,nullptr);
    }
    bool isB(TreeNode* root,int* max,int* min){
        if(!root)return true;
        if(max&&*max<=root->val){
            return false;
        }
        if(min&&*min>=root->val){
            return false;
        }
        return isB(root->left,&root->val,min)&&isB(root->right,max,&root->val);
    }
};

