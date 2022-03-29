 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) 
    {
        //哑节点dummy
        ListNode* dummy=new ListNode(-1);
        dummy->next=head;
        //快慢指针
        ListNode* fast=dummy;
        ListNode* slow=dummy;
        //fast跑起来 走n步
        while(n--&&fast!=nullptr)
        {
            fast=fast->next;
        }
        //多走一步 n+1步
        fast=fast->next;
        //fast和slow一起走
        while(fast!=nullptr)
        {
            fast=fast->next;
            slow=slow->next;
        }
        slow->next=slow->next->next;
        return dummy->next;
    }
};

