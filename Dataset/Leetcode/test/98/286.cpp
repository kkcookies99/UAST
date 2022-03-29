 class Solution {
public:
    bool XXX(TreeNode* root) {
        TreeNode *cur = root;
        TreeNode *pre = nullptr;
        while(cur){
            if(cur->left){
                TreeNode *tmp = cur->left;
                while(tmp->right != nullptr && tmp->right != cur){
                    tmp = tmp->right;
                }
                if(tmp->right == nullptr){
                    tmp->right = cur;
                    cur = cur->left;
                }else{
                    tmp->right = nullptr;
                    if(cur->val <= pre->val)
                       return false;
                    pre = cur;
                    cur = cur->right;
                }
            }else{
                if(pre && cur->val <= pre->val)
                    return false;
                pre = cur;
                cur = cur->right;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


