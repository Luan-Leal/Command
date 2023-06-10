package org.example;

public class AberturaPeriodoEmprestimo implements Emprestimo {

    private PeriodoEmprestimo periodoEmprestimo;

    public AberturaPeriodoEmprestimo(PeriodoEmprestimo mes) {
        this.periodoEmprestimo = mes;
    }

    public void executar() {
        this.periodoEmprestimo.abrirPeriodoEmprestimo();
    }

    public void cancelar() {
        this.periodoEmprestimo.fecharPeriodoEmprestimo();
    }
}
