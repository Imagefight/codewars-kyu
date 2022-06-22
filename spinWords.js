function spinWords(string)
{
  // break the sentence into words
  let wrds = string.split(" ");
  // Reserve a string for the new sentence
  let nString;
  // reserve an array for the new words
  rev=[];
  
  wrds.forEach(element =>{
      // Check if the element's length is greater than or equal to 5
      switch(element.length >= 5)
      {
          // flip the string for 5+ character strings
          case (true):
            rev.push(element.split("").reverse().join(""));
            break;
          
          //Don't do anything if not greater than 5
          default:
            rev.push(element);
            break;
      }
      // return the new array
      return rev;
  });
  
  //Reconstruct the Sentence;
  nString = rev.join(" ");
  
  // Return the sentence
  return nString;
}
