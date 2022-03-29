 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* l3=new ListNode;
        ListNode* h=l3;
        int c=0;
        while(l1&&l2){
            int val=l1->val+l2->val+c;
            c=val/10;
            val%=10;
            ListNode* tmp=new ListNode(val);
            tmp->next=nullptr;
            l3->next=tmp;
            l3=l3->next;
            l1=l1->next;
            l2=l2->next;
        }
        while(l1){
            int val=l1->val+c;
            c=val/10;
            val%=10;
            ListNode* tmp=new ListNode(val);
            tmp->next=nullptr;
            l3->next=tmp;
            l3=l3->next;
            l1=l1->next;
        }
        
        while(l2){
           int val=l2->val+c;
            c=val/10;
            val%=10;
            ListNode* tmp=new ListNode(val);
            tmp->next=nullptr;
            l3->next=tmp;
            l3=l3->next;
            l2=l2->next;
        }
        if(c){
            ListNode* tmp=new ListNode(c);
            tmp->next=nullptr;
            l3->next=tmp;
            l3=l3->next;
        }
        h=h->next;
        return h;
    }
};

