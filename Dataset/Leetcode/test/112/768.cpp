 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        // 就是之前寻找从根到叶子结点所有路径的题目
        // 现在转为求和，看是不是目标值

        stack<TreeNode*> nodes;
        stack<int> nodes_sum;
        TreeNode* cur;
        int cur_sum;
        if(root == NULL){
            return false;
        }
        nodes.push(root);
        nodes_sum.push(root->val);
        while(!nodes.empty()){
            cur = nodes.top();
            cur_sum = nodes_sum.top();
            // cout << cur -> val << endl;
            nodes.pop();
            nodes_sum.pop();
            if(cur->left == NULL && cur->right == NULL){
                if(cur_sum == sum){
                    return true;
                }
            }
            if(cur->right){
                nodes.push(cur->right);
                nodes_sum.push(cur_sum + cur->right->val);
            }
            if(cur->left){
                nodes.push(cur->left);
                nodes_sum.push(cur_sum + cur->left->val);// 之前的值加上自己的值
            }
        }
        return false;
    }
};

