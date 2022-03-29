class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {//用空指针来标记每一层的结束
        vector<vector<int>> records;
        if(!root) return records;
        vector<int> record;
        queue<TreeNode*> s;
        s.push(root);
        s.push(nullptr);
        while(!s.empty()){
            TreeNode* temp=s.front();
            s.pop();
            if(temp==nullptr) {
                if(!s.empty()) s.push(nullptr);
                records.push_back(record);
                record.clear();
                continue;
            }
            record.push_back(temp->val);
            if(temp->left) s.push(temp->left);
            if(temp->right) s.push(temp->right);
        }
        return records;
    }
};

