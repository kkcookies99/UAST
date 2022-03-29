 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<int>             level_ret;
        vector<vector<int>>     ret;
        queue<TreeNode*>        queue;
        TreeNode*               node;
        int                     level_len;

        queue.push(root);
        while (!queue.empty())
        {
            level_len = queue.size();
            for (int i=0; i<level_len; i++)
            {
                //for循环只轮训level_len，都是当前层级的节点
                //出队，处理
                node = queue.front();
                queue.pop();
                if (NULL == node)
                    continue;
                level_ret.push_back(node->val);
                
                //这里加入的节点不在当前for循环的level_len范围内
                queue.push(node->left);
                queue.push(node->right);
            }

            //当前层级处理完成，加入ret，清空level_ret
            if (!level_ret.empty())
            {
                ret.push_back(level_ret);
                level_ret.clear();
            }
        }

        return ret;
    }

};

