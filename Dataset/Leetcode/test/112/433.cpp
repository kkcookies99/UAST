 class Solution {
public:
    bool res = false;
    bool XXX(TreeNode* root, int sum) {
        if(root == NULL)return false;
        lengthroute(root,0,sum);
        return res;
    }
    void lengthroute(TreeNode* root, int level,int sum){
        if(root == NULL)return;
        level += root->val;
        if(root->left == NULL && root->right == NULL && level == sum){
            res = true;
            return;
        }
        lengthroute(root->left,level,sum);
        lengthroute(root->right,level,sum);
    }

};

