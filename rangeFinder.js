function solution(list) {
    let size = list.length;
    let box = [];
    var i, j;
   
    for (i = 0; i < size; i = j + 1) {
      box.push(list[i]);
      
      /* for 
       * Declare Variable "j" as equal to (i+1)
       * j is less than the size of the array
       * and index j is equal to the previous element plus one
       * increment j
       */
      
      for (var j = i + 1; j < size && list[j] == list[j-1] + 1; j++);
      j--;
      
      // If the lower range is equal to the upper range
      if (i == j) {
        box.push(",");
      // if the upper range is just one number over the lower range,
      // put the numbers indvidually.
      } else if (i + 1 == j) {
        box.push(",", list[j], ",");
      // If the upper two conditions are not met, submit them as a range
      } else { 
        box.push("-", list[j], ",");
      }
    }
    // Remove the leftover empty element in the array
    box.pop();
    // Concat the Array into a singular string, return
    return box.join("");
}
