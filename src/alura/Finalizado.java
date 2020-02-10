package alura;

class Finalizado implements EstadoDeUmOrcamento {
      public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
      }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado nao pode ser aprovados");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado nao pode ser reprovados");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Orçamento finalizado nao pode ser finalizado");
    }
}