public class testeTreino {
    public static void main(String[] args) {
        exTreino treino = new exTreino();
        treino.peso = 80;
        treino.dificuldade = 3;
        treino.nome = "supino";
        treino.descricao = "suba o a estenção do braço e depois o desca até seu triceps ficarem  alinhados com o ombro";
        treino.series = 3;
        treino.membroTrabalhado = "peito";
        treino.quantiaderepeticoes = 15;
        System.out.println("Descrição do exercício: " + treino.descricao);
        System.out.println("Nome do ecercicio: " + treino.nome + "\nMembro trabalhado: " + treino.membroTrabalhado);
        System.out.println("Séries: " + treino.series);
        System.out.println("Repetoções: " + treino.quantiaderepeticoes);
        System.out.println("Carga: "+ treino.peso);
        System.out.println("Nivel de dificuldade: " + treino.dificuldade);
    }
}
