 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        ListNode* dummy=new ListNode(-1),*tmp=head,*last=dummy;
        while(tmp){
            if(last==dummy||tmp->val!=last->val){
                ListNode* node=new ListNode(tmp->val);
                last->next=node;
                last=node;//tmp是原链表进行到的位置，last是新链表中上一个结点
            }
            tmp=tmp->next;
        }
        return dummy->next;
    }
};

