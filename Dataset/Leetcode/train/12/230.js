 var XXX = function(num) {
    const arrRoman = [['','I','II','III','IV','V','VI','VII','VIII','IX'],
                      ['','X','XX','XXX','XL','L','LX','LXX','LXXX','XC'],
                      ['','C','CC','CCC','CD','D','DC','DCC','DCCC','CM']];

    const covertRoman = [];
    const arrNum = [...num.toString()].reverse();   // 36 → '36' → ['6','3']

    for(let i = 0; i < arrNum.length; i++){
        let val = arrNum[i];
        if(i >= 3){    
            let times = Number(arrNum.slice(3).reverse().join(''));
            console.log(times);
            covertRoman.unshift('M'.repeat(times));
            break;
        }else{
            covertRoman.unshift(arrRoman[i][val]);
        }
    }
    return covertRoman.join('');
};

