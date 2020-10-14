#### Handling Exceptions

What will be the result of compiling and running the following program ?

```
class NewException extends Exception {}
class AnotherException extends Exception {}
public class ExceptionTest{
   public static void main(String [] args) throws Exception{
      try{
         m2();
      }
      finally{ m3(); }
    }
    public static void m2() throws NewException{  throw new NewException();  }
    public static void m3() throws AnotherException{  throw new AnotherException();  }
}

Select 1 option

    It will compile but will throw AnotherException when run.
    
    It will compile but will throw NewException when run.
    
    It will compile and run without throwing any exceptions.
    
    It will not compile.
    
    None of the above.
```





##### Why is this question good in your view?

It is checking whether you know how to handle exceptions and know what is allowed and not allowed.

##### Why did the question challenge you?

It was challenging to me because I failed to notice that m2() throws NewException, which is not caught
by a catch block which could potentially catch new Exception() or its Subclass NewException()

##### What did you learn from the question ?

I learned about the flow of execution when it comes to exceptions, so before the program exits out of the main method,the finally block must be executed.
 
Since finally throw AnotherException, the NewException thrown in the try block gets ignored by the compiler and AnotherException is thrown from the main method.


##### Which other concepts are related to this question ?

Some other concepts at play here is Inheritance as well as knowing how to use methods in a class that are declared static and knowing how the JVM behaves.