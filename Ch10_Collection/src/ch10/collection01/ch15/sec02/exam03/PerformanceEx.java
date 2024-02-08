package ch10.collection01.ch15.sec02.exam03;

import java.math.BigInteger;

public class PerformanceEx {
public static void main(String[] args) {
	
	BigInteger result = new BigInteger("1"); // 큰 수를 계산할때 숫자는 감당을 못하기 때문에 문자를 넣음
	BigInteger sum = new BigInteger("0");
	BigInteger two = new BigInteger("2");
	long cnt = 0; 
//	long result = 0; 
//	long sum = 0;
	
	for(int i = 0;i<64;i++) {
		result = BigInteger.valueOf(1);
//		result = 1;
		for(int j=0;j<cnt;j++) {
			result = result.multiply(two);
//			result *= 2;
		}
		System.out.println("result =" + result);
		sum = sum.add(result);
//		sum+=result;
		cnt++;
	}
	System.out.println("트리 최대 32 검색할 수 있는 최대 수는 " + sum);
		
}
}
