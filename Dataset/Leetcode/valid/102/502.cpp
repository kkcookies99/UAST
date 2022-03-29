class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ans;
        vector<int> temp;
        if (!root) return ans;
        queue<TreeNode*> q;
        q.push(root);
        TreeNode *p, *flag = root;  //p用来接出队节点，flag标记是否达到层末
        while (!q.empty()) {
            p = q.front();
            q.pop();
            temp.emplace_back(p->val);
            if (p->left) {
                q.push(p->left);
            }
            if (p->right) {
                q.push(p->right);
            }
            if (p == flag) {
                ans.emplace_back(temp);
                temp.clear();
                //更新flag
                flag = q.back();
            }
        }
        return ans;
    }
};

