class Solution {
public:
    int XXX(TreeNode* root) {
        int h=0;
        queue<TreeNode*>q;
        if(root) q.push(root);
        while(q.size()){
            int len=q.size();
            while(len--){
                auto t=q.front();
                q.pop();
                if(t->left) q.push(t->left);
                if(t->right) q.push(t->right);
            }
            h++;
        }
        return h;
    }
};

