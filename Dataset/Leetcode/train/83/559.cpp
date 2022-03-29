 class Solution {
public:
    ListNode* XXX(ListNode* head) {
        int val=-12345;
        ListNode new_head(0);
        ListNode* pre=&new_head;
        pre->next=head;
        while(pre->next)
        {
            while(pre->next&&(val==pre->next->val))//处理连续相同的元素
            {
                pre->next=pre->next->next;
            }
            if(!pre->next) break;//如果遍历到尾 退出循环
            val=pre->next->val;//连接不重复的元素
            pre=pre->next; 
        }
        return new_head.next;
    }
};

