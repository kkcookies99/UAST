class Solution {
public:
    int XXX(TreeNode* root) {
        if (root == nullptr){
            return 0;
        }

        queue<pair<TreeNode *, int>> myQueue;
        myQueue.push(make_pair(root, 1));
        while (!myQueue.empty()){
            pair<TreeNode*, int> node = myQueue.front();
            if (node.first->left == nullptr && node.first->right == nullptr){
                return node.second;
            }
            if (node.first->left != nullptr){
                myQueue.push(make_pair(node.first->left, node.second + 1));
            }
            if (node.first->right != nullptr){
                myQueue.push(make_pair(node.first->right, node.second + 1));
            }
            myQueue.pop();
        }

        return 0;
    }
};

