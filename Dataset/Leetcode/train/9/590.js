 var XXX = function(x) {
    if(x<0){
        return false
    }
    let s=(x+'');
    let n=s.length
    let mid=Math.floor((0+n-1)/2);
    let i=0;
    let j=0;
    if(n%2!=0){
        i=mid-1;
        j=mid+1;
    }else{
        i=mid;
        j=mid+1
    }
    while(i>=0&&j<n){
        if(s[i]!=s[j]){
            return false;
        }
        i--;
        j++;
    }
    return true
};```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


