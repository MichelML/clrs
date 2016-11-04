"use strict";
/**
 * Sorting problem:
 *
 * Input: A sequence of n numbers {a1, a2, ... , an }
 *
 * Output: A permutation (reordering) {a1', a2', ... , an' } 
 **/
function bubbleSort(arr) {

    let i = 0,
        arrLastIndex = arr.length -1,
        j,
        temp;

    for (; i < arrLastIndex; i++) {
        
        j = arrLastIndex;

        for (; j > 0; j--) {
            
            if (arr[j] < arr[j-1]) {
            
                temp = arr.slice(j,j+1)[0];
                arr[j] = arr[j-1];
                arr[j-1] = temp; 
            
            }
        
        }

    }

    return arr;

}

console.log(bubbleSort(generateArr(1,100)));
console.log(bubbleSort(generateArr(5,100)));
console.log(bubbleSort(generateArr(5,100)));
console.log(bubbleSort(generateArr(100,-1000)));
console.log(bubbleSort(generateArr(1001,100)));
console.log(bubbleSort(generateArr(105,100000)));
console.log(bubbleSort(generateArr(10000,100000000)));
console.log(bubbleSort(generateArr(10000,100000000, true)));


function generateArr(length, range, withdecimals) {
    var arr = [];

    while(arr.length < length) {

        var randomnumber = Math.ceil(Math.random()*range) + ((withdecimals) ? Math.random() : 0);
        arr[arr.length] = randomnumber;

    }

    return arr;

} 
