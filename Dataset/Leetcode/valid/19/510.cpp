 class Solution {
public:
    //q用于指示要删除的元素的前面一个元素；p用来遍历
    //方法上来说应该属于快慢指针。
    ListNode* XXX(ListNode* head, int n) {
        ListNode *p = head;
        ListNode *q = head;
        int i;

        for(i = 0;p->next;i++){
            if(i < n){
                p = p -> next;
                continue;
            }
            p = p -> next;
            q = q -> next; 
        }

        if(i == n - 1){
            return head -> next;
        }

        ListNode * temp = q -> next;
        q -> next = q -> next -> next;
        //free(temp);   //很神奇这里竟然不可以free。
        p = q = temp = nullptr;
        return head;
    }
};

