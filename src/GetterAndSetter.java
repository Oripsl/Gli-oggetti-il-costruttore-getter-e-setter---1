public class GetterAndSetter {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Carlo", "Diquattro", 123456);

        // Print infos
        System.out.println("Name: " + studente1.getName());
        System.out.println("Surname: " + studente1.getSurname());
        System.out.println("Id: " + studente1.getId());

        // Modify infos
        studente1.setName("Roberto");
        studente1.setSurname("Occhipinti");
        studente1.setId(678912);

        // Print new infos
        System.out.println("New infos:");
        System.out.println("Name: " + studente1.getName());
        System.out.println("Surname: " + studente1.getSurname());
        System.out.println("Id: " + studente1.getId());

    }
}