 var XXX = function(x) {
    const is_minus = x <= 0
    const abs = Math.abs(x) + ''
    const str = abs.split('').XXX().join('')
    const result = parseInt((is_minus ? '-' : '') + str, 10)

    if ( result < Math.pow(-2,31) || result > (Math.pow(2,31) - 1) ) {
        return 0
    }
    return result
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


