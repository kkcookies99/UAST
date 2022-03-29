 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) { 
         auto fast=head; 
         auto slow=head;
            int flag=n;
         int count=0;
         while(fast->next){//fast到达最后一个结点截至
             ++count;
           if(count>flag ){
               slow=slow->next;
           }
           fast=fast->next;  
         }
         ++count;//用来记录链表长度
         if(count==n){//要求删除第一个元素的话
              return head->next;
         }
         if(n==1){//要求删除最后一个元素的话，
             slow->next=nullptr;
         }
         else{
           slow->next=slow->next->next;
         } 
         return head; 
    }
};

