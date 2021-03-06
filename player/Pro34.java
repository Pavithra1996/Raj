package com.guvi.codekata.player;

import java.util.Scanner;

/*
 * Given a non­negative int n,
 *  return the count of the occurrences of 7 as a digit,
 *  so for example 717 yields 2. Don’t use loops
 */
public class Pro34 
{
	public int isCountOfOccurances(int n)
	{int count=0;
		if(n==7)
		{
			count++;
			return count;
		}
		else
			if(n>7&&n<100)
			{
				return isCountOfOccurances(n/10)+isCountOfOccurances(n%10);
			}
			else
				if(n>100)
				{
					return isCountOfOccurances(n/10)+isCountOfOccurances(n%10);
				}
				else
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Pro34 p=new Pro34();
		int n1=p.isCountOfOccurances(n);
		System.out.println(n1);
		
	}

}
