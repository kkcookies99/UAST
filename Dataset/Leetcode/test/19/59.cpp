 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if(rnum(head,n)==n){
            ListNode* temp=head->next;
            delete head;
            head=temp;
        }
        return head;
    }
    int rnum(ListNode* l, int n){
        int rn;//当前节点是倒数第几个
        if(l->next==nullptr)rn=1;
        else rn=rnum(l->next,n)+1;
        if(rn==n+1){//如果本节点是要删除的前一个节点
            ListNode* temp=l->next->next;
            delete l->next;
            l->next=temp;
        }
        return rn;
    }
};

