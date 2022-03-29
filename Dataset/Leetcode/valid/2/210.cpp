class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int c=0;
        ListNode *l=new ListNode(-1),*r=l;
        while(l1&&l2){
            r->next=new ListNode((l1->val+l2->val+c)%10);
            c=(l1->val+l2->val+c)/10;
            r=r->next;l1=l1->next;l2=l2->next;
        }
        while(l1){
            r->next=new ListNode((l1->val+c)%10);
            c=(l1->val+c)/10;
            r=r->next;l1=l1->next;
        }
        while(l2){
            r->next=new ListNode((l2->val+c)%10);
            c=(l2->val+c)/10;
            r=r->next;l2=l2->next;
        }
        if(c) r->next=new ListNode(c);
        return l->next;
    }
};

