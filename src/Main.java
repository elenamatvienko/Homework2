public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println ("Задание 1") ;
        var dog = 8.0 ;
        System.out.println (dog) ;
        var cat = 3.6 ;
        System.out.println (cat) ;
        var paper = 763789 ;
        System.out.println (paper) ;

        // Задание 2
        System.out.println ("Задание 2") ;
        dog = dog + 4;
        System.out.println (dog) ;
        cat = cat + 4;
        System.out.println (cat) ;
        paper = paper + 4;
        System.out.println (paper) ;

        // Задание 3
        System.out.println ("Задание 3") ;
        dog = dog - 3.5;
        System.out.println (dog) ;
        cat = cat - 1.6;
        System.out.println (cat) ;
        paper = paper - 7639;
        System.out.println (paper);

        // Задание 4
        System.out.println ("Задание 4") ;
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        // Задание 5
        System.out.println ("Задание 5") ;
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        // Задание 6
        System.out.println ("Задание 6") ;
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var boxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println (" Общий вес боксеров " + boxersWeight + "кг!");
        var differenceWeight = boxerTwoWeight - boxerOneWeight;
        System.out.println (" Разница в весе боксеров " + differenceWeight + "кг!");

        // Задание 7
        System.out.println ("Задание 7") ;
        System.out.println (" Разница в весе боксеров " + (boxerTwoWeight - boxerOneWeight) + "кг!");
        System.out.println (" Разница в весе боксеров " + (boxerTwoWeight % boxerOneWeight) + "кг!");

        // Задание 8
        System.out.println ("Задание 8") ;
        var hoursTotal = 640;
        var oneEmployee = 8;
        var employeesCompany = hoursTotal / oneEmployee;
        System.out.println (" Всего работников в компании " + employeesCompany + " человек!");

        employeesCompany = employeesCompany + 94;
        var hoursWork = employeesCompany * oneEmployee;
        System.out.println (" Если в компании работает " + employeesCompany + " человека, то всего " + hoursWork + " часа работы может быть поделено между сотрудниками.");


    }
}