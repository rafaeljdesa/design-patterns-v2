package structural.facade;

/**
 * Utilizar o Facade quando quiser criar uma interface mais simples para o código cliente e que abstrai a complexidade entre subsistemas.
 * Pode ser utilizado para reduzir o acoplamento entre camadas.
 */
public class FacadeRun {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.execute();
    }
}
