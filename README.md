# Problem #1:

Given an array A of n distinct integer elements with the following property:
· The first k elements (0 < k < n-1) are in strictly increasing sequence followed by the
strictly decreasing sequence.

Example:
A = {1, 3, 4, 5, 7, 14, 11, 7, 2, -4, -8}. It monotonically increases from 1 to 14, then
decreases from 14 to -8

(a) Implement an efficient program in Java that, given an array with the previous property,
determines whether a given integer is in the array.

(b) What is the running time complexity of your program? Justify.


# Problem #2:

The balance index of an array of integers is an index such that the sum of elements at lower
indexes is equal to the sum of elements at higher indexes. The formal definition is:
· The integer k is an balance index of a sequence of integers S[0]; S[1];...; S[n-1] if
and only if 0 <= k and (SUM from i=0 to k-1) S[i] = (SUM from i=k+1 to n-1) S[i]. Assume the sum 
of zero elements is equal to zero.

For example, in a sequence S:
	S[0] = -5; S[1] =3; S[2] = 7; S[3] = -8; S[4] = -2; S[5]= 5; S[6] =2
3 is a balance index, because:
		S[0]+S[1]+S[2] = S[4]+S[5]+S[6]
6 is also a balance index, because:
		S[0]+S[1]+S[2]+S[3]+S[4]+S[5]=0
		
And the sum of zero elements is zero.
Note that the index 7 is not a balance index - because it is not a valid index of sequence S.

(a) Implement an efficient function in Java
	int balIndex(int S[], int n)
that, given an array S, returns its balance index (any) or -1 if no balance index exists.

(b) What is the running time complexity of your function? Justify.


# Problem #3:

Given a sorted array of integer, A, with possible duplicate elements.

(a) Implement an efficient function in Java to find in A, the numbers of occurrences of the
input value k.

For example, in an array A = {-1, 2, 3, 5, 6, 6, 6, 9, 10} and k = 6, your program should
return 3.

(b) What is the running time complexity of your function? Justify.
