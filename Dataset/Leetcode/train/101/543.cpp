 class Solution {
public:
    bool dfs(TreeNode* leftt,TreeNode* rightt){
        if(!leftt&&!rightt) return true;
        if(!leftt && rightt) return false;
        if(leftt && !rightt) return false;
        if(leftt->val != rightt->val) return false;
        return dfs(leftt->right,rightt->left)&&dfs(leftt->left,rightt->right); 
    }
    bool XXX(TreeNode* root) {
        if(!root) return true;
        return dfs(root->left,root->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


