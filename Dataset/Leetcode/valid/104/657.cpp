 class Solution {
public:
    int XXX(TreeNode* root) {
        // if(root == NULL)
        //     return 0;
        // int left = XXX(root->left);
        // int right = XXX(root->right);
        // return left>right?left+1:right+1;
        if(root == NULL)
            return 0;
        int ret = 0;
        queue<TreeNode*> q1;
        q1.push(root);
        while(!q1.empty())
        {
            queue<TreeNode*> q2;
            ret++;
            while(!q1.empty())
            {
                if(q1.front()->left!=NULL)
                    q2.push(q1.front()->left);
                if(q1.front()->right!=NULL)
                    q2.push(q1.front()->right);
                q1.pop();
            }
            q1 = q2;
        }
        return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


