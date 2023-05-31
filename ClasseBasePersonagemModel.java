import java.util.List;

public class ClasseBasePersonagemModel {
    public ClasseBasePersonagemModel(int defesa, int ataque, String nomeClasse){
        this.defesa = defesa;
        this.ataque = ataque;
        this.nomeClasse = nomeClasse;
    }
    public int defesa;
    public int ataque;
    public String nomeClasse;
    public List<String> equipamentos;
}
