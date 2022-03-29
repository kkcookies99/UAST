 class Solution {
public:
    //dfs递归问题
    bool XXX(TreeNode* root, int sum) {
        if(root==nullptr)return false;
        sum -=root->val;
        if(root->left==nullptr&&root->right==nullptr)return sum==0;
        return XXX(root->left,sum)||XXX(root->right,sum);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


