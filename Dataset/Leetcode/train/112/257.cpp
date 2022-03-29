 class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {

        if (root == nullptr) return false;

        int sum = 0;
        //两个队列
        //一个树指针队列，一个和队列
        queue <TreeNode*> rq;
        queue <int>       tq;

        rq.push(root);
        tq.push(root->val);

        while (!rq.empty()) {
            root = rq.front(); rq.pop();
            sum = tq.front();  tq.pop();

            if (root->left!=nullptr) {
                rq.push(root->left);
                tq.push(sum + (root->left)->val);
            }
            if (root->right!=nullptr) {
                rq.push(root->right);
                tq.push(sum + (root->right)->val);
            }
            if (root->left==nullptr && root->right==nullptr && sum==targetSum) {
                return true;
            }
        }

        return false;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


