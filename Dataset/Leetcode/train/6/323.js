 var XXX = function(s, numRows) {
    if(numRows==1||s=="")
    return s;
var arr=new Array(numRows).fill('');
var con=numRows*2-2;
var ss=s.split("");
for(var i=0;i<ss.length;i++)
{
    let a=i%con;
    if(a<numRows)
    {
    arr[a]+=ss[i];
    }
    else
    {
        
    let b=a%(numRows-1);
    arr[numRows-1-b]+=ss[i];
    }
}
    var ans=arr.join('');
    return ans;

};

