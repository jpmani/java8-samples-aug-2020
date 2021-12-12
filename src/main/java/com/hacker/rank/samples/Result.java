package com.hacker.rank.samples;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Result {
	/*
	 * Complete the 'sockMerchant' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER n 2. INTEGER_ARRAY ar
	 */

	public static int sockMerchant(int n, List<Integer> ar) {
		int finalSockPairsCount = 0;
		int divisor = 2;

		Map<Integer, Long> result = ar.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<Integer, Long> mapVal : result.entrySet()) {
			int dividend = mapVal.getValue().intValue();
			
			int quotient = dividend / divisor;
			int remainder = dividend % divisor;
			if(quotient == 2) {
				remainder = dividend % divisor;
				finalSockPairsCount = finalSockPairsCount + 1;
			}
			//else {
				//finalSockPairsCount = finalSockPairsCount + 1;
			//}
		}
		System.out.println(result);
		return finalSockPairsCount;
	}

}
