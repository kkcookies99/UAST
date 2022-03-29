class Solution {
public:
    ListNode* XXX(ListNode* head) 
    {
        if(head==nullptr)
            return nullptr;
        ListNode Head(0);
        Head.next=head;
        ListNode* slow=&Head;
        ListNode* fast=slow;
        while(slow!=nullptr)
        {
            slow=slow->next;
            fast=slow;
            while(fast!=nullptr && fast->next!=nullptr && fast->next->val==slow->val)//这里必须要判断fast->next是否为空，因为用到了fast->next->val
            {
                fast=fast->next;
                slow->next=fast->next;
                delete fast;//避免内存泄漏
                fast=slow;
            }     
        }
        return Head.next;
    }
};

