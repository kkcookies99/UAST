 class Solution {
public:
    void tranverse(TreeNode* node, vector<int>& con) {
        if (!node) {
            con.push_back(-1);
            return;
        }
        con.push_back(node->val);
        tranverse(node->left, con);
        tranverse(node->right, con);
    }
    bool XXX(TreeNode* p, TreeNode* q) {
        vector<int> containerP, containerQ;
        tranverse(p, containerP);
        tranverse(q, containerQ);
        if (containerP == containerQ) {
            return true;
        }
        return false;
    }
};

