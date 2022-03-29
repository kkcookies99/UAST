 var XXX = function(s) {
let s_trim = s.trim();
let value = parseInt(s_trim)
!value?value=0:null;
if(value>2**31-1){
    return 2**31-1
}else if(value<-(2**31)){
    return -(2**31)
}else
    return value
};

