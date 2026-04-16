public class Agenda {
    public static void main(String[] args) {
        String[][] materias = {
                {"Java", "Projeto", "Revisão"},
                {"Python", "Projeto", "Revisão"},
                {"Inglês", "Projeto", "Revisão"},
                {"Espanhol", "Projeto", "Revisão"},
                {"Banco de Dados", "Projeto", "Revisão"},
                {"JavaScript", "Projeto", "Revisão"},
                {"Html e Css", "Projeto", "Revisão"}
        };

        String[] dia = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        String[] turno = {" Manhã ", " Tarde"," Noite"};

        System.out.print("         ");
        for (int k = 0; k < turno.length ; k++) {
            System.out.print(turno[k] + "");

        }
        System.out.println("");
        for (int i = 0; i < materias.length; i++) {
            System.out.print(dia[i] +":");
            for (int j = 0; j < materias[i].length; j++) {
                System.out.print( materias[i][j]  + " ");

                if(j < materias[i].length-1){
                    System.out.print(",");
                }
            }

            System.out.println("");
        }

    }
}


