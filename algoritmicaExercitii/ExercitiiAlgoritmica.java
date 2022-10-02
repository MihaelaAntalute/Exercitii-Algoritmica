package algoritmicaExercitii;

import java.util.*;
import java.util.stream.Collectors;

public class ExercitiiAlgoritmica {
    public static void main(String[] args) {


        //1. Afla profitul maxim pe care il poti face cumparand si vanzand actiuni.
        //Ca si input ai un array cu preturile unei actiuni in fiecare zi.
        // Va trebui sa determini in ce zi trebuie sa cumperi si in ce zi trebuie sa vinzi ca sa obtii profitul maxim
        //Exemplu:
        //Input: [100, 180, 260, 310, 40, 535, 695]
        //Output: Cumpara in ziua 5 (la pretul de 40) si vinde in ziua 7 (la pretul de 695), adica profit maxim 695-40=655
        //Input2: [2, 3, 10, 6, 4, 8, 1]
        //Output: Cumpara in ziau 0 (la pretul de 2) si vinde in ziua 2 (la pretul de 10), adica profit maxim 10-2=8

        List<Integer> prices = new ArrayList<>();
        prices.add(100);
        prices.add(180);
        prices.add(260);
        prices.add(310);
        prices.add(40);
        prices.add(535);
        prices.add(695);
        //System.out.println(prices);
        System.out.println("Ex.1:profitul maxim: " + getMaxProfit(prices));


        //2. Inlocuieste fiecare element dintr-un array cu produsul tuturor celorlalte elemente
        //Exemplu:
        //Input: { 1, 2, 3, 4, 5 }
        //Output: { 120, 60, 40, 30, 24 }
        //(hint: foloseste un alt array in care sa pui rezultatul)
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        // System.out.println(numbers);
        System.out.println("Ex.2:produsul numerelor: " + getProductOfTheOthersNumbers(numbers));

        //3.Sa se verifice daca un array contine duplicate
        //Exemplu:
        //Input: [6,5,6,2,3,1]
        //Output: true, pentru ca 6 apare de doua ori
        //
        //(hint: construieste o mapa care sa numere de cate ori apare fiecare element din lista)
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(6);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(1);
        //System.out.println(numbers2);
        System.out.println("Ex.3:contine duplicate: " + findIfArrayHaveDuplicate(numbers2));

        //4. Sunt afisate n-1 numere dintr-un interval de la 1 la n. Sa se gaseasca numarul care lipseste.
        //Exemplu:
        //Input: n=7, a=[3,2,1,6,5,7]
        //Output: 4 - lipseste doar 4 din array.
        //
        //(hint: sorteaza array-ul si verifica daca gasesti o diferenta de 2 intre 2 elemente consecutive.
        // Un gasesti diferenta, acolo va fi si numarul care lipseste. Gandeste-te apoi si la alta metoda de rezolvare)

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(6);
        list.add(5);
        list.add(7);
        //System.out.println(list);
        System.out.println("Ex.4:numarul care lipseste: " + getNumberMissed(list));
        System.out.println("Ex.4:numarul care lipseste: " + findMissedNumber(list, 7));
        //5. Grupeaza elementele dintr-un array astfel incat elementele duplicate sa fie unul langa altul
        //Exemplu:
        //Input: { 1, 2, 3, 1, 2, 1 }
        //Output: { 1, 1, 1, 2, 2, 3 }
        //
        //(hint: construieste o mapa in care cheia este elementul, iar valoarea de cate ori apare.
        // Apoi construieste rezultatul parcurgand mapa si adaugand elementele unul dupa altul intr-un nou array,
        // in functie de mumarul de aparitii al fiecarui element)

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        System.out.println(list2);
        System.out.println("Ex.5:ordoneaza elementele duplicate: " + getDuplicateElementsOneAfterAnother(list2));


        //Ex6
        //6.Verifica daca un String poate fi derivat din alt String rotindu-l circular.
        //Exemplu:
        //Input: s1 = abcd
        //          s2 = dabc
        //Ouput: true, pentru ca s2 poate fi derivat din s1, rotind-se cu o unitate
        //1.rotesc
        //2.compar
        String word = "abcd";
        String s1 = "abcd";
        String s2 = "dabc";
        System.out.println("Ex.6:string derivat din rotatie: " + areCircularRotated(s1, s2));

        //Ex 7
        //Gaseste diferenta maxima intre 2 numere dintr-o lista, astfel incat elementul mai mic sa apara inaintea elementului mai mare
        //Exemplu: Input: [2,7,9,5,1,3,5]
        //	    Output: 7 (perechea de numere care indeplineste conditia este (2,9)
        List<Integer> numbers7 = new ArrayList<>();
        numbers7.add(2);
        numbers7.add(7);
        numbers7.add(9);
        numbers7.add(5);
        numbers7.add(1);
        numbers7.add(3);
        numbers7.add(5);
        System.out.println("Ex.7:diferenta maxima: " + getMaxDifference(numbers7));

        //Ex 8.
        // Gaseste cea mai apropiata valoare de un anumit numar dintr-o lista de numere
        //Exemplu: Input: [2,7,9,5,1,3,5], 8
        //                Output: 9 sau 7 sunt cele mai apropiate valori de 8
        List<Integer> numbers8 = Arrays.asList(2, 7, 9, 5, 1, 3, 5);
        System.out.println("Ex.8: cea mai apropiata valoare: " + getMostCloseNumbersThan(numbers8, 8));

        //Ex 9.
        // Muta toate zero-urile dintr-un array la final
        //Exemplu: Input: [6,0,8,2,3,0,4,0,1]
        //                Output: [6,8,2,3,4,1,0,0,0]
        List<Integer> numbers9 = Arrays.asList(6, 0, 8, 2, 3, 0, 4, 0, 1);
        System.out.println("Ex.9:Zero la final: " + putZeroOnFinal(numbers9));
        System.out.println("Ex.9:Zero la final in aceiasi lista: " + putZeroOnFinalInSAmeList(numbers9));
        //Ex10
        List<Integer> numbers10 = Arrays.asList(1, 4, 20, 3, 10, 5);
        System.out.println("Ex.10: ");
        getSubarrayWithTheSum(numbers10, 33);

        //Ex.11
        List<Integer> numbers11 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Ex.11:Rotire de n ori:" + getArrayRotatedToTheLeftBySpecifiedPositions(numbers11, 3));
        // System.out.println(getRotation(numbers11));
        //Ex12

        List<Integer> numbers12 = Arrays.asList(7, 10, 4, 3, 20, 15);
        System.out.println("Ex.12:");
        getTheMostLittleNumber(numbers12, 3);
        //Ex.13
        System.out.println("Ex.13:rotatie array: " + getRotation(numbers11));
        //Ex 14
        List<Integer> numbers14 = Arrays.asList(25, 10, 5, 1);
        System.out.println("Ex.14:Machine with rest:" + getTheRestFromMachine(numbers14, 17));
    }

