package models;

public class ContribuintePf extends  Contribuinte{
    private Double gastosComSaude;

    public ContribuintePf(String nome, Double rendimentoAnual, Double gastosComSaude) {
        super(nome, rendimentoAnual);
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

//    @Override
//    public Double taxasApagar() {
//        double taxaBasica;
//        if (getRendimentoAnual() < 20000.0) {
//            taxaBasica = getRendimentoAnual() * 0.15- (getGastosComSaude() * 0.5);
//        }
//        else taxaBasica = (getRendimentoAnual() * 0.25) - (getGastosComSaude()* 0.5);
//
////        taxaBasica= taxaBasica - (gastosComSaude * 0.5);
//
//        if(taxaBasica < 0.0){
//            return 0.0;
//        }else
//            return taxaBasica;
//    }

    @Override
    public Double taxasApagar() {
        Double taxaBasica;
        if (getRendimentoAnual() < 20000.0) {
            taxaBasica = getRendimentoAnual() * 0.15
                    - getGastosComSaude() * 0.5;
        } else
            taxaBasica = getRendimentoAnual() * 0.25
                    - getGastosComSaude() * 0.50;
        if(taxaBasica < 0.0){
            return 0.0;
        }else
           return taxaBasica;
    }

}

