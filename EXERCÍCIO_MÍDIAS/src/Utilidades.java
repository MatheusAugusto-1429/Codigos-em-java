public class Utilidades {
    public static String exibirPorCategoria(Midia[] midias, String categoria) {
        String base = "Categoria \"" + categoria + "\": \n";
        int contandoMidias = 0;
    
        for (Midia midia : midias) {
            if (midia != null && midia.getCategoria().equalsIgnoreCase(categoria)) {
                base += midia.getTitulo() + " (" + midia.tipoDeMidia() + ") ";
                contandoMidias++;
            }
        }
    
        if (contandoMidias == 0) {
            base += "Não achei foi nada";
        }
        return base;
    }
}