class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> res;
        vector<int> v;
         if (root == NULL){
            return res;
        }
        int n,h,all;
        TreeNode* s;
        queue<TreeNode*> q;
        q.push(root);
        h=0;
        n=1;
        while (!q.empty()){
            s = q.front();
            q.pop();
            n--;
            v.push_back(s->val);
            if (s->left!=NULL){
                q.push(s->left);
                h++;
            }
            if (s->right!=NULL){
                q.push(s->right);
                h++;
            }
            if (n==0){
                res.push_back(v);
                v.clear();
                n = h;
                h=0;
            }
        }
        return res;
    }
};

