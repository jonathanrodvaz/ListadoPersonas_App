public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    // Constructor vacio:
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }
    //Constructor con argumentos:
    public Persona(String nombre, String tel, String email){
       this(); //Aqui se llama al constructor vacio
       this.nombre = nombre;
       this.tel = tel;
       this.email = email;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}' + super.toString();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Barry Unger", "555333888", "barry@aol.com");
        System.out.println(persona1);
        Persona persona2 = new Persona("Frank Hennesy", "555777888", "ace@aol.com");
        System.out.println(persona2);
        Persona persona3 = new Persona("Ivan Dolvich", "555888888", "ivan@aol.com");
        System.out.println(persona3);
        Persona persona4 = new Persona("Keith Hanson", "555222888", "grizzly@aol.com");
        System.out.println(persona4);
        Persona persona5 = new Persona("Helmut Gunther", "555999888", "grunty@aol.com");
        System.out.println(persona5);
    }
}
