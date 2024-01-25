public class Studente {
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
