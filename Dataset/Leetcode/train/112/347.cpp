 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==NULL)return false;
        if(dfs(root,targetSum,0)){
            return true;
        }
        return false;
        
    }
    bool dfs(TreeNode* root, int targetSum,int sum){
        if(root!=NULL && root->left==NULL && root->right==NULL &&sum+root->val==targetSum){
            return true;
        }
        sum+=root->val;
        bool r1,r2;
        if(root->left){
            r1=dfs(root->left,targetSum,sum);
        }
        if(root->right){
            r2=dfs(root->right,targetSum,sum);
        }
        return r1|r2;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


