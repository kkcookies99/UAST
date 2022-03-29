 class Solution {
public:
    //基础版
    ListNode* XXX(ListNode* head, int n) {
       //确定链表总元素个数
       int all_count=1;
       ListNode* point;
       point=head;
       while(point->next!=NULL){
           all_count++;
           point=point->next;
       }
       point=head;
       int time_count=0;//计算顺序
       if(n==all_count){
           head=head->next;
       }
       else{
       while(time_count<all_count-n-1){
           point=point->next;
           time_count++;
       }
       ListNode* r=point->next;
       point->next=point->next->next;}
       return head;
    }
};

