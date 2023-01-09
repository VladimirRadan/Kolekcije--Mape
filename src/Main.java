import java.util.*;

public class Main {


    public static void main(String[] args) {
//       int a = 10;
//       String s = String.valueOf(a);
//       String s3 = a + "";
//
//       String s1 = "10";
//       String s2 = "20";
//       double b = Double.parseDouble(s1);
//       double c = Double.parseDouble(s2);
//       double zbir = b + c;
//        System.out.println(zbir);



        List myList = new ArrayList();
        myList.add("Pera");
        myList.add(88);
        myList.add(true);
        myList.add('A');
        //System.out.println(myList);
//        for (Object o:myList) {
//            System.out.println(o);
//        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(81);
        list.add(9);
        list.add(17);
        list.add(4);
        list.add(700);
        list.add(700);
        list.add(99);

        //list.remove(0);




        Collections.sort(list);

        Collections.emptyList();



        for (int a :list) {
            System.out.println(a);
        }

        //list.clear();

//        if (list.isEmpty()){
//            System.out.println("List is Empty");
//        }else {
//            System.out.println("Not empty");
//        }



//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {

            }
        }


        //System.out.println(list);

        LinkedList list1;


        list1 = new LinkedList();

        list1.addAll(list);


        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println("Set: " + integerSet);



/*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a, a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */






    }





}