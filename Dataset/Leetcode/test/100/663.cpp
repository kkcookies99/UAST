 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p == nullptr && q == nullptr) return true;
        if(p == nullptr && q != nullptr) return false;
        if(p != nullptr && q == nullptr) return false;
        if(p != nullptr && q != nullptr && p->val != q->val) return false;
        queue<TreeNode*>pp;
        queue<TreeNode*>qq;
        pp.push(p);
        qq.push(q);
        while(!pp.empty()){
            TreeNode* nowp = pp.front();
            TreeNode* nowq = qq.front();
            pp.pop();
            qq.pop();
            if(nowp->left == nullptr && nowp->right == nullptr && nowq->left == nullptr && nowq->right ==nullptr) continue;
            else if(nowp->left != nullptr && nowp->right == nullptr && nowq->left != nullptr && nowq->right == nullptr){
                if(nowp->left->val == nowq->left->val){
                    pp.push(nowp->left);
                    qq.push(nowq->left);
                }else return false;
            }else if(nowp->left == nullptr && nowp->right != nullptr && nowq->left == nullptr && nowq->right != nullptr){
                if(nowp->right->val == nowq->right->val){
                    pp.push(nowp->right);
                    qq.push(nowq->right);
                }else return false;
            }else if(nowp->left != nullptr && nowp->right != nullptr && nowq->left != nullptr && nowq->right != nullptr){
                if(nowp->left->val == nowq->left->val){
                    pp.push(nowp->left);
                    qq.push(nowq->left);
                }else return false;
                if(nowp->right->val == nowq->right->val){
                    pp.push(nowp->right);
                    qq.push(nowq->right);
                }else return false;
            }else return false;
        }
        return true;
    }
};

