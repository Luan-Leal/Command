package org.example;

public class PeriodoEmprestimo {

    private int dia;
    private int mes;
    private String situacao;

    public PeriodoEmprestimo(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirPeriodoEmprestimo() {
        this.situacao = "Periodo de Emprestimo aberto";
    }

    public void fecharPeriodoEmprestimo() {
        this.situacao = "Periodo de Emprestimo fechado";
    }
}
