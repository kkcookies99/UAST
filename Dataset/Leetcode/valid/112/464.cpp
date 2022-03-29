 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root == nullptr){
            return false;
        }
        if(recursion(root,sum) == 0){
            return true;
        }
        return false;
        
    }
    int recursion(TreeNode* root, int sum){
        if(root->left == nullptr && root->right== nullptr && sum-root->val == 0){
            return 0;
        }
        if(root->left != nullptr && root->right != nullptr){
            return recursion(root->left,sum-root->val)*recursion(root->right,sum-root->val);   
        }
        if(root->left != nullptr){
            return recursion(root->left,sum-root->val)*1;
        }
        if(root->right != nullptr){
            return recursion(root->right,sum-root->val)*1;
        }
        
        return -1;        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


