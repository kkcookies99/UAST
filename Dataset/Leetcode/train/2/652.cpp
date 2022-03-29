 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode *root = new ListNode(0);
        ListNode *p = root;
        
        int jinwei = 0;
        while (l1 || l2 || jinwei != 0) {
            int l1Val = l1 ? l1->val : 0;
            int l2Val = l2 ? l2->val : 0;
            
            int sum = l1Val + l2Val + jinwei;
            jinwei  = sum / 10;
            ListNode *node = new ListNode(sum % 10);
            p->next = node;
            p= p->next;
            
            if(l1) l1 = l1->next;
            if(l2) l2 = l2->next;
        }
        return root->next;
    }
};

