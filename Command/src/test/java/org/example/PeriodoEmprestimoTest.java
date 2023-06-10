package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeriodoEmprestimoTest {

    Banco banco;
    PeriodoEmprestimo periodoEmprestimo;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        periodoEmprestimo = new PeriodoEmprestimo (1, 7);
    }

    @Test
    void deveAbrirPeriodoEmprestimo() {
        Emprestimo aberturaPeriodoEmprestimo = new AberturaPeriodoEmprestimo(periodoEmprestimo);
        banco.executarPedidoEmprestimo(aberturaPeriodoEmprestimo);

        assertEquals("Periodo de Emprestimo aberto", periodoEmprestimo.getSituacao());
    }

    @Test
    void deveFecharPeriodoEmprestimo() {
        Emprestimo fechamentoPeriodoEmprestimo = new FechamentoPeriodoEmprestimo(periodoEmprestimo);
        banco.executarPedidoEmprestimo(fechamentoPeriodoEmprestimo);

        assertEquals("Periodo de Emprestimo fechado", periodoEmprestimo.getSituacao());
    }

    @Test
    void deveCancelarFechamentoPeriodoEmprestimo() {
        Emprestimo aberturaPeriodoEmprestimo = new AberturaPeriodoEmprestimo(periodoEmprestimo);
        Emprestimo fechamentoPeriodoEmprestimo = new FechamentoPeriodoEmprestimo(periodoEmprestimo);

        banco.executarPedidoEmprestimo(aberturaPeriodoEmprestimo);
        banco.executarPedidoEmprestimo(fechamentoPeriodoEmprestimo);

        banco.cancelarUltimoPedidoEmprestimo();

        assertEquals("Periodo de Emprestimo aberto", periodoEmprestimo.getSituacao());
    }

}