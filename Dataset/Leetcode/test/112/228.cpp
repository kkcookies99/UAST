 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        if(!root->left && !root->right){
            if(targetSum-root->val == 0) return true;
            else return false;
        }
        targetSum -= root->val;
        bool left = XXX(root->left,targetSum);
        bool right = XXX(root->right,targetSum);
        return left || right;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


