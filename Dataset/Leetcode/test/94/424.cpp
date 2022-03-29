 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        TreeNode *tmp;
        vector<int> ans;
        tmp = root;

        while (!s.empty() || tmp){
            while (tmp){
                s.push(tmp);
                tmp = tmp -> left;
            }
            if (!s.empty()){
                tmp = s.top();
                s.pop();
                ans.push_back(tmp->val);
                tmp = tmp -> right;
            }
        }
        return ans;
    }
};

