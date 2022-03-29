#include<iostream>
#include<stdlib.h>
using namespace std;

struct ListNode{
	int data;
	ListNode *next;
};

int carry = 0;//是否进位； 
ListNode* l3 = new ListNode;
ListNode* p = l3;
ListNode *ifL1; 
ListNode *ifL2; 
ListNode *result;

ListNode* XXX(ListNode* l1, ListNode* l2) {
	while(l1&&l2){
		if(carry){
			p->data = (l1->data + l2->data)%10;
			//判断是否下次相加需要进位 
			if((l1->data + l2->data)>9){
				carry = 1;
			}else{
				carry = 0;
			}
			//取l1前一个ListNode； 
			ifL1 = l1;
			//取l2前一个ListNode； 
			ifL2 = l2;
			l1 = l1->next;
			l2 = l2->next;
			p->next = new ListNode();
			p = p->next;
		}else{
			p->data = (l1->data + l2->data)%10;
			//判断是否下次相加需要进位 
			if((l1->data + l2->data)>9){
				carry = 1;
			}else{
				carry = 0;
			}
			//取l1前一个ListNode； 
			ifL1 = l1;
			//取l2前一个ListNode； 
			ifL2 = l2;			
			l1 = l1->next;
			l2 = l2->next;
			p->next = new ListNode();
			p = p->next;			
		} 
	}
	while(l1&&!l2){
		p->data = l1->data;
		l1 = l1->next;
		p->next = new ListNode();
		p = p->next;
	}
	while(l2&&!l1){
		p->data = l2->data;
		l2 = l2->next;
		p->next = new ListNode();
		p = p->next;
	}
	
	if(ifL1->data!=0&&ifL2->data!=0){
		return l3;
	} else{
		return 0;
	}
}

int main(){
	ListNode* l1 = new ListNode;
	ListNode* l2 = new ListNode;
	ListNode *x;
	ListNode *y;
	int i=0,j=0;
	cout<<"逆序输入第一个数，个位输入，输入99表示输入完毕；"<<endl;
	while(i<=9){
		cin>>i;
		x = l1;
		x->data = i;
		x->next = new ListNode();
		x = x->next;
	}
	cout<<"逆序输入第二个数，个位输入，输入99表示输入完毕；"<<endl;
	while(j<=9){
		cin>>j;
		y = l1;
		y->data = i;
		y->next = new ListNode();
		y = y->next;
	}
	result = XXX(l1,l2);
	cout<<"结果为"<<endl;
	while(result->next){
		cout<<result->data;
		result = result->next;
	}
}



