class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> vec_ret;
        if (root == NULL) return vec_ret;
        vector<vector<TreeNode*>> vec_TreeNode;
        vec_TreeNode.resize(2);
        int index = 0;
        vec_TreeNode[index].push_back(root);
        do
        {
            vector<int> vec_ret_tmp;
            int size = vec_TreeNode[index].size();
            for (int i=0; i<size; i++)
            {
                vec_ret_tmp.push_back(vec_TreeNode[index][i]->val);
                if (vec_TreeNode[index][i]->left != NULL)
                    vec_TreeNode[1-index].push_back(vec_TreeNode[index][i]->left);
                if (vec_TreeNode[index][i]->right != NULL)
                    vec_TreeNode[1-index].push_back(vec_TreeNode[index][i]->right);
            }
            vec_ret.push_back(vec_ret_tmp);
            vec_TreeNode[index].clear();
            index = 1-index;
        } while(vec_TreeNode[index].size() != 0);

        return vec_ret;
    }
};

