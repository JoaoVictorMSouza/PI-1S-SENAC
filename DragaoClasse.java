import java.util.Arrays;
import java.util.List;

public class DragaoClasse {
    public DragaoClasse(){
        AtaqueBaseDragaoClasse ataqueGarra = new AtaqueGarraDragaoClasse();

        AtaqueBaseDragaoClasse ataqueFogo = new AtaqueFogoDragaoClasse();
        
        List<AtaqueBaseDragaoClasse> ataques = Arrays.asList(ataqueGarra,ataqueFogo);
        
        this.ataques = ataques;
        this.vida = 150;
        this.defesa = 100;
    }
    public double vida;
    public double defesa;
    public List<AtaqueBaseDragaoClasse> ataques;
}
