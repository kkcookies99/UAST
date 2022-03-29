 #include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    double XXX(vector<int>& nums1, vector<int>& nums2) {
        int len1 = nums1.size() , len2 = nums2.size();
        int index1 = 0 , index2 = 0 , last_index = 0 ;
        while( (double)(index1 + index2) < (len1 + len2)/2.0 ){
            compareNumber( nums1,nums2,index1,index2,last_index);
        }
        int number = 0;
        addNumber(nums1,nums2,index1,index2,last_index,number);
        if( (len1+ len2 ) % 2 == 0 ){
            compareNumber(nums1,nums2,index1,index2,last_index);
            addNumber(nums1,nums2,index1,index2,last_index,number);
            return number/2.0;
        }
        return number;
    }
    void compareNumber(vector<int> & nums1 , vector<int> & nums2 , int & index1 ,int & index2 ,int & last_index){
        if( index1 >= nums1.size() ){
            index2 ++ ;
            last_index = 2 ;
            return ;
        }
        if( index2 >= nums2.size() ){
            index1 ++ ;
            last_index = 1;
            return ;
        }
        if( nums1[index1] <= nums2[index2]  ){
            index1 ++ ;
            last_index = 1 ;
        }else{
            index2 ++ ;
            last_index = 2 ;
        }
    }
    void addNumber(vector<int> & nums1 , vector<int> & nums2 , int  index1 ,int  index2 ,int & last_index,int & number){
        switch (last_index)
        {
        case 0:
            number = 0;
            break;
        case 1 : 
            number += nums1[index1-1];
            break;
        case 2:
            number += nums2[index2-1];
        default:
            break;
        }
    }
};
int main(){
    Solution a ;
    {
        vector<int> v1 = {1,3} ,v2={2};
        cout << a.XXX(v1,v2)<<endl;
    }
    {
        vector<int> v1 = {1,2} ,v2={3,4};
        cout << a.XXX(v1,v2)<<endl;
    }
    {
        vector<int> v1 = {0,0} ,v2={0,0};
        cout << a.XXX(v1,v2)<<endl;
    }
    {
        vector<int> v1 = { } ,v2={1};
        cout << a.XXX(v1,v2)<<endl;
    }
    {
        vector<int> v1 = { 2 } ,v2={ };
        cout << a.XXX(v1,v2)<<endl;
    }
    return 0;
}

