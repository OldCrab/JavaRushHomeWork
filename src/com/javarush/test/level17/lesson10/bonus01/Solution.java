package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

/*public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args){
        try {
            String fullString = readFromConsole();
            if (fullString.substring(0, 2).equals("-c")) {
                create(fullString.substring(3));
            } else if (fullString.substring(0, 2).equals("-u")) {
                update(fullString.substring(3));
            } else if (fullString.substring(0, 2).equals("-d")) {
                delete(fullString.substring(3));
            } else if (fullString.substring(0, 2).equals("-i")) {
                getInfo(fullString.substring(3));
            }
        }
        catch (Throwable t){

        }


    }

    private static String readFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();

    }

    private static void create(String params) throws ParseException {
        System.out.println(params);
        char[] fullString = params.toCharArray();
        for (int i = 0; i < fullString.length; i++) {
            if (fullString[i] == ' ' && (fullString[i+1] == 'м' || fullString[i+1] == 'ж') && fullString[i+2] == ' ') {
                if (fullString[i + 1] == 'м') {
                    allPeople.add(Person.createMale(params.substring(0, i), new SimpleDateFormat("dd/MM/yyyy").parse(params.substring(i + 3))));
                } else {
                    allPeople.add(Person.createFemale(params.substring(0, i), new SimpleDateFormat("dd/MM/yyyy").parse(params.substring(i + 3))));
                }
            }
        }

    }

    private static void update(String params) throws ParseException {
        char[] fullString = params.toCharArray();
        int id = -1;
        for (int i = 0; i < fullString.length; i++) {
            if (fullString[i] == ' '){
                id = Integer.parseInt(params.substring(0, i));
                params = params.substring(i+1);
                fullString = params.toCharArray();
                break;
            }
        }
        for (int i = 0; i < fullString.length; i++) {
            if (fullString[i] == ' ' && (fullString[i+1] == 'м' || fullString[i+1] == 'ж') && fullString[i+2] == ' ') {
                if (fullString[i + 1] == 'м') {
                    allPeople.get(id).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(params.substring(i + 3)));
                    allPeople.get(id).setName(params.substring(0, i));
                    allPeople.get(id).setSex(Sex.MALE);
                } else {
                    allPeople.get(id).setBirthDay(new SimpleDateFormat("dd/MM/yyyy").parse(params.substring(i + 3)));
                    allPeople.get(id).setName(params.substring(0, i));
                    allPeople.get(id).setSex(Sex.FEMALE);
                }
            }
        }
    }

    private static void delete(String params){
        int id = Integer.parseInt(params);
        allPeople.remove(id);
    }

    private static void getInfo(String params){
        int id = Integer.parseInt(params);
        String info = allPeople.get(id).getName();
        Sex sex = allPeople.get(id).getSex();
        if (sex==Sex.MALE){
            info += " м";
        }
        else {
            info += " ж";
        }
        Date bd = allPeople.get(id).getBirthDay();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        info += " " + dateFormat.format(bd);
        System.out.println(info);
    }


}

*/
public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            if (args[0].equals("-c")) {
                Person person;
                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], dateFormat.parse(args[3]));
                } else {
                    person = Person.createFemale(args[1], dateFormat.parse(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person));
            } else if (args[0].equals("-u")) {
                allPeople.get(Integer.parseInt(args[1])).setName(args[2]);
                if (args[3].equals("м"))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.MALE);
                else if (args[3].equals("ж"))
                    allPeople.get(Integer.parseInt(args[1])).setSex(Sex.FEMALE);
                allPeople.get(Integer.parseInt(args[1])).setBirthDay(dateFormat.parse(args[4]));
            } else if (args[0].equals("-d")) {
                allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
            } else if (args[0].equals("-i")) {
                dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                System.out.println(allPeople.get(Integer.parseInt(args[1])).getName() + " " +
                        (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE) ? "м" : "ж") + " " +
                        dateFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDay()));
            }
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
