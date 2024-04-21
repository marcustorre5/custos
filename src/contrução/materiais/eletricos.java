package contrução.materiais;

public class eletricos implements orçamentoInterface {

    private String tomadasq = "uma a cada 5m dependendo do projeto",
            interupitoresq = "1 ou 2 por comodo dependendo do projeto";
            
    double fiosq = 0.75;

    private double tomadasp = 5, interupitoresp = 6.20, fios1e5 = 1.25, fios2e5 = 1.60, fios6 = 4.40;
    double m2;
    private double fiostq, fiostp1, fiostp2, fiostp6, totalp;

    String resumoPreço, resumoQuantidade;

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public String getTomadasq() {
        return tomadasq;
    }

    public String getInterupitoresq() {
        return interupitoresq;
    }

    public double getFiosq() {
        return fiosq;
    }

    public double getTomadasp() {
        return tomadasp;
    }

    public double getInterupitoresp() {
        return interupitoresp;
    }

    public double getFiosp1e5() {
        return fios1e5;
    }

    public double getFiosp2e5() {
        return fios2e5;
    }

    public double getFiosp6() {
        return fios6;
    }

    @Override
    public void fazerorçamento() {
        //fios de 1,5mm
        fiostp1 = fiostq * fios1e5;
        resumoPreço = "VALORES: \n"
                + "cada tomada custa " + tomadasp + " reais,\n"
                + "os interuptores são " + interupitoresp + ",\n"
                + "os fios de 1,5mm vai custar: "
                + fiostp1 + " reais.";
        System.out.println(resumoPreço);

        //fios de 2,5mm
        fiostp2 = fiostq * fios2e5;
        resumoPreço =
                "os fios de 2,5mm vai custar: "
                + fiostp2 + " reais.";
        System.out.println(resumoPreço);

        //fios de 6mm
        fiostp6 = fiostq * fios6;
        resumoPreço =
                "os fios de 2,5mm vai custar: "
                + fiostp6 + " reais.";
        System.out.println(resumoPreço);
        System.out.println();
    }

    @Override
    public void quantidadeMateriais() {
        fiostq = m2 * fiosq;
        resumoQuantidade = "QUANTIDADE:\n"
                + "Tomadas: " + tomadasq + ",\n"
                + "Interuptores: " + interupitoresq + ",\n"
                + "Fios: " + fiostq + " metros.";
        System.out.println(resumoQuantidade);

    }

}
