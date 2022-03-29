class Solution {
public:
    bool XXX(TreeNode* root, int &deep) {
        if(!root){
            deep = 0;
            return true;
        }
        int lh = 0, rh = 0;
        bool lis = XXX(root->left, lh);
        bool ris = XXX(root->right, rh);
        deep = max(lh, rh) + 1;          //更新deep
        return lis && ris && abs(lh - rh) <= 1;
    }

    bool XXX(TreeNode* root) {
        int deep = 0;
        return XXX(root, deep);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


