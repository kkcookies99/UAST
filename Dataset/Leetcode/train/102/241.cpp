class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(root == NULL){
            return {};
        }

        queue<TreeNode*> q;
        vector<vector<int>> res;
        vector<int> store;
        TreeNode* temp = NULL;
        TreeNode* next = NULL;
        TreeNode* current = root;
        q.push(root);
        while(q.empty() != true){
            temp = q.front();
            store.emplace_back(temp->val);
            q.pop();
            if(temp->left){
                q.push(temp->left);
                next = temp->left;
            }
            if(temp->right){
                q.push(temp->right);
                next = temp->right;
            }
            if(temp == current){
                res.emplace_back(store);
                store.clear();
                current = next;
            }
        }
        return res;
    }
};

