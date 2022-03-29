class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {//用队列的大小标记每一层大小
        vector<vector<int>> records;
        if(!root) return records;
        vector<int> record;
        queue<TreeNode*> s;
        s.push(root);
        while(!s.empty()){
            int size=s.size();//记录了每一层的节点数目
            for(int i=0;i<size;++i){
                TreeNode* temp=s.front();
                s.pop();
                record.push_back(temp->val);
                if(temp->left) s.push(temp->left);
                if(temp->right) s.push(temp->right);
            }
            records.push_back(record);
            record.clear();
        }
        return records;
    }
};

