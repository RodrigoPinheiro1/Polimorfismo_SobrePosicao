package Polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish =new GoldFish();
        Arara arara = new Arara();

       /* m.setPeso(35);
        m.setCorPelo("MARROM");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();*/

        canguru.locomover();
        cachorro.locomover();

        cachorro.emitirSom();
        canguru.emitirSom();
        arara.emitirSom();





    }


}
