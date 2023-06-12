import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        System.out.println("Olá, jogador!");
        System.out.println("Vamos começar criando o seu personagem");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
        
        PersonagemModel personagem = new PersonagemModel();
        
        personagem.itens = new ArrayList();

        escolherClasse(personagem);
        escolherRaca(personagem);
        definirNome(personagem);
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("Corajoso, " + personagem.nomePersonagem + ". Bem vindo ao Raven!");
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n");
        
        System.out.println("""
                           Em lugar distante, com terras prósperas e floridas, encontra-se um reino chamado Raven, a qual existe uma profecia que está prestes a acontecer. 
                           Um terrível dragão está prestes a ser despertado. 
                           O rei Jonas, prometeu uma grande recompensa para o bravo herói que conseguir derrotar o grande dragão. Você seria capaz?""");
        
        apresentarCenas(personagem);

    }
    
    public static void escolherClasse(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma classe para seu personagem. Digite o número correspondente à sua escolha");
        
        System.out.println("1.  Guerreiro");
        System.out.println("2.  Mago");
        System.out.println("3.  Ladrão");
        System.out.println("4.  Arqueiro");
        
        String escolhaPersonagem = scanner.next();
        
        switch(escolhaPersonagem.toUpperCase())
        {
            case "1":
                personagem.classe = new GuerreiroClasse();
                break;
            case "2":
                personagem.classe = new MagoClasse();
                break;
            case "3":
                personagem.classe = new LadraoClasse();
                break;
            case "4":
                personagem.classe = new ArqueiroClasse();
                break;
            default:
                System.out.println("Opção inválida\n");
                escolherClasse(personagem);
        }
    }
    
    public static void escolherRaca(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma raça para seu personagem");
        
        System.out.println("1.  Humano");
        System.out.println("2.  Elfo");
        System.out.println("3.  Gnomo");
        System.out.println("4.  Goblin");
        
        String escolhaPersonagem = scanner.next();
        
        switch(escolhaPersonagem.toUpperCase())
        {
            case "1":
                personagem.raca = new HumanoRacaModel();
                break;
            case "2":
                personagem.raca = new ElfoRacaModel();
                break;
            case "3":
                personagem.raca = new GnomoRacaModel();
                break;
            case "4":
                personagem.raca = new GoblinRacaModel();
                break;
            default:
                System.out.println("Opção inválida\n");
                escolherRaca(personagem);
        }
    }
    
    public static void definirNome(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o nome do seu personagem");
        
        personagem.nomePersonagem = scanner.next();
    }
    
    public static boolean apresentarCenas(PersonagemModel personagem)
    {
        if(!apresentarCena1(personagem))
        {
            return false;
        }
        
        if(!apresentarCena2(personagem))
        {
            return false;
        }
        
        if(!apresentarCena3(personagem))
        {
            return false;
        }
        
        if(!apresentarCena4Boss(personagem))
        {
            return false;
        }
        
        if(!apresentarCena5Final(personagem))
        {
            return false;
        }
        
        return true;
    }
    
    public static boolean apresentarCena1(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(personagem.nomePersonagem + " acorda em um humilde hotel na cidade vizinha do reino, chamada Westero.\n" +
                "Vendo o dia raiar por sua janela, seu quarto era comum de qualquer cidadão.");
        
        System.out.println("O que deseja fazer?\n");
        
        String fraseOpcao1 = "1. Tomar café e sair de casa com seu equipamento. ";
        
        for(int i = 0; i < personagem.classe.equipamentos.size(); i++){
            String text = personagem.classe.equipamentos.get(i);
            if (i < (personagem.classe.equipamentos.size() - 1)) {
                 text += " e ";
            }
            fraseOpcao1 += text;
        }
        
        System.out.println(fraseOpcao1);
        System.out.println("2. Voltar a dormir");
        
        String opcao = scanner.next();
        
        if (opcao.equalsIgnoreCase("2")) {
            System.out.println("""
                               Voc\u00ea fica com sono novamente e volta a dormir confortavelmente em sua cama.
                               Apenas Ru\u00eddos e sons de explos\u00e3o e gritos circulam seus ouvidos, mas nada que impe\u00e7a de voc\u00ea dormir.""");
            return false;
        }
        return true;
    }
    
    public static boolean apresentarCena2(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Andando pelo centro da cidade parece ainda mais agitada e energética, apenas multidões indo e vindo de todos os lugares.");
        
        System.out.println("O que deseja fazer?\n");
        
        System.out.println("1. Falar com um mendigo que está próximo.");
        System.out.println("2. Ir para a guilda de aventureiros.");
        
        String opcao = scanner.next();
        
        if (opcao.equalsIgnoreCase("1")) {
            System.out.println("Você chega perto do homem que estava com vestes rasgadas e sujas, sentado no chão.");
            System.out.println("George - Oh, você poderia me ajudar com alguma coisa?");
            System.out.println("Quando você vai tirar um trocado do bolso, o homem lhe dá uma leve facada, rouba todo o seu dinheiro e sai correndo. Lhe causando -10 de vida. "
                    + "Porém sua armadura tanka " + personagem.classe.defesa + "%");
            
            personagem.raca.vidaAtual -= calcularDano(10,personagem.classe.defesa);
            
            exibirVidaPersonagem(personagem);
            
            System.out.println("Você se recompõe e vai em direção a guilda de aventureiros.");
        }
        
        System.out.println("Chegando na guilda você conversa com um guerreiro que estava por lá, ele te cumprimenta e lhe entrega a missão da profecia do dragão.\n");
        
        return true;
    }
    
    public static boolean apresentarCena3(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Saindo da guilda, você procura uma rota fácil para chegar no objetivo, tem dois caminhos e ambos podem ser perigosos, ou não.");
        
        System.out.println("Qual você prefere ir?\n");
        
        System.out.println("1. Matagal.");
        System.out.println("2. Passar por dentro da cidade.");
        
        String opcao = scanner.next();
        
        if (opcao.equalsIgnoreCase("1")) {
            System.out.println("O caminho mais escuro, uma floresta que parece ser levemente assombrada. O silêncio é iminente no local. "
                    + "Você consegue sentir os pelos do seu braço se arrepiando conforme adentra a névoa da floresta.");
            
            System.out.println("Você se aproxima das cavernas, onde a profecia diz que o dragão está adormecido. "
                    + "Ao se aproximar você encontra uma bolsa largada quase na entrada da caverna junto de um monte de cinzas, é um milagre a bolsa ainda está inteira.");
            
            System.out.println("Você pega e vasculha seu interior achando uma poção, essa que seria capaz de regenerar 40 de vida.\n");
            
            personagem.itens.add("Vida#40");
        } else {        
            System.out.println("O centro da cidade era de longe um dos mais bonitos já vistos em toda sua existência. "
                    + "Você em direção a outra saída do reino que lhe levaria para perto das cavernas, onde a profecia diz que o dragão está adormecido.");
            
            System.out.println("Conforme você anda, atrai inúmeros olhares curiosos, boatos já estão rolando sobre um jovem guerreiro que iria enfrentar o monstro.");
            
            System.out.println("Uma criança se aproxima tímida e lhe estende uma poção. Uma poção essa que seria capaz de regenerar 40 de vida.\n");
            
            personagem.itens.add("Vida#40");
        }
        
        return true;
    }
    
    public static boolean apresentarCena4Boss(PersonagemModel personagem){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Do nada, você sente calafrios pelo corpo todo.");
        System.out.println("Você não está sozinho, por cima, um dragão elétrico aparece por cima e te aborda!");
        System.out.println("Seu raciocínio é mais lento que o do dragão");
        System.out.println("O dragão começa a atacar!");
        
        DragaoClasse dragao = new DragaoClasse();
        
        dragaoAtacar(personagem, dragao);
        exibirDanoTankado(personagem);
        exibirVidaPersonagem(personagem);
        
        while (personagem.raca.vidaAtual >= 0 && dragao.vida > 0) {
            System.out.println("\n----- Turno do Inimigo -----");
            dragaoAtacar(personagem, dragao);
            exibirDanoTankado(personagem);
            exibirVidaPersonagem(personagem);
            
            if (personagem.raca.vidaAtual <= 0) {
                break;
            }
            
            System.out.println("\n----- Turno do heroí -----");
            System.out.println(personagem.nomePersonagem + ", escolha sua próxima ação:");
            
            System.out.println("1. Atacar");
            if (personagem.itens.indexOf("Vida#40") >= 0) {
                System.out.println("2. Se curar usando um pouco da poção");
            }
        
            String opcao = scanner.next();
            
            if (opcao.equalsIgnoreCase("1")) {
                
                if (personagem.classe.getClass().equals(new MagoClasse().getClass())) {
                    atacarUsandoCajado(personagem, dragao);
                } else if (personagem.classe.getClass().equals(new LadraoClasse().getClass())) {
                    atacarUsandoAdaga(personagem, dragao);
                } else if (personagem.classe.getClass().equals(new ArqueiroClasse().getClass())) {
                    atacarUsandoArco(personagem, dragao);
                } else if (personagem.classe.getClass().equals(new GuerreiroClasse().getClass())) {
                    atacarUsandoEspada(personagem, dragao);
                }
                
            } else if (opcao.equalsIgnoreCase("2") && personagem.itens.indexOf("Vida#40") >= 0){
                usarItemVida(personagem);
            } else {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            try{
                Thread.sleep(4000);
            }catch(InterruptedException ex){
                
            }
        }
        
        if (personagem.raca.vidaAtual <= 0) {
            System.out.println(personagem.nomePersonagem + " da seu último suspiro antes de cair sem vida aos pés do dragão.");
            System.out.println("Este é o seu fim...");
            return false;
        }
        
        System.out.println("O dragão dá seu último suspiro antes de cair aos seus pés, você sorri vitorioso e aliviado por ter concluído essa missão com perfeição.");
        
        return true;
    }
    
    public static boolean apresentarCena5Final(PersonagemModel personagem){
        System.out.println("\n");
        System.out.println("Parabéns "+ personagem.nomePersonagem +", sua bravura e coragem com certeza não foram em vão, "
                + "o Rei Jonas ficou muito alegre de saber sobre sua vitória \n contra monstro e lhe deu um lugar "
                + "em sua guarda real, além de uma grande recompensa em dinheiro.");
        
        return true;
    }
    
    public static double calcularDano(double danoTomado, double defesa)
    {
        double porcentagemDefesa = (defesa / 100);
        double dano = danoTomado * porcentagemDefesa;
        return Math.round(danoTomado - dano);
    }
    
    public static void exibirVidaDragao(DragaoClasse dragao){
        System.out.println("*******************************************");
        
        if (dragao.vida < 0) {
            System.out.println("\nA vida atual do dragão é de " + 0 + "\n");
        } else {
            System.out.println("\nA vida atual do dragão é de " + dragao.vida + "\n");
        }
        
        System.out.println("*******************************************");
    }
    
    public static void exibirVidaPersonagem(PersonagemModel personagem){
        System.out.println("###############################################");

        if (personagem.raca.vidaAtual < 0) {
            System.out.println("\nA sua vida atual é de " + 0 + "\n");
        } else {
            System.out.println("\nA sua vida atual é de " + personagem.raca.vidaAtual + "\n");
        }
        
        System.out.println("###############################################");
    }
    
    public static void exibirDanoTankado(PersonagemModel personagem){
        System.out.println("Sua armadura tanka " + personagem.classe.defesa + "%");
    }
    
    public static int dadoSorte()
    {
        Random rand = new Random(); 
        
        return rand.nextInt(20) + 1;
    }
    
    public static void atacarUsandoCajado(PersonagemModel personagem, DragaoClasse dragao){
        System.out.println(personagem.nomePersonagem + ", começa a conjurar um míssil mágico!");
        
        int sortePersogagem = dadoSorte();
        int sorteDragao = dadoSorte();
        
        if (sortePersogagem > 8) {
            System.out.println("O dragão é atingido! - você causa um dano de " + personagem.classe.ataque);
            dragao.vida -= personagem.classe.ataque;
            exibirVidaDragao(dragao);
        } else {
            System.out.println("Você erra e o míssil destrói um ninho de pássaro, boa mano");
            if (sorteDragao > 10) {
                System.out.println("O dragão contra ataca, cuspindo fogo e te queima no processo");
                
                int posicao = retornarPosicaoNoDragao(dragao,new AtaqueFogoDragaoClasse());

                System.out.println("Você sofre um dano de " + dragao.ataques.get(posicao).danoAtaque);
                exibirDanoTankado(personagem);
                
                personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
                
                exibirVidaPersonagem(personagem);
            }
        }
    }
    
    public static void atacarUsandoEspada(PersonagemModel personagem, DragaoClasse dragao){
        System.out.println(personagem.nomePersonagem + " levanta sua espada para cortar o dragão!");
        
        int sortePersogagem = dadoSorte();
        int sorteDragao = dadoSorte();
        
        if (sortePersogagem > 8) {
            System.out.println("O dragão leva um corte profundo! - você dá um dano de " + personagem.classe.ataque);
            dragao.vida -= personagem.classe.ataque;
            exibirVidaDragao(dragao);
        } else {
            System.out.println("Você meio que perde o equilíbrio empunhando a espada, é a vez do dragão");
            if (sorteDragao > 10) {
                System.out.println("O dragão contra ataca, erguindo suas garras e lhe rasga!");
                
                int posicao = retornarPosicaoNoDragao(dragao,new AtaqueGarraDragaoClasse());

                System.out.println("Você sofre um dano de " + dragao.ataques.get(posicao).danoAtaque);
                exibirDanoTankado(personagem);
                
                personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
                
                exibirVidaPersonagem(personagem);
            }
        }
    }
    
    public static void atacarUsandoArco(PersonagemModel personagem, DragaoClasse dragao){
        System.out.println(personagem.nomePersonagem + " atira precisamente uma flecha!");
        
        int sortePersogagem = dadoSorte();
        int sorteDragao = dadoSorte();
        
        if (sortePersogagem > 7) {
            System.out.println("A flecha finca no dragão! - você dá um dano de " + personagem.classe.ataque);
            dragao.vida -= personagem.classe.ataque;
            exibirVidaDragao(dragao);
        } else {
            System.out.println("A flecha acerta num urso, oops…");
            if (sorteDragao > 11) {
                System.out.println("O dragão contra ataca, cuspindo fogo e te queima no processo");
                
                int posicao = retornarPosicaoNoDragao(dragao,new AtaqueFogoDragaoClasse());

                System.out.println("Você sofre um dano de " + dragao.ataques.get(posicao).danoAtaque);
                exibirDanoTankado(personagem);
                
                personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
                
                exibirVidaPersonagem(personagem);
            }
        }
    }
    
    public static void atacarUsandoAdaga(PersonagemModel personagem, DragaoClasse dragao){
        System.out.println(personagem.nomePersonagem + " se prepara para esfaquear o dragão!");
        
        int sortePersogagem = dadoSorte();
        int sorteDragao = dadoSorte();
        
        if (sortePersogagem > 8) {
            System.out.println("O dragão é perfurado! - você causa um dano de " + personagem.classe.ataque);
            dragao.vida -= personagem.classe.ataque;
            exibirVidaDragao(dragao);
        } else {
            System.out.println("Você ataca o ar….");
            if (sorteDragao > 10) {
                System.out.println("O dragão contra ataca, erguindo suas garras e lhe rasga!");
                
                int posicao = retornarPosicaoNoDragao(dragao,new AtaqueGarraDragaoClasse());

                System.out.println("Você sofre um dano de " + dragao.ataques.get(posicao).danoAtaque);
                exibirDanoTankado(personagem);
                
                personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
                
                exibirVidaPersonagem(personagem);
            }
        }
    }
    
    public static void dragaoAtacar(PersonagemModel personagem, DragaoClasse dragao){
        if (dadoSorte() > 10) {
            int posicao = retornarPosicaoNoDragao(dragao,new AtaqueGarraDragaoClasse());
            System.out.println("O dragão ergue suas garras e te rasga fazendo você voar e perder " + dragao.ataques.get(posicao).danoAtaque + " de vida.");
            personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
        } else {
            int posicao = retornarPosicaoNoDragao(dragao,new AtaqueGarraDragaoClasse());
            System.out.println("O dragão enche o pulmão de ar, e solta um bola de fogo em você, fazendo você se queimar e perder " + dragao.ataques.get(posicao).danoAtaque + " de vida.");
            personagem.raca.vidaAtual -= calcularDano(dragao.ataques.get(posicao).danoAtaque,personagem.classe.defesa);
        }
    }
    
    public static void usarItemVida(PersonagemModel personagem){
        int posicao = personagem.itens.indexOf("Vida#40");
        
        String[] ls = personagem.itens.get(posicao).split("#");
        double qtdCura = Double.parseDouble(ls[1]);
        
        double danoTomado = personagem.raca.vidaBase - personagem.raca.vidaAtual;
        
        if (danoTomado > qtdCura) {
            personagem.raca.vidaAtual += qtdCura;
        }
        
        if (danoTomado < qtdCura) {
            qtdCura = danoTomado;
            personagem.raca.vidaAtual += qtdCura;
        }
        
        personagem.itens.remove(posicao);
        
        System.out.println("Você curou " + qtdCura + " de sua vida");
        
        exibirVidaPersonagem(personagem);
    }
    
    public static int retornarPosicaoNoDragao(DragaoClasse dragao, Object objeto){
        for (int i = 0; i < dragao.ataques.size(); i++) {
            boolean achouPosicao = dragao.ataques.get(i).getClass().equals(objeto.getClass());
            if (achouPosicao) {
                return i;
            }
        }
        return -1;
    }
}