    //Ex 1:
    public static int getMaxProfit(List<Integer> prices) {
        //1.parcurgem lista ca sa gasim ziua cu pretul maxim
        //2.parcurgem lista (pana la ziua cu pretul maxim) ca sa gasim ziua cu pretul minim
        //3.calculam profitul
        int maxPrice = 0;
        int dayWithMaxPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) > maxPrice) {
                maxPrice = prices.get(i);
                dayWithMaxPrice = i;
            }
        }

        for (int i = 0; i < dayWithMaxPrice; i++) {
            if (prices.get(i) < minPrice) {
                minPrice = prices.get(i);
            }
        }

        return maxPrice - minPrice;
    }

    //Ex 2 ok
    //1.parcurgem lista de numere
    //2.in locul primului element punem rezultatul produsului celorlalte elemente si
    // tot asa pana parcurgem toate elementele;adaugam rezultatele produselor intr-o alta lista si o returnam

    public static List<Integer> getProductOfTheOthersNumbers(List<Integer> numbers) {
        List<Integer> productNumbers = new ArrayList<>();
        int product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                if (i != j) {
                    product = product * numbers.get(j);
                }
            }
            productNumbers.add(product);
            product = 1;
        }
        return productNumbers;
    }

    //sau facem produsul la tot
    public static List<Integer> getProduct(List<Integer> numbers) {
        int prod = 1;
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, prod / numbers.get(i));
        }
        System.out.println("v2" + numbers);
        return numbers;
    }


    //Ex 3 ok
    public static boolean findIfArrayHaveDuplicate(List<Integer> numbersList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbersList) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
                return true;
            }
        }
        return false;
    }

    //Ex 4 ok
    public static Integer getNumberMissed(List<Integer> list) {
        Collections.sort(list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) - list.get(i) == 2) {
                return list.get(i) + 1;
            }
        }
        return 0;
    }

    public static Integer findMissedNumber(List<Integer> list, int n) {
        Map<Integer, Integer> map = new HashMap<>();
//        for (int number = 1; number <= n; number++) {
//            if(!map.containsKey(number)){
//                map.put(number,0);
//            }
//        }
        for (Integer number : list) {
            map.put(number, 1);
        }
        for (int number = 1; number <= n; number++) {
            if (map.containsKey(number)) {
                return number;
            }
        }
        return 0;
    }


    //Ex 5 ok
    public static List<Integer> getDuplicateElementsOneAfterAnother(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : list) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        List<Integer> numbersListOneAfterAnother = new ArrayList<>();
        for (Integer number : map.keySet()) {
            for (int i = 1; i <= map.get(number); i++) {
                numbersListOneAfterAnother.add(number);
            }
        }
        return numbersListOneAfterAnother;
    }

    public static List<Integer> getDuplicateElementsOneAfterAnother2(List<Integer> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    //Ex6
    public static boolean areCircularRotated(String s1, String s2) {
        for (int i = 0; i < s1.length() - 1; i++) {
            s1 = s1.substring(1) + s1.charAt(0);
            if (s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean getDerivateStringFromRotationString(String word) {
        String rotatedWord = "";
//        for (int i = 1; i < word.length() ; i++) {
//              rotatedWord += word.charAt(i);
//        }
        rotatedWord =
                //rotatedWord+= word.charAt(0);
                word = word.substring(1) + word.charAt(0);
        System.out.println(word);
        String s1 = "abcd";
        String s2 = "dabc";
        System.out.println(areCircularRotated(s1, s2));
        String s = "abcd";
        String concateneted = s + s;
        if (concateneted.contains(s2)) {
            System.out.println("rotated");
        }
        return true;
    }

    //Ex 7
    //1.Scadem fiecare numar din fiecare numar
    //2.convertim fiecare diferentra in pozitiv
    //3. comparam diferenta gasita cu diferentaa maxima
    //
    public static int getMaxDifference(List<Integer> numbers) {
        int maxDifference = 0;
        int firstNumberPosition = 0;
        int secondNumberPosition = 0;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int currentDifference = Math.abs(numbers.get(i) - numbers.get(j));
                    if (currentDifference > maxDifference) {
                        maxDifference = currentDifference;
                        firstNumberPosition = i;
                        secondNumberPosition = j;
                        // maxDifference = Integer.max(maxDifference, numbers.get(j) - numbers.get(i));
                    }
                }
            }
        }
        System.out.println(numbers.get(firstNumberPosition) + " " + numbers.get(secondNumberPosition));
        return maxDifference;
    }

    //Ex 8 gaseste cele mai apropiate valori
    //1.luam fiecare nr din lista si il scadem cu nr dat
    //2.convertim fiecare diferenta la pozitiv
    //3.comparam diferenta gasita cu diferenta minima
    //4.
    public static int getMostCloseNumbersThan(List<Integer> listNumber, int number) {
        int minimDifference = 1; // dak e 0 e el insasi
        for (int i = 0; i < listNumber.size(); i++) {
            int currentDifference = Math.abs(listNumber.get(i) - number);
            if (currentDifference < minimDifference) {
                minimDifference = currentDifference;
            }
        }
        return minimDifference;
    }


    //Ex 9
    //1.cream o lista in care vom pune numerele
    //2.luam fiecare nr si il comparam cu 0,daca nu este = cu zero il punem in lista
    //3.dupa ce terminam de comparat toate,luam si le punem si pe cele egale cu 0
    public static List<Integer> putZeroOnFinal(List<Integer> integerList) {
        List<Integer> numbers = new ArrayList<>();
        for (Integer number : integerList) {
            if (number != 0) {
                numbers.add(number);
            }
        }
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) == 0) {
                numbers.add(integerList.get(i));
            }
        }
        return numbers;
    }

    //sau sa nu facem lista
    public static List<Integer> putZeroOnFinalInSAmeList(List<Integer> integerList) {
        int k = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) != 0) {
                integerList.set(k++, integerList.get(i));
            }
        }
        for (int i = k; i < integerList.size(); i++) {
            integerList.set(i, 0);
        }
        return integerList;
    }

    //10. Gaseste un subarray dintr-un array,  care sa aiba o anumita suma
