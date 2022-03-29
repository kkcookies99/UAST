 class Solution {
public:

    bool XXX(TreeNode* p, TreeNode* q) {
        if (p == NULL && q == NULL) return true;
        if (p == NULL || q == NULL) return false;
        queue<TreeNode*> que;
        que.push(p);   //  添加根节点p
        que.push(q);  //  添加根节点q
        while (!que.empty()) {  //
            TreeNode* leftNode = que.front(); que.pop();
            TreeNode* rightNode = que.front(); que.pop();
            if (!leftNode && !rightNode) {  // 若p的节点与q的节点都为空
                continue;
            }
            // 若p的节点与q的节点有一个为空或p的节点的值与q节点不同
            if ((!leftNode || !rightNode || (leftNode->val != rightNode->val))) {
                return false;
            }
            que.push(leftNode->left);   // 添加p节点的左子树节点
            que.push(rightNode->left); // 添加q节点的左子树节点
            que.push(leftNode->right);  // 添加p节点的右子树节点
            que.push(rightNode->right);  // 添加q节点的右子树节点
        }
        return true;
    }
};

