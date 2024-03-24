import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Hogwarts [] people = new Hogwarts[12];
              people [0] = new Gryffindor("Harry","Potter",97,96,"Gryffindor",87,89,92);
              people [1] = new Gryffindor("Hermione","Granger",94,94,"Gryffindor",91,90,90);
              people [2] = new Gryffindor("Ron","Weasley",87, 91, "Gryffindor",86,85,87);
              people [3] = new Ravenclaw("Zhou","Chang",83,82,"Ravenclaw", 88,79,81,89);
              people [4] = new Ravenclaw("Padma","Patil", 87,82,"Ravenclaw",90,84,82,86);
              people [5] = new Ravenclaw("Marcus","Belby",85,84,"Ravenclaw",81,75,79,80);
              people [6] = new Hufflepuff("Zakharia","Smith",76,77,"Hufflepuff",74,78,86);
              people [7] = new Hufflepuff("Cedric","Diggori",84,86,"Hufflepuff", 80,82,81);
              people [8] = new Hufflepuff("Justin","Finch-Fletchley",80,79,"Hufflepuff",78,82,83);
              people [9] = new Slytherin("Draco","Malfoy",84,83,"Slytherin",95,94,93,87,97);
              people [10] = new Slytherin("Graham","Montegu",80,81,"Slytherin",90,96,90,82,92);
              people [11] = new Slytherin("Gregory","Goyle",79,91,"Slytherin",83,90,87,91,91);
        printPeople(people);
        compareTwoStudentsGryffindorAndWriteTheResult(calculateGryffindorStudentPoints1(people),calculateGryffindorStudentPoints2(people));
        compareGriffindorStudents(people[1],people[2]);
        compareSlytherinStudents(people[11],people[9]);
        compareRavenclawStudents(people[4],people[5]);
        compareHufflepuffStudents(people[7],people[8]);
        compareHogwartsStudents(people[2],people[10]);

    }
    public static void printPeople(Hogwarts [] people){
        for(Hogwarts allPeople : people){
            System.out.println(allPeople);
        }
    }
    public static int calculateGryffindorStudentPoints1(Hogwarts [] people){
        int sumOfFacultyProperties1 = 0;
        for(Hogwarts allPeople : people){
            if (Objects.equals(allPeople.getFaculty(), "Gryffindor") && Objects.equals(allPeople.getSurname(), "Potter")) {
                sumOfFacultyProperties1 = ((Gryffindor) allPeople).getNobility() + ((Gryffindor) allPeople).getHonor() + ((Gryffindor) allPeople).getCourage();

            }
        }
        return sumOfFacultyProperties1;
    }
    public static int calculateGryffindorStudentPoints2(Hogwarts [] people){
        int sumOfFacultyProperties2 = 0;
        for(Hogwarts allPeople : people){
            if (Objects.equals(allPeople.getFaculty(), "Gryffindor") && Objects.equals(allPeople.getSurname(), "Granger")){
                sumOfFacultyProperties2 = ((Gryffindor) allPeople).getNobility() + ((Gryffindor) allPeople).getHonor() + ((Gryffindor) allPeople).getCourage();

            }   // Не могу вывести getNobility и тому подобное, понимаю что нужно обратиться к дочернему классу но не могу понять как
        }
        return sumOfFacultyProperties2;
    }
    public static void compareTwoStudentsGryffindorAndWriteTheResult(int sumOfFacultyProperties1,int sumOfFacultyProperties2){
        System.out.println("Сумма очков Potter = " +sumOfFacultyProperties1);
        System.out.println("Сумма очков Granger = " +sumOfFacultyProperties2);
        if (sumOfFacultyProperties1 > sumOfFacultyProperties2){
            System.out.println("Potter лучший Гриффиндорец чем Granger");
        }
        else if (sumOfFacultyProperties1 < sumOfFacultyProperties2){
            System.out.println("Granger лучший Гриффиндорец чем Potter");
        }
        else {
            System.out.println("Студенты равны");
        }
    }
    public static void compareGriffindorStudents(Hogwarts first, Hogwarts second) {
        int firstSum = ((Gryffindor) first).getNobility() + ((Gryffindor) first).getHonor() + ((Gryffindor) first).getCourage();
        int secondSum = ((Gryffindor) second).getNobility() + ((Gryffindor) second).getHonor() + ((Gryffindor) second).getCourage();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Griffindor than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Griffindor than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Griffindors");
        }
    }
    public static void compareSlytherinStudents(Hogwarts first, Hogwarts second) {
        int firstSum = ((Slytherin) first).getAmbitiousness() + ((Slytherin) first).getCunning() + ((Slytherin) first).getDetermination() + ((Slytherin) first).getResourcefulness() + ((Slytherin) first).getThirstForPower();
        int secondSum = ((Slytherin) second).getAmbitiousness() + ((Slytherin) second).getCunning() + ((Slytherin) second).getDetermination() + ((Slytherin) second).getResourcefulness() + ((Slytherin) second).getThirstForPower();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Slytherin than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Slytherin than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Slytherin");
        }
    }
    public static void compareHufflepuffStudents(Hogwarts first, Hogwarts second) {
        int firstSum = ((Hufflepuff) first).getHardworking() + ((Hufflepuff) first).getHonest() + ((Hufflepuff) first).getLoyalty();
        int secondSum = ((Hufflepuff) second).getHardworking() + ((Hufflepuff) second).getHonest() + ((Hufflepuff) second).getLoyalty();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Hufflepuff than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Hufflepuff than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Hufflepuff");
        }
    }
    public static void compareRavenclawStudents(Hogwarts first, Hogwarts second) {
        int firstSum = ((Ravenclaw) first).getCreativity() + ((Ravenclaw) first).getSmart() + ((Ravenclaw) first).getWise() + ((Ravenclaw) first).getWitty();
        int secondSum = ((Ravenclaw) second).getCreativity() + ((Ravenclaw) second).getSmart() + ((Ravenclaw) second).getWise() + ((Ravenclaw) second).getWitty();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Ravenclaw than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Ravenclaw than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Ravenclaw");
        }
    }
    public static void compareHogwartsStudents(Hogwarts first, Hogwarts second) {
        int firstSum = first.getDistanceOfTransgression() + first.getPowerOfMagic();
        int secondSum = second.getDistanceOfTransgression() + second.getPowerOfMagic();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " is a better Hogwarts than " + second.getName());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " is better Hogwarts than " + first.getName());
        } else {
            System.out.println(first.getName() + " and " + second.getName() + " are equals as Hogwarts");
        }
    }


}