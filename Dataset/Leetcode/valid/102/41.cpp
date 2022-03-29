class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<TreeNode *>> node({vector<TreeNode *>({root})});
        vector<vector<int>> ret;

        for (int i = 0; i < node.size(); i++)
        {
            for (const auto ptr : node[i])
            {
                if (ptr == nullptr)
                    continue; // 跳过空节点

                if (ret.size() == i) // 遍历每层的第一个值
                    ret.push_back(vector<int>({ptr->val})); // 创建一个vector<int>，包含一个值，即ptr->val
                else
                    ret[i].push_back(ptr->val); // 将值插入到该vector<int>尾部

                if (node.size() == i + 1) // 遍历第一个节点
                    node.push_back({ptr->left, ptr->right}); // 创建一个新的vector<TreeNode *>，将左右孩子放入该vector<TreeNode *>
                else
                {
                    node[i + 1].push_back(ptr->left); // 已经存在vector<TreeNode *>，则将值插入
                    node[i + 1].push_back(ptr->right);
                }
                    
            }
        }
        
        return ret; // 返回结果
    }
};

