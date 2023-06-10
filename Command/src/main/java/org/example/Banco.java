package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public void executarPedidoEmprestimo(Emprestimo emprestimos) {
        this.emprestimos.add(emprestimos);
        emprestimos.executar();
    }

    public void cancelarUltimoPedidoEmprestimo() {
        if (emprestimos.size() != 0) {
            Emprestimo emprestimos = this.emprestimos.get(this.emprestimos.size() - 1);
            emprestimos.cancelar();
            this.emprestimos.remove(this.emprestimos.size() - 1);
        }
    }

}
