public class Ave extends Animal{
    private boolean migratoria;


    public Ave(String nome, int idade, String dieta, boolean migratoria){
        super(nome,idade,dieta);
        this.migratoria = migratoria;
    }


    public boolean isMigratoria(){
        return migratoria;
    }


    public void setMigratoria(boolean migratoria){
        this.migratoria = migratoria;
    }


    @Override
    public String exibirInfo(){
        return super.exibirInfo() + "\n" + "Migratória: " + isMigratoria();
    }


    @Override
    public String exibirHabitat(){
        return super.exibirHabitat() + "Ambiente aéreo";
    }

    @Override
    public String showHabitat(){
        return super.showHabitat() + "Ambiente aéreo";
    }
}


