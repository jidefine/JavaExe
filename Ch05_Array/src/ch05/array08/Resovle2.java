package ch05.array08;

import java.util.Arrays;

public class Resovle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[5];
		int[] list= new int[5];
		
		num[0]=1;
		num[1]=3;
		num[2]=6;
		num[3]=2;
		num[4]=5;
		
		if(num[0]<num[1])
			if(num[0]<num[2])
				if(num[0]<num[3])
					if(num[0]<num[4])
						list[0]=num[0];
		if(num[0]<num[1])
			if(num[0]<num[2])
				if(num[0]<num[3])
					if(num[0]<num[4])
						list[1]=num[1];
						
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("최소값 : " + num[0]);
		System.out.println("최대값 : " + num[4]);
	}

}
