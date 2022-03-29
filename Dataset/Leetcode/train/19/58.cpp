 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        int s=0;
        ListNode* cur=head,*h=head;
        while(cur!=0x0){
            s++;
            cur=cur->next;
        }
        s-=n;
        cur=0x0;
        while(s!=0){
            cur=h;
            h=h->next;
            s--;
        }
        if(cur==0x0)return head->next;
        cur->next=h->next;
        h->next=0x0;
        return head;
    }
};

