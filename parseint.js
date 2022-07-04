
function parseInt(string) {
  // TODO: it's your task now
  let sum = 0;
  
  // Make markers for easy multiplication
  string = string.replace(/ hundred /ig,  "*hundred*");
  string = string.replace(/ thousand /ig, "*thousand*");
  string = string.replace(/ million /ig,  "*million*");
  let numberWords = string.split(" ");
  console.log("-------------------")
  console.log(`@@ ${numberWords}`);
    
  numberWords.forEach(word =>{
    if (word.includes("-") && !word.includes("*"))         {sum += readCompNumber(word);}
    else if (word == "ten")                                {sum += 10;}
    else if (word == "and")                                {sum += 0;}
    else if (word.includes("*"))                           {sum += readHighNumbers(word);}
    else if (word.includes("ty") || word.includes("teen") || word.includes("el")) {sum += multipleOfTen(word);}
    else                                                   {sum += searchSingleDigits(word);}
    console.log(`W ${word}`);
    console.log(`S ${sum}`);
  });
  
  return sum;
}

function multipleOfTen(word){
  let trigger = "ty";
  let teenTrigger = "teen";
  if (word.includes(trigger)){
    if (word.includes("twe")) {return 20;}
    if (word.includes("thi")) {return 30;}
    if (word.includes("for")) {return 40;}
    if (word.includes("fif")) {return 50;}
    if (word.includes("six")) {return 60;}
    if (word.includes("sev")) {return 70;}
    if (word.includes("eig")) {return 80;}
    if (word.includes("nin")) {return 90;}
  }
  
  if (word.includes(teenTrigger)){
    if (word.includes("thi")) {return 13;}
    if (word.includes("fou")) {return 14;}
    if (word.includes("fif")) {return 15;}
    if (word.includes("six")) {return 16;}
    if (word.includes("sev")) {return 17;}
    if (word.includes("eig")) {return 18;}
    if (word.includes("nin")) {return 19;}
  }
  
  if (word == "eleven") {return 11;}
  if (word == "twelve") {return 12;}
}

// Build the Single Digits
function searchSingleDigits(word){
  let singleDigits = new Map();
    singleDigits.set("zero", 0);
    singleDigits.set("one",  1);
    singleDigits.set("two",  2);
    singleDigits.set("three",3);
    singleDigits.set("four", 4);
    singleDigits.set("five", 5);
    singleDigits.set("six",  6);
    singleDigits.set("seven",7);
    singleDigits.set("eight",8);
    singleDigits.set("nine", 9);
  
  return singleDigits.get(word);
}

function readCompNumber(comNum){
  console.log(`comNum1 ${comNum}`)
  let nums = comNum.split("-");
  console.log(`comNums3 ${nums}`)
  console.log(`comNumS ${multipleOfTen(nums[0]) + searchSingleDigits(nums[1])}`)
  return multipleOfTen(nums[0]) + searchSingleDigits(nums[1]);
}

function readHighNumbers(highNum){
  console.log("rHN");
  // Define High Numbers
  let sum = 0;
  let lastNumber = 0;
  
  // Make an array of words
  let nums = highNum.split("*");
  let iterator = 0;
  console.log(`!! ${nums}`)
  nums.forEach(num =>{
    if      (num == "ten")       {nums[iterator] = 10;}
    else if (num == "hundred")   {nums[iterator] = 100;}
    else if (num == "thousand")  {nums[iterator] = 1000;}
    else if (num == "million")   {nums[iterator] = 1000000;}
    else if (num.includes("-"))  {nums[iterator] = readCompNumber(nums[iterator]);}
    else if (num == "and")       {nums[iterator] = 0;}
    else    {nums[iterator] = searchSingleDigits(nums[iterator]);}
    console.log(`RHN Num ${num}`)
    iterator++;
  });
  
  iterator = 0;
  console.log(`!${nums}`)
  nums.forEach(num =>{
    if (iterator == 0 || iterator == nums.length - 1) {sum += num;}
    else if (num % 10 == 0 % num !== 10) {
      sum -= nums[iterator - 1];
      sum += nums[iterator - 1] * num;
    } 
    lastNumber = num;
    iterator++;
  });
  return sum;
}
