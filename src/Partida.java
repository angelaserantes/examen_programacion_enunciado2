public class Partida {
    int victoriasMaquina;
    int victoriasUsuario;
    int empates;
    int derrotasMaquina;
    int derrotasUsuario;
    int partidas;
    public void partida(Juego juego) {
        int monedau = juego.getMonedausuario();
        int monedam = juego.getMonedamaquina();
        int monedaazar =  (int) (Math.random() * 2);

        if (monedaazar==monedam && monedaazar==monedau){
                        empates ++;
                        partidas ++;


        }else if (monedaazar==monedau && monedaazar !=monedam) {
            partidas++;
            victoriasUsuario++;
            derrotasMaquina++;
        }else{
            victoriasMaquina++;
            partidas++;
            derrotasUsuario++;
        }


    }
    public void MostrarDatos(){
        System.out.println("El usuario lleva " + victoriasUsuario + " Victorias");
        System.out.println("La maquina  lleva " + victoriasMaquina + " Victorias");
        System.out.println("Se han jugado " + partidas + " partidas");
        System.out.println("Hubo " + empates + " empates");

    }
}

