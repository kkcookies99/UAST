 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
            if (q == NULL && p == NULL) return true;
            if (q == NULL|| p == NULL || p->val != q->val) return false;
            if (XXX(p->left,q->left) == false) return false;
            if (XXX(p->right,q->right) == false) return false;
            return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


