class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(nullptr == root) return {};
        vector<vector<int>> XXX;
        DFS(root, 0, XXX);
        cout << XXX.size() << endl;
        return XXX;
    }
    void DFS(TreeNode* root, int level, vector<vector<int>> &XXX){
        if(XXX.size() <= level){
            vector<int> temp;
            XXX.push_back(temp);
        }
        XXX[level].push_back(root->val);
        if(root->left)
            DFS(root->left, level+1, XXX);
        if(root->right)
            DFS(root->right, level+1, XXX);
    }
};

