;;Sorting problem:
;;
;;Input: A sequence of n numbers {a1,   a2,   ... ,   an }
;;
;;Output: A permutation (reordering) {a1',   a2',   ... ,   an' } 
(declare reverseValue reverseValueFinal insertionSort)

(defn reverseValue [indexOfValueToInsert originalArray] 
  (assoc originalArray (+ indexOfValueToInsert 1) (get originalArray indexOfValueToInsert)))

(defn reverseValueFinal [valueAtStartIndex indexOfValueToInsert originalArray startIndex] 
  (let [newArray (assoc originalArray (+ indexOfValueToInsert 1) valueAtStartIndex)] 
  (if (< startIndex (count originalArray)) 
      (insertionSort (get newArray startIndex) (- startIndex 1) newArray startIndex)
      newArray)))

(defn insertionSort [valueAtStartIndex indexOfValueToInsert originalArray startIndex] 
  (if (and (> indexOfValueToInsert -1) (> (get originalArray indexOfValueToInsert) valueAtStartIndex)) 
    (insertionSort valueAtStartIndex (dec indexOfValueToInsert) (reverseValue indexOfValueToInsert originalArray) startIndex) 
    (reverseValueFinal valueAtStartIndex indexOfValueToInsert originalArray (+ startIndex 1))))

(def testVector [5 4 3 2 1])
(println (insertionSort (get testVector 1) 0 testVector 1))
(def testVector2 [1 2])
(println (insertionSort (get testVector2 1) 0 testVector2 1))
(def testVector3 [45 90 100 1 2 3 4 89 87 87 87 87 87 87 87 87 87])
(println (insertionSort (get testVector3 1) 0 testVector3 1))
(def testVector4 [46.80673096334078, 6.637110066809218, 17.576584108900967, 77.05076123697624, 48.985341379274374, 40.627482121225825, 40.24145597189995, 97.04175039388087, 9.87490116711894, 50.9339637268638, 47.181709099987984, 58.98480323976962, 10.560223620602454, 23.155260983934944, 61.626416480429484, 88.0305629035524, 51.1988425558175, 79.8846547935273, 34.42363131328026, 34.596461884977366, 50.83233202618189, 100.77076558365205, 34.177902432065274, 85.59772371147314, 13.468215117588796, 51.869050285327376, 39.80438646952572, 29.39657271954897, 61.0423691638007, 37.51568219574953, 60.82661571888126, 70.6341154293446, 90.45946749169663, 12.591403122952926, 37.495126578028014, 82.91681391363885, 80.89957547367233, 16.5692041908805, 56.47055488877222, 6.8219510510401316, 28.40543473701005, 22.24424030502224, 38.321009073516485])
(println (insertionSort (get testVector4 1) 0 testVector4 1))
