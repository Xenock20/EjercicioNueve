public class Main {
    public static void main(String[] args) {
        //Inicializacio del objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Julian");
        cliente.setTelefono("+43-11-21324-43");
        cliente.setCredito(32432);
        
        System.out.println("Soy " + cliente.getNombre + ", tengo " + cliente.getEdad + " años y mi telefono es " + cliente.getTelefono
                + " y mi credito disponible es " + cliente.getCredito + "€");

        //Inicializacio del objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(40);
        trabajador.setNombre("Jorge");
        trabajador.setTelefono("+63-11-61374-54");
        trabajador.setSalario((float) 833.3);
        
        System.out.println("Soy " + trabajador.getNombre + ", tengo " + trabajador.getEdad + " años y mi telefono es " + trabajador.getTelefono
                + " y mi salario es de " + trabajador.getSalario + "€");

    }
}

class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
}

class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return this.salario;
    }
}
