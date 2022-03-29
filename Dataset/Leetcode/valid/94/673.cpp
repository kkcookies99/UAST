 class Solution {
public:
    // 非递归实现
    vector<int > result = {};
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode* > stack_node = {};
        stackLeftNode(root, stack_node);
        while(!stack_node.empty()) {
            TreeNode* node = stack_node.top();
            stack_node.pop();
            result.push_back(node -> val);
            if (node -> right != nullptr) {
                stackLeftNode(node -> right, stack_node);
            }
        }
        return result;
    }

    void stackLeftNode(TreeNode* root, stack<TreeNode* >& stack_node) {
        TreeNode* node = root;
        while(node != nullptr) {
            stack_node.push(node);
            node = node -> left;
        }
    }
};

