class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode * end = head;
        ListNode * front = nullptr;
        n--;
        
        while(end->next!=nullptr){
            if(n==0){
                front = head;
                n--;
            }
            else if(n==-1){
                front = front->next;
            }
            else{
                n--;
            }
            end = end->next;
        }

        if(front!=nullptr){
            ListNode* next = front->next;
            if(front->next!=nullptr){
                front->next = front->next->next;
                delete next;
            }
            return head;
        }
        // since 1 <= SZ <= list.size(),
        // this case would be delete the front element
        else{
            ListNode* next = head->next;
            delete head;
            return next;
        }
    }
};


