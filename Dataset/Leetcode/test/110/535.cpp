class Solution {
public:
    bool ans=true;
    bool XXX(TreeNode* root) {
        auto c=TreeHight(root);
        return ans;
    }
    int TreeHight(TreeNode*root){
        if(!root||!ans)
        return 0;
        int left=TreeHight(root->left);
        int right=TreeHight(root->right);
        if(abs(left-right)>1)
        {
            ans=false;
            return 0;
        }
        if(!ans)
        return 0;
        return max(left,right)+1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


