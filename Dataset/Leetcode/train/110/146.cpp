class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr)return true;
        int left,right;
        if(!XXX(root->left,left)||!XXX(root->right,right))return false;
        else if(abs(left-right)>1)return false;
        return true;
    }
    bool XXX(TreeNode* root,int& height) {
        if(root==nullptr){
            height = 0;
            return true;
        }
        int left,right;
        if(!XXX(root->left,left)||!XXX(root->right,right))return false;
        else if(abs(left-right)>1)return false;
        height = std::max(left,right)+1;
        return true;
    }
};

