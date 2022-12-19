import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opcion=0;
        System.out.println("Escoja cara o cruz?");
        Scanner datos = new Scanner(System.in);
        Partida partidas = new Partida();
        Juego juego = new Juego();
        String usuariom = datos.nextLine();

        do {
            if (partidas.victoriasMaquina==5)  {

                System.out.println("La maquina ha ganado 5 veces GAME OVER");
                opcion = 2;}

            else if (partidas.victoriasUsuario==5){

                System.out.println("El usuario ha ganado 5 veces  GAME OVER");
                opcion = 2;



            } else{
                System.out.println("Pulsa 0- Jugar");
                System.out.println("Pulsa 1- Mostrar Datos partida");
                System.out.println("Pulsa 2- Salir");
                opcion = datos.nextInt();
            }




            switch (opcion){

                case 0:
                    juego.setMonedamaquina(juego.GenerarMonedaMaquina());
                    juego.setMonedausuario(juego.GenerarMonedaUsuario(usuariom));
                    partidas.partida(juego);
                    break;

            case 1:

                partidas.MostrarDatos();
                break;


                case 2:
                    System.out.println("El juego se ha acabado");
                    break;
                default:
                    System.out.println("La opción elegida no está disponible");
            }
        }
        while (opcion != 2);

        }

    }
