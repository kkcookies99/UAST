class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> q;
        vector<vector<int>> res;
        if(!root) return res;
        int num = 1;
        q.push(root);
        while(!q.empty()){
            int num1 = 0;
            vector<int> thisOrder;
            for(int i = 0; i < num; i++){
                TreeNode* t = q.front();
                thisOrder.push_back(t->val);
                if(t->left) {
                    q.push(t->left);
                    num1++;
                }
                if(t->right) {
                    q.push(t->right);
                    num1++;
                }
                q.pop();
            }
            num = num1;
            res.push_back(thisOrder);
        }
        return res;
    }
};

