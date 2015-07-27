package com.javarush.test.level09.lesson02.task03;

/* Метод должен вернуть номер строки кода, из которого вызвали этот метод
Написать пять методов, которые вызывают друг друга. Метод должен вернуть номер строки кода, из которого вызвали этот метод. Воспользуйся функцией: element.getLineNumber().
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static int method1()
    {
        method2();
        StackTraceElement[] stackTraceElementsMethod1 = Thread.currentThread().getStackTrace();
        return  stackTraceElementsMethod1[2].getLineNumber();
    }

    public static int method2()
    {
        method3();
        StackTraceElement[] stackTraceElementsMethod4 = Thread.currentThread().getStackTrace();

        return stackTraceElementsMethod4[2].getLineNumber() ;
    }

    public static int method3()
    {
        method4();
        StackTraceElement[] stackTraceElementsMethod4 = Thread.currentThread().getStackTrace();

        return stackTraceElementsMethod4[2].getLineNumber() ;
    }

    public static int method4()
    {
        method5();
        StackTraceElement[] stackTraceElementsMethod4 = Thread.currentThread().getStackTrace();

        return stackTraceElementsMethod4[2].getLineNumber() ;
    }

    public static int method5()
    {
        StackTraceElement[] stackTraceElementsMethod5 = Thread.currentThread().getStackTrace();

        return  stackTraceElementsMethod5[2].getLineNumber();
    }
}
