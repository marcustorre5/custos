package contrução.materiais;

public class hidraulicos implements orçamentoInterface {

    private String canos = "depende da quantide de banheiros e do tamanho da cozinha";
    private double caixaDAgua500Lp = 225, caixaDAgua1000Lp = 390, ralosp = 11, m2, instalacaoH=130;
    
    String resumoq, resumop;

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public String getCanos() {
        return canos;
    }

    public double getCaixaDAgua1000L() {
        return caixaDAgua1000Lp;
    }

    public double getRalos() {
        return ralosp;
    }

    @Override
    public void fazerorçamento() {
        double totalH = m2*instalacaoH;
        resumop = "VALORES: \n"
                + "uma caixa de água de 500L custa " + caixaDAgua500Lp+ " ou uma caixa de água de 1000L custa" + caixaDAgua1000Lp + " Cada ralo custão " + ralosp + ",\n"
                + "a parte de instalação hidroulica tende a custar entre 120 a 140 reais deoendendo da sua região, \n"
                + "então para " + m2 + " metros quadrados ficaria em torno de " + totalH + " Reais.";
        System.out.println(resumop);
    }

    @Override
    public void quantidadeMateriais() {
        resumoq = "QUANTIDADE:\n"
                + "Os canos " + canos + ",\n"
                + "pelo menos uma caixa de água,\n"
                + "eo os ralos 1 ou dois em cada banheiro.";
        System.out.println(resumoq);
    }

}
