class Solution {
public:
    bool ans ; 
    bool XXX(TreeNode* root) {
        ans = true ;
        dfs(root) ;
        return ans ;
    }
    int dfs(TreeNode* root){
        if(!root) return 0 ;
        int left = dfs(root -> left) , right = dfs(root -> right) ;
        if(abs(left - right) > 1) ans = false ;
        return max(left,right) + 1 ;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


