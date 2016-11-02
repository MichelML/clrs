;;Sorting problem:
;;
;;Input: A sequence of n numbers {a1, a2, ... , an }
;;
;;Output: A permutation (reordering) {a1', a2', ... , an' } 

;;we need a function to push the current value at the right index

;;we need a function that gets the value in the array to repush at the right index

;; we need a function that determines what is the right index of a value

;; NOT COMPLETED
"(defn insertion_sort [array] 
  ((def arr array)
  (def i 0)
  (def j 1)
  (for [value (rest array)] 
    ((alter-var-root #'j ((constantly (+ j 1))))
    (alter-var-root #'i ((constantly (- j 1))))
    (while (and (> i 0) (> (get array i))) 
      (alter-var-root #'arr ((constantly (assoc arr (+ i 1) (get array i)))))
      (alter-var-root #'i ((constantly (- i 1)))))
    (alter-var-root #'arr ((constantly ((assoc arr (+ i 1) value)))))))
   (print arr)))

(insertion_sort (vector 5 4 3 2 1))"
