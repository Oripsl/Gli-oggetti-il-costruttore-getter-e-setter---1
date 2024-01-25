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

class Studente {
    private String name;
    private String surname;
    private int id;

    public Studente(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    // Getter name
    public String getName() {
        return name;
    }
    // Setter name
    public void setName(String name) {
        this.name = name;
    }

    // Getter surname
    public String getSurname() {
        return surname;
    }
    // Setter surname
    public void setSurname(String name) {
        this.surname = surname;
    }

    // Getter ID
    public int getId() {
        return id;
    }
    // Setter ID
    public void setId(int id) {
        this.id = id;
    }
}