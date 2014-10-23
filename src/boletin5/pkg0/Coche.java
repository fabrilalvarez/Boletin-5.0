package boletin5.pkg0;

public class Coche {

    private final int velocidad;
    public int aceleracion, frenada;

    public Coche() {
        velocidad = 0;
    }

    public int getVelocidade() { //Este método devolve a velocidade actual .
        return velocidad;
    }

    public void acelerar(int valor) { //Este método incrementa a velocidade na cantidade valor.
        aceleracion = velocidad + valor;

    }

    public void frenar(int menos) { //Este método diminue a velocidade na cantidade menos.
        frenada = velocidad - menos;
    }
    
    
}
