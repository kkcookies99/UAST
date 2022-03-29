class Solution {
public:
    struct node{
        TreeNode* p;
        int depth;
        node(TreeNode* _p,int _depth){p=_p;depth=_depth;}
    };

    queue<node> q;

    int XXX(TreeNode* root) {
        if (!root) return 0;
        q.push(node(root,1));
        for (;;){
            TreeNode* tmp=q.front().p;
            int tmp_depth=q.front().depth;
            if ((!tmp->left)&&(!tmp->right)) return tmp_depth;
            if (tmp->left) q.push(node(tmp->left,tmp_depth+1));
            if (tmp->right) q.push(node(tmp->right,tmp_depth+1));
            q.pop();
        }
    }
};

