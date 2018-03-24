package com.visu.algo.primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EratosthenesSieve {

    public List<Integer> getValues(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] sieve = getSieve(n);

        for (int i = 1; i <= n; ++i) {
            if (sieve[i]) primes.add(i);
        }

        return primes;
    }

    private boolean[] getSieve(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int THRESHOLD = (int) Math.sqrt(n) + 1;
        for (int i = 2; i <= THRESHOLD; ++i) {
            if (primes[i]) {
                for (int j = 2; j * i <= n; ++j ) {
                    primes[i * j] = false;
                }
            }
        }

        return primes;
    }
}
