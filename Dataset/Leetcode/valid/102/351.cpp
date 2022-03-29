class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>>  res;

        //记录一层的结尾元素
        vector<int> tmp;
        TreeNode* index = root;
        queue<TreeNode*> q;
        if (root == nullptr) return res;

        q.push(root);
        while (!q.empty()) {
            auto cur = q.front();
            tmp.push_back(cur->val);
            if (cur->left != nullptr) q.push(cur->left);
            if (cur->right != nullptr) q.push(cur->right);
            
            //出队的元素是上层的结尾元素则结尾元素赋值为当前队列尾端，即当层的结尾
            if (cur == index) {
                index = q.back();
                res.push_back(tmp);
                tmp.clear();
            }
            q.pop();
        }
        return res;
    }
};

