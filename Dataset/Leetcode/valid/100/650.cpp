 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q!=NULL)
            return false;
        if(p!=NULL&&q==NULL)
            return false;
        if(p==NULL&&q==NULL)
            return true;
        if(p->val==q->val){
            return XXX(p->left,q->left)&&XXX(p->right,q->right);
        }
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


