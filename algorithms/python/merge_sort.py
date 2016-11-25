import random as random

def mergeSort(arr):
  if len(arr) < 2:
    return arr
  
  middle = int(len(arr)/2)
  left = arr[:middle]
  right = arr[middle+1:]

  return merge(mergeSort(left), mergeSort(right))

def merge(left, right):
  result = []
  
  while len(left) > 0 and len(right) > 0:
    if left[0] <= right[0]:
      result.append(left.pop(0))
    else:
      result.append(right.pop(0))

  while len(left) > 0:
    result.append(left.pop(0))

  while len(right) > 0:
    result.append(right.pop(0))
  
  return result
      


def generateArr(length, rg, withdecimals):

    arr = []
    randomNumber = None

    while len(arr) < length:
        if withdecimals:
            randomNumber = random.randrange(rg)
        elif rg > 0:
           randomNumber = random.randint(0,rg)
        else:
           randomNumber = random.randint(rg,0)
        arr.append(randomNumber)
    return arr

print(mergeSort(generateArr(1, 100, False)));
print(mergeSort(generateArr(5, 100, False)));
print(mergeSort(generateArr(5, 100, False)));
print(mergeSort(generateArr(100, -1000, False)));
print(mergeSort(generateArr(1001, 100, False)));
print(mergeSort(generateArr(105, 100000, False)));
