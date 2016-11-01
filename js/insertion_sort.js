/**
 * Sorting problem:
 *
 * Input: A sequence of n numbers {a1, a2, ... , an }
 *
 * Output: A permutation (reordering) {a1', a2', ... , an' } 
 **/

function insertionSort(array) {

    var startIndex = 1;
    var valueAtStartIndex;
    var indexOfValueToInsert;

    for (; startIndex < array.length; startIndex++) {

        valueAtStartIndex = array[startIndex];
        indexOfValueToInsert = startIndex - 1;

        while (indexOfValueToInsert > -1 && array[indexOfValueToInsert] > valueAtStartIndex) {

            array[indexOfValueToInsert + 1] = array[indexOfValueToInsert];
            indexOfValueToInsert--;

        }

        array[indexOfValueToInsert + 1] = valueAtStartIndex;

    }

    console.log(array);

}

insertSort([2, 1, 6, 7, 8, 1, 2, 3, 4, 5]);
insertSort([203894750923874098, 23452345234, 90809809809808, 6464646466, 999999,234,23,3,-19819891898, -19]);
insertSort([90,80,70,60,40,20,10]);
insertSort([1000,900,800,400,600,700,200,100,30,50,60,70,801,10000,1,23452345, -34, -1, -1000, -13456345]);
insertSort([-10, 0 , 0 , 0 , 0 , 0 ,0 , -20, -20.1, 10.2, 1000.50, 90.112341234123]);
