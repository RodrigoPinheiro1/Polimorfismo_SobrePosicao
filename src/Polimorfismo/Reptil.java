package Polimorfismo;

public class Reptil extends Animal{

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override //sobreposição do metodo
    public void locomover() {
        System.out.println("rastejado");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de reptil");
    }
}
