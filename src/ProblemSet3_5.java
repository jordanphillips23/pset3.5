/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainy doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control strucurs we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.primes(1, 1000);
		ps.leapYears(1);
		ps.palindromicNumbers(11);
		ps.fibonacci(21);
		ps.multiples(3, 5, 11);
		
		}
	
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		int primecounter = 0;
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				primecounter++;
			}
		}
		if (primecounter == 1) {
			System.out.println("There is 1 prime number.");
		}
		else {
			System.out.println("There are "+ primecounter + " prime numbers.");
		}
		
		
	}
	
	public boolean isPrime(int num) {
		int counter = 2;
		boolean isPrime = true;
		if (num > 3 && !(num % 6 == 1 || num % 6 == 5)) {
			return false;
		}
		while ((counter <= (double) Math.sqrt(num)) && isPrime) {
			if (num % counter == 0) {
				isPrime = false;
			}
			counter++;
			
		}
		if (num == 1 || num == 0) {
			return false;
		}
		
		if (isPrime) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		int year = 2018;
		if (count < 1) {
			System.out.println("I don't know how to compute the next " + count + " leap years...");
			return;
		}
		if (count == 1) {
			System.out.print("The next leap year is ");
		}
		else {
			System.out.print("The next " + count + " leap years are ");
		}
		for (int i = 0; i < count; i++) {
			year += 4 - (year % 4);
			if (year % 100 == 0 && year % 400 != 0) {
				year += 4;
			}
			System.out.print(year);
			if (i + 2 < count) {
				System.out.print(", ");
			}
		
			if (i + 2 == count) {
				if (count != 2) {
					System.out.print(",");
				}
				System.out.print(" and ");
			}
		}
		System.out.println(".");
		
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int places = (int)Math.ceil(Math.log10(number));
		boolean palindromic = true;
		for (int i = 0; i < (places / 2); i++) {
			if(  (number / (int) Math.pow(10, places - i - 1)) % 10 !=  (number / (int) Math.pow(10, i)) % 10 ) {
				palindromic = false;
			}
		}
		if (palindromic) {
			System.out.println(number + " is a palindromic number. ");
		}
		else {
			System.out.println(number + " is not a palindromic number. ");
		}
		
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		long num1 = 1;
		long num2 = 1;
		if (n == 1) {
			System.out.println("The 1st Fibonacci number is 1.");
		}
		else if (n == 2) {
			System.out.println("The 2nd Fibonacci number is 1.");
		}
		else {
			
			for (int i = 2; i < n; i++) {
				long temp = num2;
				num2 += num1;
				num1 = temp;	
			}
			
			if (n % 100 >= 11 && n % 100 <= 13) {
				System.out.println("The " + n + "th Fibonacci number is " + num2 + ".");
			}
			
			else {
				switch(n % 10) {
				case 1:
					System.out.println("The " + n + "st Fibonacci number is " + num2 + ".");
					break;
				case 2:
					System.out.println("The " + n + "nd Fibonacci number is " + num2 + ".");
					break;
				case 3:
					System.out.println("The " + n + "rd Fibonacci number is " + num2 + ".");
					break;
				default:
					System.out.println("The " + n + "th Fibonacci number is " + num2 + ".");
					break;
				}
				
			}
			
			
		}
		
		
	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum is X."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		long sum = 0;
		
		for (int i = 0; i < limit; i++) {
			
			if (i % x == 0 || i % y == 0) {
				sum += i;
			}
		}
		
		System.out.println("The sum of all multiples of " + x + " and " + y + " less than " + limit + " is " + sum + ".");
	}
}