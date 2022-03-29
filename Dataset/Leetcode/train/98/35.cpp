 class Solution {
public:
    bool XXX(TreeNode* root) {
        return verify(root,INT32_MIN,INT32_MAX);
    }
    bool verify(TreeNode* root,int low,int up){//必须在[low,up]内
        if(root->val<low||root->val>up)return false;
        if(root->left!=nullptr){
            if(root->val==INT32_MIN)return false;//已经最小了，如果左边还有数，返回false
            if(!verify(root->left,low,root->val-1))return false;
        }
        if(root->right!=nullptr){
            if(root->val==INT32_MAX)return false;//已经最大了，如果右边还有数，返回false
            if(!verify(root->right,root->val+1,up))return false;
        }
        return true;
    }
};

