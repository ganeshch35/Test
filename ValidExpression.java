package com.app.demo;

enum Sample 
{ 
    A, B, C;

	public Sample a;
	public Sample b;
	public Sample c;
} 
  
public class ValidExpression 
{ 
	@SuppressWarnings("null")
	public static void main(String[] args) 
    { 
    	Sample a = Sample.A; 
    	Sample b = Sample.B; 
    	Sample c = Sample.C;
    	if(a==null && b==null && c==null) {
        a.b.c=c.b.a;
    	}
         
    } 
}


