class Solution {
public:
    queue<TreeNode* > q1,q2;
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        if(!root) return ans;
        q1.push(root);
        while(q1.size()){
            vector<int> cur;
            while(q1.size()){
                auto p = q1.front();q1.pop();
                cur.push_back(p->val);
                if(p->left) q2.push(p->left);
                if(p->right) q2.push(p->right);
            }
            ans.push_back(cur);
            swap(q1,q2);
        }
        return ans;
    }
};

