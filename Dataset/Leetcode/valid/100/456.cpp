 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q) return true;
        else if(!p || !q) return false;
        else return p->val==q->val && XXX(p->left, q->left) && XXX(p->right, q->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


