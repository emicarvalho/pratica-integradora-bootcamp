package aula01;

public class TemperaturasGlobais {
    public static void main(String[] args) {
        String cidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiado de Chile", "Lisboa","Tokio" };
        int [][] temperaturaCidades = { {-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39} ,{-7, 26} ,{-1, 31}, {-10, 35} };

        String cidadeTempMaxima = cidades[0];
        String cidadeTempMinima = cidades[0];
        int tempMinima = temperaturaCidades[0][0];
        int tempMaxima = temperaturaCidades[0][1];

        for (int i = 0;i < temperaturaCidades.length; i++) {
            if (tempMinima > temperaturaCidades[i][0]){
                tempMinima = temperaturaCidades[i][0];
                cidadeTempMinima = cidades[i];
            }
            if (tempMaxima < temperaturaCidades[i][1]) {
                tempMaxima = temperaturaCidades[i][1];
                cidadeTempMaxima = cidades[i];
            }
        }
        System.out.println(cidadeTempMinima + " é a cidade com a menor temperatura, sendo " + tempMinima+ " graus");
        System.out.println(cidadeTempMaxima + " é a cidade com a maior temperatura, sendo " + tempMaxima+ " graus");
    }
}

