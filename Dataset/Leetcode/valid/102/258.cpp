class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        queue<TreeNode*> table;
        queue<int> floor;
        vector<vector<int>> res;
        if(!root) return res;
        table.push(root);
        floor.push(0);
        while(!table.empty()){
            TreeNode* node = table.front();
            if(res.size()>floor.front()){
                res[floor.front()].push_back(node->val);
            }else{
                res.push_back({node->val});
            }
            table.pop();
            int num = floor.front();
            floor.pop();
            if(node->left){
                table.push(node->left);
                floor.push(num+1);
            }
            if(node->right){
                table.push(node->right);
                floor.push(num+1);
            }
        }
        return res;
    }
};

