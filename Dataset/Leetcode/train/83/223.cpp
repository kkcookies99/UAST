class Solution {
public:
    ListNode* XXX(ListNode* head) {
        if(head==nullptr) return nullptr;
        ListNode *p=head;
        ListNode *q=head->next;
        while(q)
        {
            if(p->val!=q->val) {//把不等与该指针的数赋值到下一个指针下面
                p=p->next;
                p->val=q->val;
            }
            q=q->next;
        }
        p->next=nullptr;//遍历到最后的指针下一个指向空指针
        return head;


    }
};```

