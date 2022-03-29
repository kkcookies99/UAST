 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode*dummy=new ListNode(0);
        dummy->next=head;//哑节点是关键，可以排除绝大多数因为头节点而出现的问题
        ListNode*fast=dummy,*slow=dummy;
        for(int i=0;i<=n;++i)
        fast=fast->next;
        while(fast)
        {
            fast=fast->next;
            slow=slow->next;
        }
        slow->next=slow->next->next;
        return dummy->next;
    }
};

