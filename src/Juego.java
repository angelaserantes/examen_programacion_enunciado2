public class Juego {

    int monedausuario;
    int monedamaquina;

    public int  GenerarMonedaUsuario(String moneda_usuario) {

        if (moneda_usuario.equals("cara")) {
             monedausuario = 0;
        } else {
            monedausuario = 1;
        }

        return monedausuario;


    }

    public int GenerarMonedaMaquina(){
        monedamaquina = (int) (Math.random() * 2);

        return monedamaquina;
    }

    public int getMonedausuario() {
        return monedausuario;
    }

    public void setMonedausuario(int monedausuario) {
        this.monedausuario = monedausuario;
    }

    public int getMonedamaquina() {
        return monedamaquina;
    }

    public void setMonedamaquina(int monedamaquina) {
        this.monedamaquina = monedamaquina;
    }



    }

