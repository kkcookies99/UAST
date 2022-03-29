class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode head{};
        ListNode* cur=&head;
        int addent=0;
        while(l1 && l2) {
            cur->next=new ListNode((l1->val+l2->val+addent)%10);
            addent=(l1->val+l2->val+addent)/10;
            l1=l1->next; l2=l2->next;
            cur=cur->next;
        }
        while(l1) {
            cur->next=new ListNode((l1->val+addent)%10);
            addent=(l1->val+addent)/10;
            l1=l1->next; cur=cur->next;
        }
        while(l2) {
            cur->next=new ListNode((l2->val+addent)%10);
            addent=(l2->val+addent)/10;
            l2=l2->next; cur=cur->next;
        }
        if(addent) cur->next=new ListNode(addent);
        return head.next;
    }
};

