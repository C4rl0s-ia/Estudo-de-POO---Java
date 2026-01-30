package polimorfismo.sobreposicao.Teste;

// Importando suas classes de domínio
import polimorfismo.sobreposicao.Mamifero.*;
import polimorfismo.sobreposicao.Reptil.*;
import polimorfismo.sobreposicao.Peixe.*;
import polimorfismo.sobreposicao.Ave.*;
// Importando a utilidade de cores
import utilidades.CoresTerminal;

public class TesteSobreposicao {

    public void TesteSobreposicao(){

        // --- INSTANCIANDO OS OBJETOS ---
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();

        // --- CABEÇALHO ---
        System.out.println(CoresTerminal.corRGB(0, 255, 255) +
                "\n==========================================");
        System.out.println("   TESTE DE POLIMORFISMO (SOBREPOSIÇÃO)   ");
        System.out.println("==========================================" + CoresTerminal.RESET);

        // --- 1. LOCOMOÇÃO PADRÃO (CLASSES MÃE) ---
        System.out.println(CoresTerminal.AMARELO + "\n--- [1] Locomoção Padrão (Classes Mãe) ---" + CoresTerminal.RESET);

        testarLocomocao("Mamífero", m);
        testarLocomocao("Réptil", r);
        testarLocomocao("Peixe", p);
        testarLocomocao("Ave", a);

        // --- 2. SOBREPOSIÇÃO (ONDE A MÁGICA ACONTECE) ---
        System.out.println(CoresTerminal.AMARELO + "\n--- [2] Comportamentos Diferentes (Override) ---" + CoresTerminal.RESET);

        testarLocomocao("Canguru", c);    // Deve saltar
        testarLocomocao("Cachorro", k);   // Deve correr (herança padrão)
        testarLocomocao("Cobra", j);      // Deve rastejar
        testarLocomocao("Tartaruga", t);  // Deve andar devagar
        testarLocomocao("GoldFish", g);   // Deve nadar

        // --- 3. MÉTODOS ESPECÍFICOS ---
        System.out.println(CoresTerminal.AMARELO + "\n--- [3] Habilidades Específicas ---" + CoresTerminal.RESET);

        System.out.print(CoresTerminal.ROXO + "Canguru: " + CoresTerminal.CIANO);
        c.usarBolsa();

        System.out.print(CoresTerminal.ROXO + "Cachorro: " + CoresTerminal.CIANO);
        k.enterrarOsso();

        System.out.print(CoresTerminal.ROXO + "Peixe: " + CoresTerminal.CIANO);
        p.soltarBolhas();

        // Reset final para garantir que o terminal do usuário não fique colorido depois
        System.out.print(CoresTerminal.RESET);
    }

    // Criei um método auxiliar para não repetir código e facilitar a formatação
    // Ele recebe qualquer objeto que seja filho de Animal (Polimorfismo puro aqui!)
    public static void testarLocomocao(String nomeAnimal, polimorfismo.sobreposicao.Animal animal) {
        // Formatação: Nome do bicho em Roxo, Ação em Verde
        System.out.print(CoresTerminal.ROXO + nomeAnimal + ": " + CoresTerminal.VERDE);
        animal.locomover();
        System.out.print(CoresTerminal.RESET); // Reseta para a próxima linha não bugar
    }
}