# Prime Number Generation Using Sieve of Eratosthenes
The Sieve of Eratosthenes is an efficient method for generating all the primes from 0 to a given number _n_. It begins by assuming all the numbers are prime. Then it removes all the multiples of the first prime number. This sequence repeats for the next prime numbers until all numbers have been processed, and only the prime numbers are left.
## Implementation
```java
public boolean[] sieveOfEratosthenes(int n)
{
   boolean[] prime=new boolean[n+1];
   for(int i=0;i<n;i++)
            prime[i] = true;
   prime[0]=false;
   prime[1]=false;
   int m=Math.sqrt(n);

   for (int i=2; i<=m; i++)
      if (prime[i])
         for (int j=i*2; j<=n; j+=i)
            prime[j]=false;

   return prime;
}
```
In the above method, the Sieve of Eratosthenes algorithm is used to return a boolean array indicating the prime numbers from 0 to _n_. First, a boolean array is created which stores the primality of each number from 0 to _n_, and assume all numbers are prime by setting all elements to true. (0 and 1 are then set to false because they are not prime numbers) A loop from 2 to the square root of _n_ is then used to check if prime[i] is true, if that is the case, then number _i_ is prime, and the inner loop then removes all the multiples of the current prime. Once all numbers have been processed, the boolean array is returned with only the prime numbers set to true.