//Un subarray are capatul din stanga inaintea capatului din dreapta in array-ul original.
//Array-ul original poate avea doar numere pozitive
//Exemplu: Input: [1,4,20,3,10,5], sum=33
//                Ouput:suma a fost gasita intre indicii 2 si 4 (20+3+10=33)
//                Input: [1,4], sum = 0
//                Output: niciun subarray nu a fost gasit
    public static void getSubarrayWithTheSum(List<Integer> numbers, int sum) {
        for (int i = 0; i < numbers.size(); i++) {
            int currentSum = numbers.get(i);
            for (int j = i + 1; j < numbers.size(); j++) {
                if (currentSum == sum) {
                    System.out.println("Sum was found between indexes " + i + " and " + (j - 1));
                    break;
                }
                currentSum += numbers.get(j);
            }
        }
    }


    //11. Roteste un array la stanga cu o pozitie
    //Exemplu: Input: [1,2,3,4,5]
    //                Output: [5,1,2,3,4]
    //
    //Rezolva apoi problema in mod general, adica roteste un array la stanga cu n pozitii
    //Exemplu: Input: [1,2,3,4,5] , n=2
    //                Output: [3,4,5,1,2] - array-ul s-a rotit cu 2 pozitii


    public static List<Integer> getArrayRotatedToTheLeftBySpecifiedPositions(List<Integer> numbers, int numberOfRotation) {
        Integer lastValue;
        for (int x = 1; x <= numberOfRotation; x++) {
            rotateArrayByOne(numbers);
        }
        return numbers;
    }

    private static void rotateArrayByOne(List<Integer> numbers) {
        Integer lastValue;
        lastValue = numbers.get(numbers.size() - 1);
        for (int i = numbers.size() - 2; i >= 0; i--) {
            numbers.set(i + 1, numbers.get(i));
        }
        numbers.set(0, lastValue);
    }

    //12.Gaseste al k-lea cel mai mic element dintr-un array /ok
    //Exemplu: Input: {7, 10, 4, 3, 20, 15}, K = 3
    //                Output: 7
    public static void getTheMostLittleNumber(List<Integer> numbers, int k) {
        numbers.sort(Comparator.comparingInt(a -> a));
        System.out.println(numbers.get(k - 1));
    }

    //13. Inverseaza un array fara sa folosesti un alt array
    public static List<Integer> getRotation(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int number = list.get(j);
                list.set(j, list.get(i));
                list.set(i, number);
            }
        }
        return list;
    }

    //14. Implementeaza o masina de dat rest
    //Ai la dispozitie un nr infinit de monede de 25 centi, 10 centi, 5 centi si un cent.
    //Pentru o anumita suma, gaseste numarul minim de monede pentru a reprezenta acea suma
    //Exemplu: Input: amount = 17
    //                Output: [10, 5, 1, 1]

    public static List<Integer> getTheRestFromMachine(List<Integer> numbers, int amount) {
        List<Integer> generatedChange = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            while (amount >= numbers.get(i)) {
                amount -= numbers.get(i);
                generatedChange.add(numbers.get(i));
            }
        }
        return generatedChange;
    }


}




