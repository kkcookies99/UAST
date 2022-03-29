 class Solution {
public:
void dfs(TreeNode* node){
    if(node==nullptr) return;
    
    dfs(node->left);
    if(node->val<=pre) {result=false; return;}
        pre=node->val;
    dfs(node->right);

}
    bool XXX(TreeNode* root) {
        pre=LONG_MIN;
        result=true;
        dfs(root);
        return result;
    }
    long int pre;
    bool result;
   
};```

