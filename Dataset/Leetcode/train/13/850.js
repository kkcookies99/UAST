 var XXX = function(s) {
    let uquieSum=0
    let sum=0
let obj={
    'IV':4,
    'IX':9,
    'XL':40,
    'XC':90,
    'CD':400,
    'CM':900,
    'I':1,
    'V':5,
    'X':10,
    'L':50,
    'C':100,
    'D':500,
    'M':1000
}
for(let i=0;i<s.length;i++){
    if(i<s.length){
    if(obj.hasOwnProperty(s[i]+s[i+1])){
        uquieSum+=obj[s[i]+s[i+1]]
        i=i+1
    }else{
        sum+=obj[s[i]]
    }
    }

}
return sum+uquieSum

};

