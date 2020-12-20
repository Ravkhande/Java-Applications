// Accept number from and check whether that number is strong number or not.
// Strong number is such anumber whose summation of factorral of digits is same as that number.
// Example : 145  1! + 4! + 5! = 145	true
// Example : 190  1! + 9! + 0! != 190	false
// Strong numbers are : 1	2	145		40585		.....

import java.lang.*;
import java.util.*;

class Digits {
	void CheckStrongRange(int iStart, int iEnd) {
		int isum = 0, i = 0, iNo = 0;
		int fact[] = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

		if (iStart > iEnd) {
			return;
		}
		if ((iStart <= 0) || (iEnd <= 0)) {
			return;
		}

		for (i = iStart; i <= iEnd; i++) // Loop to travel the range
		{
			iNo = i;
			while (iNo != 0) // loop to get the digits
			{
				isum = isum + fact[iNo % 10]; // add the factorial
				if (isum > i) // to break the loop early
				{
					break;
				}
				iNo = iNo / 10; // remove the digit
			}
			if (i == isum) {
				System.out.println(i);
			}
			isum = 0; // Important
		}
	}
}

class Demo {
	public static void main(String arg[]) {
		Digits dobj = new Digits();
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter starting range");
		int value1 = sobj.nextInt();
		System.out.println("Enter end range");
		int value2 = sobj.nextInt();
		dobj.CheckStrongRange(value1, value2);

	}
}

// start : 1
// End 3000
