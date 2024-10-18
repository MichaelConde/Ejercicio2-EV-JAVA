import javax.swing.JOptionPane;

public class Informacionviaje {
    int cantidadestudiantes=0;
    String nombre="";
    String documento="";
    String telefono="";
    int ciudad=0;

    //----------------------------------------------------------
public void cantidadestudiantesvuelo(){
    cantidadestudiantes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes que va a viajar"));
for (int i = 0; i < cantidadestudiantes; i++) {
    informacionEstudiantes();
    vueloEscogido();
    imprimirInformacionEstudiantes();
    informacionVuelo(); 
}


}
//----------------------------------------------------------
    public void informacionEstudiantes(){
    nombre= JOptionPane.showInputDialog("Ingrese su nombre");
    documento= JOptionPane.showInputDialog("Ingrese el numero de su documento");
    telefono=JOptionPane.showInputDialog("Ingrese su numero de telefono");
    } 
    //----------------------------------------------------------
    public void vueloEscogido(){
        ciudad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la ciudad a la que desea viajar teniendo la siguiente tabla \n 1=Medellin \n 2=Bogotá \n 3=Cartagena \n 4=Barranquilla"));
    }
    //----------------------------------------------------------
    public void imprimirInformacionEstudiantes(){
        System.out.println("Nombre: "+ nombre+"\n documento: "+documento+"\n telefono: "+telefono);
    }
//----------------------------------------------------------
    public void informacionVuelo(){
        switch (ciudad) {
            case 1 -> {
                System.out.println("La ciudad a la que viaja es Medellin \n la fecha de su vuelo es 6 de Octubre- 8am");
            }
                case 2 -> {
                    System.out.println("La ciudad a la que viaja es Bogotá \n la fecha de su vuelo es 10 de Noviembre- 6pm");
            }
                case 3 -> {
                    System.out.println("La ciudad a la que viaja es Cartagena \n la fecha de su vuelo es 5 de Abril- 2pm");
            }
                case 4 -> {
                    System.out.println("La ciudad a la que viaja es Barranquilla \n la fecha de su vuelo es 4 de Mayo- 4am");
            }
        
            default -> System.out.println("El vuelo no exite");
        }
    }
}
