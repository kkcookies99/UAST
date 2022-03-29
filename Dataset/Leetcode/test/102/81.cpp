class Solution {
public:

   // 我的方法，递归，但是重点需要知道二叉树的层数，做出来了，空间浪费比较大
    // int recurtion(TreeNode* root,vector<vector<int>> &res,int k){
    //     if(root==nullptr)
    //         return 0; 
    //      res[k].push_back(root->val);
    //      return max(recurtion(root->left,res,k+1),recurtion(root->right,res,k+1)) + 1;
    // }
    // vector<vector<int>> XXX(TreeNode* root) {
    //      vector<vector<int>> res(800);
    //      int temp=recurtion(root,res,0);
    //      res.resize(temp);
    //      return res;
    // }

     // 官方方法  bfs
    vector<vector<int>> XXX(TreeNode* root) {
     vector <vector <int>> ret;
        if (!root) {
            return ret;
        }

        queue <TreeNode*> q;
        q.push(root);
        while (!q.empty()) { // 队列为空说明遍历结束，用栈也可以，都行
            int currentLevelSize = q.size();
            ret.push_back(vector <int> ());
            for (int i = 1; i <= currentLevelSize; ++i) {
                auto node = q.front(); q.pop();
                ret.back().push_back(node->val);
                if (node->left) q.push(node->left);
                if (node->right) q.push(node->right);
            }
        }
        
        return ret;
    }
};

