# Prime Number Generation Using Sieve of Eratosthenes
The Sieve of Eratosthenes is an efficient method for generating all the primes from 2 to a given number n. It begins by assuming all the numbers are prime. Then it removes all the multiples of the first prime number. This sequence repeats for the next prime numbers until all numbers have been processed, and only the prime numbers are left.
## Implementation
```java
public boolean[] findPrimes(int n)
{
   boolean[] prime=new boolean[n+1];
   Arrays.fill(prime,true);
   prime[0]=false;
   prime[1]=false;
   int m=Math.sqrt(n);

   for (int i=2; i<=m; i++)
      if (prime[i])
         for (int j=i*i; j<=n; j+=i)
            prime[j]=false;

   return prime;
}
```
In the above method, the Sieve of Eratosthenes algorithm is used to return a boolean array indicating the prime numbers from 0 to n. We first create a boolean array prime which stores the primality of each number less of equal than n, and assume all numbers are prime by setting all elements to true. (0 and 1 are then set to false because they are not prime numbers) A loop from 2 to the square root of n is then used to check if prime[i] is true then number i is prime, and the inner loop then removes all the multiples of the current prime. The boolean array is returned with only the prime numbers set to true.