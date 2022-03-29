class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> tree;
        vector<vector<int>> traverse;
        if(root == NULL){
            return traverse;
        }
        tree.push(root);
        int count = 1;
        while(!tree.empty()){
            vector<int> level;
            int tmp = 0;
            while(count--){
                TreeNode* p = tree.front();
                tree.pop();
                if(p->left){
                    ++tmp;
                    tree.push(p->left);
                }
                if(p->right){
                    ++tmp;
                    tree.push(p->right);
                }
                level.push_back(p->val);
            }
            count = tmp;
            traverse.push_back(level);
            
        }

        return traverse;
    }
};

