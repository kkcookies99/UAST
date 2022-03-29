 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode* pre = head;
        ListNode* post = dummy;
        int temp = n;
        int size = 0;
        while(pre){
            pre = pre->next;
            size++;
            if(n > 0){
                n--;
            }else{
                post = post->next;
            }
        }
        if(size == temp){
            delete dummy;
            return head->next;
        }
        post->next = post->next->next;
        return head;
    }
};

