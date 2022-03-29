 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) 
    {
        if (nullptr == root) return {};
        queue<TreeNode*> pque;
        pque.push(root);
        int count = 1;
        vector<vector<int>> result;
        int level = 0;
        while (!pque.empty()) {
            result.resize(level+1);
            TreeNode *currNode = pque.front();
            pque.pop();
            result[level].push_back(currNode->val);
            if (currNode->left != nullptr) pque.push(currNode->left);
            if (currNode->right != nullptr) pque.push(currNode->right);
            --count;
            if (count == 0) {
                count = pque.size();
                ++level;
            }
        }
        return result;
    }
};
