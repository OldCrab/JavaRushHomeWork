package com.tsystems.javaschool.tasks;

import java.util.Arrays;
import java.util.List;

/**
 * Created by andre on 15.12.14.
 */
public class SubsequenceImpl  implements Subsequence {
    @Override
    public boolean find(List x, List y) {
        int i = 0;                                  //переменная, показывающая, на каком элементе из списка Y мы остановились
        for (Object s: x){                          //запускаем цикл, который идёт по списку Х
            for (; i < y.size();) {                 //цикл, который идёт по списку Y

                if (s.equals(y.get(i))){            //если элемент из списка Y совпадает с элементом из списка X, то останавливаем цикл Y и возвращаемся к циклу X
                    if (i < y.size()-1) {           //если это не последний элемент списка Y, то
                        i++;                        //прежде, чем прервать добавляем единицу к переменной i. Такой механизм сделал, чтобы список Y
                    }                               //не закончился, и в консоль не вылетел false на последнем элементе
                    break;
                }
                i++;
            }
            if (i == y.size()){                     //проверяем, не закончился ли у нас список Y перед тем, как закончился цикл X
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Subsequence s = new SubsequenceImpl();
        boolean b = s.find(Arrays.asList("A", "B", "C", "D"), Arrays.asList("BD", "A", "ABC", "B", "M", "D", "M", "C", "DC", "D"));
        System.out.println(b); // Результат: true
    }
}
