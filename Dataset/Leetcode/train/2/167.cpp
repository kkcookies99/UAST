/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
private:
    void pushBackNewNode(ListNode** lastptr,int newVal){
            ListNode * newNode=new ListNode();
            newNode->val=newVal;
            (*lastptr)->next=newNode;
            *lastptr=newNode; 
    }
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        //创建要返回的链表
        ListNode * back=new ListNode();
        //两个指针分别指向l1 与 l2 进行遍历
        ListNode *p1=l1,*p2=l2,*pback=back;
        int addFlow=0;
        int addResult=0;
        while(p1&&p2){
            addResult=addFlow+p1->val+p2->val;
            addFlow=addResult/10;
            addResult%=10;
            //将addResult新增一个节点到pback后面
            pushBackNewNode(&pback,addResult);
            p1=p1->next;
            p2=p2->next;
        }
        //判断p1 p2 addFlow 的状态
        //至少一个l1 或 l2 已经遍历完了 
        ListNode* gptr=p1?p1:p2;
        while(gptr){
            addResult=addFlow+gptr->val;
            addFlow=addResult/10;
            addResult%=10;
            //将addResult新增一个节点到pback后面
            pushBackNewNode(&pback,addResult);
            gptr=gptr->next;
        }
        //检测addFLow是否还有预留,有预留则要做最高位
        if(addFlow>0){
            //将addResult新增一个节点到pback后面
            pushBackNewNode(&pback,addFlow);
        }
        return back->next;
    }
};

