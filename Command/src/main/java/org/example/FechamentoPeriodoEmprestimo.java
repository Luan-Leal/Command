package org.example;

public class FechamentoPeriodoEmprestimo implements Emprestimo {

    private PeriodoEmprestimo periodoEmprestimo;

    public FechamentoPeriodoEmprestimo(PeriodoEmprestimo mes) {this.periodoEmprestimo = mes;}

    public void executar() {this.periodoEmprestimo.fecharPeriodoEmprestimo();}

    public void cancelar() {this.periodoEmprestimo.abrirPeriodoEmprestimo();}
}
