 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *d=new ListNode(0);
        ListNode *pre=d,*cur=head;
        pre->next=head;
        while(cur->next){
            cur=cur->next;
            n--;
            if(n<=0){
                pre=pre->next;
            }
        };
        pre->next=pre->next->next;
        return d->next;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

