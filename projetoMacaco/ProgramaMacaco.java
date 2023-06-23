package projetoMacaco;

public class ProgramaMacaco {
    
public static void main(String[] args) {
    
        Macaco macaco1 = new Macaco("Macaco 1");
        Macaco macaco2 = new Macaco("Macaco 2");

        macaco1.comer("Banana");
        macaco2.comer("Maçã");
        macaco1.comer("Pêssego");

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.digerir();
        macaco2.digerir();

        macaco1.verBucho();
        macaco2.verBucho();

        macaco1.comer(macaco2.getNome());

        macaco1.verBucho();
        macaco2.verBucho();
    }
}
