const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

let inputs = [];

readline.question('Enter day: ', (day) => {
  inputs.push(Number(day));

  readline.question('Enter month: ', (month) => {
    inputs.push(Number(month));

    readline.question('Enter year: ', (inputYear) => {
      inputs.push(Number(inputYear));
      readline.close();

      const day = inputs[0];
      const month = inputs[1];
      const year = inputs[2]; // ✅ Now this won't conflict

      // Check if month is valid
      if (month < 1 || month > 12) {
        console.log('Invalid');
        return;
      }

      // Function to check for leap year
      function isLeapYear(year) {
        return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
      }

      // Days in each month
      const daysInMonth = {
        1: 31,
        2: isLeapYear(year) ? 29 : 28,
        3: 31,
        4: 30,
        5: 31,
        6: 30,
        7: 31,
        8: 31,
        9: 30,
        10: 31,
        11: 30,
        12: 31
      };

      if (day >= 1 && day <= daysInMonth[month]) {
        console.log('Valid');
      } else {
        console.log('Invalid');
      }
    });
  });
});
