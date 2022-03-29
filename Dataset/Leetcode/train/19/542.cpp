 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* p=head;
        int s=0;
        while(p){
            p=p->next;
            s++;
        }
        int de=s-n+1;
        int i=1;
        ListNode *cur=new ListNode(0);
        ListNode *pp=cur;
        for(int j=1;j<de;j++){
            cur->next=head;
            head=head->next;
            cur=cur->next;
        }
        cur->next=head->next;
        return pp->next;
    }
};

