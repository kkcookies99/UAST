 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        struct ListNode* sumList = new ListNode(NULL);
        struct ListNode* target = sumList;
        int sum,i = 0;
        while(l1 || l2){
            sum = 0;
            if(l1){
                i ? sum = 1,i = 0 : NULL;  //我把NULL当作无操作了
                sum += (l1->val);
                l1 = l1->next;
            }
            if(l2){
                i ? sum = 1,i = 0 : NULL;
                sum += (l2->val);
                l2 = l2->next;
            }
            sum/10>0 ? i = 1,sum %= 10 : NULL;
            struct ListNode* node = new ListNode(sum);
            sumList->next = node;
            sumList = node;
        }
        if(i){
            struct ListNode* node = new ListNode(1);
            sumList->next = node;
        }
        return target->next;
    }
};

