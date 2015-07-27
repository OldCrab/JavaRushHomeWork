package com.tsystems.javaschool.tasks;


/**
 * Created by andre on 11.12.14.
 */
public class CalculatorImpl implements Calculator {
    @Override
    public String evaluate(String statement) {
        double resultInDoubleForm;
        try {
            resultInDoubleForm = plusOrMinus(statement).acc;                     //вызываем сам парсер и записываем конечный результат в переменную
        }catch (Exception e){
            return null;
        }
            if (resultInDoubleForm == Double.POSITIVE_INFINITY || resultInDoubleForm == Double.NEGATIVE_INFINITY){      //проверка на невычисляемость по причине слишком большого числа в итоге
            return null;
        }
    String result = toFixed(resultInDoubleForm,4);                                      //метод для округления(вторая цифра в аргументе - до какой цифры после запятой округлять)

        return result;
    }


    private Result plusOrMinus(String s) throws Exception{                  //посылает на поиск более приоритетных операций, возвращённый результат проверяет на наличие
        Result current = multiplyOrDivide(s);                               //знака плюс или минус в первом символе и отправляет на обработку оставшуюся строку...
        double acc = current.acc;                                           //в остальных методах происходит примерно то же самое

        if (current.rest.length() > 0) {
            if (current.rest.charAt(0) == '+' || current.rest.charAt(0) == '-') {

                char sign = current.rest.charAt(0);

                current = multiplyOrDivide(current.rest.substring(1));
                if (sign == '+') {
                    acc += current.acc;
                } else {
                    acc -= current.acc;
                }
            }
        }
        return new Result(acc, current.rest);
    }
    private Result multiplyOrDivide(String s) throws Exception{
        Result current = parens(s);

        double acc = current.acc;
        while (true) {
            if (current.rest.length() == 0) {
                return current;
            }
            char sign = current.rest.charAt(0);
            if ((sign != '*' && sign != '/')) return current;

            String next = current.rest.substring(1);
            Result right = parens(next);

            if (sign == '*') {
                acc *= right.acc;
            } else {
                acc /= right.acc;
            }

            current = new Result(acc, right.rest);
        }
    }
    private Result parens(String s) throws Exception{
        char zeroChar = s.charAt(0);
        if (zeroChar == '(') {
            Result r = plusOrMinus(s.substring(1));
            if (!r.rest.isEmpty() && r.rest.charAt(0) == ')') {
                r.rest = r.rest.substring(1);
            }
            return r;
        }
        return number(s);
    }

    private Result number(String s)
    {
        int i = 0;
        boolean negative = false;
        // число также может начинаться с минуса
        if( s.charAt(0) == '-' ){
            negative = true;
            s = s.substring( 1 );
        }
        // разрешаем только цифры, точку и букву 'E' в верхнем и нижнем регистре
        while (i < s.length() && (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.' || s.charAt(i) == 'E' || s.charAt(i) == 'e')) {
            i++;
        }

        double dPart = Double.parseDouble(s.substring(0, i));
        if( negative ) dPart = -dPart;
        String restPart = s.substring(i);

        return new Result(dPart, restPart);
    }

    private String toFixed(double roundingNumber, int numberOfChars){                    //Можно было через домножение и деление, но т.к. у нас может быть 'e', лучше этого не делать
        boolean afterDot = false;                                                        //округляет до ближайшего значения, логика на грани сумасшествия.
        String s = Double.toString(roundingNumber);
        char[] array = s.toCharArray();
        String result = "";
        try {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 'E') {
                    numberOfChars += 6;
                }
                if (numberOfChars > 0) {
                    if (!(numberOfChars == 1 && afterDot)) {
                        result += array[i];
                    }
                    else if (i+1 < array.length){
                        if (array[i+1] < '5'){
                            result += array[i];
                        }
                        else{
                            result += (++array[i]);
                        }
                    }
                }
                if (afterDot) {
                    numberOfChars--;
                }
                if (array[i] == '.') {
                    afterDot = true;
                    if (array[i+1] == '0'){
                        if (array[i+2] == 'E'){
                            result = result.substring(0, i-1);
                        }
                    }
                }
            }
        } catch (IndexOutOfBoundsException e){
            result = result.substring(0, result.length()-1);
        }
        return result;
    }
    private class Result
    {

        public double acc;
        public String rest;

        public Result(double v, String r)
        {
            this.acc = v;
            this.rest = r;
        }
    }

    public static void main(String[] args) {
        Calculator c = new CalculatorImpl();
        System.out.println(c.evaluate("(1+38)*4-5")); // Результат: 151
        c = new CalculatorImpl();
        System.out.println(c.evaluate("7*6/2+8")); // Результат: 29
        c = new CalculatorImpl();
        System.out.println(c.evaluate("-12)1//(")); // Результат: null
    }
}
//P.s. Была мысль считать все скобки отдельно и вставлять значения в строку вместо них, но поздно прочитал про stateless, прошу прощения. Если надо будет, перепишу.