package ArrayList;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        //CREATE
        students.add("Tom");
        students.add("Kat");
        students.add("Kim");
        students.add("Arnold");

        //READ
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext())
        System.out.println(iterator.next());

       //UPDATE
        System.out.println("\nupdate by index 3 to Karol:");
        students.set(3, "Karol");
        System.out.println(students);

        //DELETE
        System.out.println("\nDelete Kim");
        students.remove("Kim");
        for (String student : students) {
            System.out.println(student);
        }

        //SORT
        System.out.println("\nSort of names in alphabetical order");

        List<String> sortingOfNames = new ArrayList<>();
        Collections.addAll(sortingOfNames, "karol","arnold","kat","tom");
        Collections.sort(sortingOfNames);
        System.out.println(sortingOfNames);
    }

    }

