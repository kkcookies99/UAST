 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* temp=head;
        while(temp)
        {
            if(temp->next==NULL)
                break;
            if(temp->val==temp->next->val)
                temp->next=temp->next->next;
            else
                temp=temp->next;
        }
        return head;
    }
};

