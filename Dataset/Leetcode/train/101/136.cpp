 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root != nullptr)
        {
            vector<int> a = GetData(root->left,0);
            vector<int> b = GetData(root->right,1);
            if(a == b)
            return true;
        }
        return false;

    }

    vector<int> GetData(TreeNode * root,int flag)
    {
        vector<int> result;
        queue<TreeNode * > Nodes;
        if(root != nullptr)
        Nodes.push(root);
        while(Nodes.size() != 0)
        {
            TreeNode * temp = Nodes.front();
            if (temp != nullptr)
            result.push_back(temp->val);
            else
            result.push_back(-1);

            if(temp != nullptr)
            {
                if(flag == 1)
                {
                    Nodes.push(temp->left);
                    Nodes.push(temp->right);
                }
                else
                {
                    Nodes.push(temp->right);
                    Nodes.push(temp->left);
                }
            }
            Nodes.pop();

        }
        return result;
    }
};

