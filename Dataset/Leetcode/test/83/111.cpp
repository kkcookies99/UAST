class Solution {
public:
    ListNode* XXX(ListNode* head) 
    {
        ListNode*node=head;
        if(head==NULL || head->next==NULL)
            return head;
        while(node->next)
        {
            if(node->next->val==node->val)
            {
                node->next=node->next->next;
                continue;
            }
            node=node->next;
        }
        return head;
    }
};

