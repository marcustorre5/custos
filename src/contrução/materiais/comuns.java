package contrução.materiais;

public class comuns implements orçamentoInterface {

    private double areiaq = 30, cimentoq = 10, tintaq = 0.1, tijoloq = 70, concretoq = 14, argamassaq = 5;
    private double areiap = 18, cimentop = 18, tintap = 50, tijolop = 1.50, concretop = 2.50, argamassap = 30;
    private double areiatq, cimentotq, tintatq, tijolotq, concretotq, argamassatq;
    private double areiatp, cimentotp, tintatp, tijolotp, concretotp, argamassatp;
    double m2, orçamentototal;
    String resumoPreço, resumoQuantidade;

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getAreiap() {
        return areiap;
    }

    public double getCimentop() {
        return cimentop;
    }

    public double getTintap() {
        return tintap;
    }

    public double getTijolop() {
        return tijolop;
    }

    public double getConcretop() {
        return concretop;
    }

    public double getArgamassap() {
        return argamassap;
    }

    public double getAreiaq() {
        return areiaq;
    }

    public double getCimentoq() {
        return cimentoq;
    }

    public double getTintaq() {
        return tintaq;
    }

    public double getTijoloq() {
        return tijoloq;
    }

    public double getConcretoq() {
        return concretoq;
    }

    public double getArgamassaq() {
        return argamassaq;
    }

//metodos abstratos
    @Override
    public void fazerorçamento() {
        areiatp = areiatq * areiap;
        cimentotp = cimentotq * cimentop;
        tijolotp = tijolotq * tijolop;
        concretotp = concretotq * concretop;
        tintatp = tintatq * tintap;
        orçamentototal = areiatp + argamassatp + cimentotp + concretotp + tijolotp + tintatp;

        resumoPreço = "VALORES: \n"
                + "voce vai gastar " + areiatp + " de areia, \n"
                + cimentotp + " de cimento,\n"
                + concretotp + " de concreto,\n"
                + tijolotp + " de tijolo,\n"
                + tintatp + " de tinta.";
        System.out.println(resumoPreço);
        System.out.println("orçamento total=" + orçamentototal);
    }

    @Override
    public void quantidadeMateriais() {
        areiatq = m2 * areiaq;
        argamassatq = m2 * argamassaq;
        cimentotq = m2 * cimentoq;
        concretotq = m2 * concretoq;
        tijolotq = m2 * tijoloq;
        tintatq = m2 * tintaq;

        resumoQuantidade = "QUANTIDADE:\n"
                + "voce vai precisar de " + areiatq + "kg de areia,\n"
                + cimentotq + " kg de cimento,\n"
                + concretotq + " blocos de concreto,\n"
                + tijolotq + " pecas de tijolo,\n"
                + tintatq + " latas de tinta.";

        System.out.println(resumoQuantidade);

    }

}
