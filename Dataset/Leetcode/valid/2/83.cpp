class Solution {
public:
ListNode* XXX(ListNode* l1, ListNode* l2) {
    
    ListNode*pNode1=l1;
    ListNode*pNode2=l2;
    bool over=false;    //这里很关键，双标志位，因为本轮Node->val相加的进位是在下一次用
    int carry=0;        //并且用好以后要给他还原为0  
                        //一开始用了单标记发现无法解决问题，感谢我大佬同学的提醒
    
    ListNode*resHead=new ListNode();
    ListNode*pre=resHead;
    while(pNode1||pNode2||carry)   // 两个链表都空，或者没有进位才结束，然后用if else分为4种情况
    {
        ListNode*Node=new ListNode();   //创新Node用于存放结果
        pre->next=Node;                 
        pre=pre->next;
        
        int x;
        
        if(pNode1&&pNode2){
            x=pNode1->val+pNode2->val+carry; //先计算相加的结果，经过处理再放入 结果Node中
         
            if(x>=10)                       //处理
             {
              x=x%10;;
              over=true;
             }
                if(over) {carry=1;over=false;} //双标志位进位处理
                else carry=0;
            
                pre->val=x;
                pNode1=pNode1->next;
                pNode2=pNode2->next;
        }
        else if(pNode1)
        {
            x=pNode1->val+carry;  
            if(x>=10)
            {
            x=x%10;;
            over=true;
            }
            
            if(over) 
            {carry=1;over=false;}
            else carry=0;
            
            pre->val=x; 
            pNode1=pNode1->next;
             
            
        }
        else if(pNode2)
        {
            x=pNode2->val+carry;  
            
            if(x>=10)
        {
            x=x%10;;
            over=true;
        }
             
            if(over) {carry=1;over=false;}
            else carry=0;
            pre->val=x;
            pNode2=pNode2->next;
        }
        else{
            pre->val=1;break;       
        }
       
        
    }
    return resHead->next;

}
};




