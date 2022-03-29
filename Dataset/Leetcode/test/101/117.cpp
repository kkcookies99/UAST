 class Solution {
public:
    bool XXX(TreeNode* root) {
        queue<TreeNode*> q;
        vector<int> v;
        if(!root)
            return true;
        q.push(root);
        TreeNode* t=root;
        while(q.size()&&t){
            int n=q.size();
            while(n){
                t=q.front();
                q.pop();
                if(t->left){
                    q.push(t->left);
                    v.push_back(t->left->val);
                }
                else{
                    v.push_back(0x7fffffff);
                }
                if(t->right){
                    q.push(t->right);
                    v.push_back(t->right->val);
                }
                 else{
                    v.push_back(0x7fffffff);
                }
                n--;
            }
            int i=0;
            while(i<v.size()>>1){
                if(v[i]!=v[v.size()-i-1])
                    return false;
                i++;
            }
            v.clear();
        }
        return true;
    }
};

