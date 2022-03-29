 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* ptr1 = head, *ptr2 = nullptr, *ptr3 = nullptr;
        while(ptr1){
            ptr1 = ptr1->next;
            ptr2 = ptr2?ptr2->next:nullptr;
            ptr3 = ptr3?ptr3->next:nullptr;

            if (n == 0 && !ptr2){
                ptr2 = head;
            }
            if (n-- == 1 && !ptr3){
                ptr3 = head;
            }
        }
        if (!ptr3){
            return nullptr;
        }else if (ptr3 == head){
            head = ptr3->next;
            delete ptr3;
        }else{
            ptr2->next = ptr3->next;
            delete ptr3;
        }
        return head;

    }
};

