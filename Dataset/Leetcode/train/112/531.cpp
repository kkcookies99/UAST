 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root!=NULL){
            sum-=root->val;
            if(sum==0&&!root->left&&!root->right)
                return true;
            return XXX(root->left,sum)||XXX(root->right,sum); 
        }return false;
    }
};

