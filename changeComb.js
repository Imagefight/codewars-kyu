function countChange(money, coins) {
  // If the money is less than zero, or there are no coins; Return 0.
  if (money < 0 || coins.length === 0) {
    return 0;
  }
  // If there is no money, return one.
  if (money === 0) {
    return 1;
  }
  
  return (
    countChange(money - coins[0], coins) + countChange(money, coins.slice(1))
  )
}
