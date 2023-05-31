import java.util.Arrays;
import java.util.List;

public class GuerreiroClasse extends ClasseBasePersonagemModel {    
    public GuerreiroClasse() {
        super(50, 30, "Guerreiro");
        
        List<String> equipamentos = Arrays.asList("ESPADA","ESCUDO");
        this.equipamentos = equipamentos;
    }
}
