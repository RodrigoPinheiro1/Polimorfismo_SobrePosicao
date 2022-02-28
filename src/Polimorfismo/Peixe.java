package Polimorfismo;

public class Peixe extends Animal{

    private String corEscama;


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public  void soltarBolha(){

        System.out.println("sooltando bolhas");
    }
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som");
    }
}
