/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotests;

/**
 *
 * @author Gawronek
 */
public class One {
    public class Solution {
	
	public int solution(int[] A){
		
		
		int nextIndex=0;
		int seqLenght=1;
		int value=A[nextIndex];
		
		while (value!=-1) {
			nextIndex=A[nextIndex];
			value=A[nextIndex];
			seqLenght++;
		}
		
		return seqLenght;
	}
	
}
}
