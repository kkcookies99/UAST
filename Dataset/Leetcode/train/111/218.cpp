class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root){
            return 0;
        } 
        else if(!root->left)
        {
            return XXX(root->right) + 1;
        }else if(!root->right){
            return XXX(root->left) + 1;
        }else{
            return min(XXX(root->left), XXX(root->right)) + 1;
        }
        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


