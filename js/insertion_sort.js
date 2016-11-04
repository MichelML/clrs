"use strict";
/**
 * Sorting problem:
 *
 * Input: A sequence of n numbers {a1, a2, ... , an }
 *
 * Output: A permutation (reordering) {a1', a2', ... , an' } 
 **/

const insertionSort = (array) => {

    let startIndex = 1;
    let valueAtStartIndex;
    let indexOfValueToInsert;

    for (; startIndex < array.length; startIndex++) {

        valueAtStartIndex = array[startIndex];
        indexOfValueToInsert = startIndex - 1;

        while (indexOfValueToInsert > -1 && array[indexOfValueToInsert] > valueAtStartIndex) {

            array[indexOfValueToInsert + 1] = array[indexOfValueToInsert];
            indexOfValueToInsert--;

        }

        array[indexOfValueToInsert + 1] = valueAtStartIndex;

    }

    return array;

};

console.log(insertionSort(generateArr(1, 100)));
console.log(insertionSort(generateArr(100, -1000)));
console.log(insertionSort(generateArr(1001, 100)));
console.log(insertionSort(generateArr(105, 100000)));
console.log(insertionSort(generateArr(10000, 100000000)));
console.log(insertionSort(generateArr(10000, 100000000, true)));

function generateArr(length, range, withdecimals) {
    let arr = [];

    while (arr.length < length) {

        let randomnumber = Math.ceil(Math.random() * range) + ((withdecimals) ? Math.random() : 0);
        arr[arr.length] = randomnumber;

    }

    return arr;

}

