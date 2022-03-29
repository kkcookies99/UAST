class Solution {
public:
    ListNode* XXX(ListNode* head) 
    {
        if(head==0)
        {
            return head;
        }
        Recursion(head);
        return head;
    }

    void Recursion(ListNode* head)
    {
        if(head->next==0)
        {
            return;
        }
        ListNode* Next=head->next;
        if(head->val==Next->val)
        {
            head->next=Next->next;
            Recursion(head);
        }
        else
        {
            Recursion(head->next);
        }

    }
};

