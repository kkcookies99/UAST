 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL)
            return true;
        else if(p!=NULL&&q==NULL)
            return false;
        else if(p==NULL&&q!=NULL)
            return false;
        queue<TreeNode*> q1,q2;
        TreeNode* node1;
        TreeNode* node2;
        if(p!=NULL&&q!=NULL)
        {
            q1.push(p);
            q2.push(q);
        }

        while(!q1.empty()&&(!q2.empty())){
            node1=q1.front();
            node2=q2.front();
            q1.pop();
            q2.pop();

            if(node1==NULL&&node2==NULL){
                continue;
            }
            else if(node1==NULL&&node2!=NULL)
                return false;
            else if(node2==NULL&&node1!=NULL)
                return false;

            // if(node1==NULL&&node2!=NULL)
            //     return false;
                
            // if(node2==NULL&&node1!=NULL)
            //     return false;

            if(node1->val!=node2->val)
                return false;
            
            if(node1->left!=NULL)
                q1.push(node1->left);
            else
                q1.push(NULL);
            if(node1->right!=NULL)
                q1.push(node1->right);
                            else
                q1.push(NULL);
            if(node2->left!=NULL)
                q2.push(node2->left);
                else
                q2.push(NULL);
            if(node2->right!=NULL)
                q2.push(node2->right);
                else
                q2.push(NULL);
           
        }
        if(q1.empty()&&q2.empty())
            return true;
        else
            return false;
    }
};

