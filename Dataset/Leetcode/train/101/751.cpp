 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root||(!root->left&&!root->right)) return true;
        stack<TreeNode*>p;
        stack<TreeNode*>q;
        TreeNode* l=root->left;
        TreeNode* r=root->right;
        if(!l&&r||(!r&&l)||(l->val!=r->val)) return false;
        p.push(l);
        q.push(r);
        while(!p.empty()){
            p.pop();
            q.pop();
            if(!check(l->left,r->right)) return false;
            if(l->left){
                p.push(l->left);
                q.push(r->right);
            }
            if(!check(l->right,r->left)) return false;
            if(r->left){
                p.push(l->right);
                q.push(r->left);
            }
            if(p.empty()) break;
            l=p.top();
            r=q.top();
        }
        return true;
    }
    bool check(TreeNode* l,TreeNode* r){
        if(!l&&r||(!r&&l)||(l&&r&&l->val!=r->val)) return false;
        return true;
    }
};

