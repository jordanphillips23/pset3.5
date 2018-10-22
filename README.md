# Problem Set 3½

Problem Set 3½ challenges your ability to use conditional and iterative control structures, as well as relational, logical, and other operators to make decisions and produce outputs. The exercises are a little more mathematically inclined this time around.

## Getting Started

To get started, you'll need to create a [GitHub](https://github.com/) repository to store your Problem Set 3½ code. After cloning my skeleton repository, you'll need to setup a remote to push your code to your repository instead of mine. Steps to accomplish this are outlined below.

### Setup

01. Login to your [GitHub](https://github.com/) account and create a new repository named `problem-set-3.5`.
02. In GitBash, navigate to your `APCSA` folder.
```
cd ~/Desktop/APCSA
```
03. Clone my skeleton repository from [GitHub](https://github.com/). This will make a copy of my repository and store it locally.
```
git clone git@github.com:rwilson-ucvts/java-pset-3.5-skeleton.git
```
04. The cloning process will have created a folder named `java-pset-3.5-skeleton`. Rename this folder to `pset3.5`.
```
mv java-pset-3.5-skeleton pset3.5
```
05. Change directories to get into your `pset3.5` folder.
```
cd pset3.5
```
06. Originally, the remote will be pointing at my repository. We need to overwrite this.
```
git remote rename origin upstream
```
07. Lastly, we need to add a new remote that points at the repository you created earlier. Make sure you replace `YOUR-USERNAME` with your actual username.
```
git remote add origin git@github.com:YOUR-USERNAME/problem-set-3.5.git
```
08. Launch Eclipse and set the `Workspace` to the `APCSA` folder you created on your `Desktop`. Make sure you're using your `Workspace`, as others' will be similarly named.
09. From within the `Package Explorer` (the left-most panel), right-click and select `Import...`.
10. Select `Git > Projects from Git`, and click `Next >`.
11. Select `Existing local repository` and click `Next >`.
12. Click the `Add...` button, and then the `Browse...` button.
13. Navigate to the `APCSA` folder on your `Desktop`, click the `pset3.5` project folder, and click `Open`.
14. Select the checkbox next to your project and click `Finish`.
15. Now that we've imported the Git project, we can click `Next >`, `Next >`, and `Finish` once more.

You should now see a `Project` in the `Package Explorer` in Eclipse.

16. Expand the `Project` folder. You should see the ```JRE System Library``` folder, as well as the ```src``` folder.
17. Expand the `src` folder. You should see a single source file named `ProblemSet3_5.java`. Double-click to open it.

If you see the following starter code, then you've correctly cloned and setup your project.

![problem set 3.5 skeleton code screenshot](https://www.ucvts.tec.nj.us/cms/lib/NJ03001805/Centricity/domain/760/apcsa-images/pset3.5-skeleton.png)

## Exercises

Problem Set 3½ contains 5 exercises, each of which will be written in separate methods. The `main` method has already been declared for you, but you'll need to implement most of it.

### Exercise 1 (`primes`)

How many prime numbers are there between `start` and `end`, where `start` and `end` are positive integers in the range [1, `Integer.MAX_VALUE`]?

Print your solution in the following formats:
```
There is 1 prime number.
There are 2 prime numbers.
```

### Exercise 2 (`leapYears`)

What are the next `count` leap years?
 
Print your solution in the following formats:
```
The next leap year is X.
The next 2 leap years are X and Y.
The next N leap years are A, ..., X, Y, and Z.
```

### Exercise 3 (`palindromicNumbers`)

Is `number` a palindromic number?

Print your solution in the following formats:
```
X is a palindromic number.
X is not a palindromic number.
```

### Exercise 4 (`fibonacci`)

What is the `n`th Fibonacci number, where `n` is a positive integer?

Print your solution in the following formats:
```
The 21st Fibonacci number is X.
The 22nd Fibonacci number is X.
The 23rd Fibonacci number is X.
The 24th Fibonacci number is X.
```

### Exercise 5 (`multiples`)

What is the sum of all multiples of `x` and `y` less than `limit`, where `x`, `y`, and `limit` are positive integers?

Print your solution in the following format:
```
The sum of all multiples of X and Y less than LIMIT is Z.
```

## Deadline

Your Canvas submission is due at or before 11:59pm on Sunday, October 28, 2018.

### Submission Requirements

All that is required for submission is the URL to your [GitHub](https://github.com/) repository for this problem set.
