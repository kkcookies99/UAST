class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr ||(root->left==nullptr && root->right==nullptr))
            return true;
        int left = GetHight(root->left);
        int right = GetHight(root->right);
        if(left-right>1 || left-right <-1)
            return false;
        return XXX(root->left) && XXX(root->right);
    }

    int GetHight(TreeNode* pNode){
        if(pNode == nullptr)
            return 0;
        int a = GetHight(pNode->left);
        int b = GetHight(pNode->right);
        return a>b?a+1:b+1;
    }
};

