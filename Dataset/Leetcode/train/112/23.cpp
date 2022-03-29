class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(!root) return false;
        targetSum-=root->val;
        if(!root->left&&!root->right&&targetSum==0) return true;            
        return XXX(root->left,targetSum)||XXX(root->right,targetSum);;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


