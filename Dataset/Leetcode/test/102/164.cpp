class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<int> tmp;
        vector<vector<int>> ans;
        if(root == NULL) return ans;
        int size[792] = {0};
        size[0] = 1;
        int i = 0;
        int flag = 0;
        queue<TreeNode*> q;
        q.push(root);
        tmp.push_back(root->val);
        ans.push_back(tmp);
        tmp.clear();
        while(1){
            TreeNode* node = q.front();
            if(node->left){
                q.push(node->left);
                tmp.push_back(node->left->val);
                size[i+1]++;
            }
            if(node->right){
                q.push(node->right);
                tmp.push_back(node->right->val);
                size[i+1]++;
            }
            q.pop();
            flag++;
            if(q.empty()) break; 
            if(flag == size[i]){
                ans.push_back(tmp);
                tmp.clear();
                i++;
                flag = 0;
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


