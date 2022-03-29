 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr||head->next==nullptr) return head;
        ListNode* node=head;
        while(node->next)
        {
            if(node->next->val==node->val)
                node->next=node->next->next;
            else
                node=node->next;
        }
        return head;
    }
};

