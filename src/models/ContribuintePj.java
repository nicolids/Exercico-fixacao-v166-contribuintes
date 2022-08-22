package models;

public class ContribuintePj extends Contribuinte {
    private Integer numEmpregados;

    public ContribuintePj(String nome, Double rendimentoAnual, Integer numEmpregados) {
        super(nome, rendimentoAnual);
        this.numEmpregados = numEmpregados;
    }

    public Integer getNumEmpregados() {
        return numEmpregados;
    }

    public void setNumEmpregados(Integer numEmpregados) {
        this.numEmpregados = numEmpregados;
    }

    @Override
    public Double taxasApagar() {
        Double taxaBasica;
        if (getNumEmpregados() > 10) {
            taxaBasica = getRendimentoAnual() * 0.14;
        } else{
            taxaBasica = getRendimentoAnual() * 0.16;}

        return taxaBasica;

    }
}
