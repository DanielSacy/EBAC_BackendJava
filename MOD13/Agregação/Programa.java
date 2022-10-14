package Agregação;

public class Programa {
    
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d,  "TV");
        Produto produtoCel = criarProduto(12L, 1000d,  "Celular");
        
        Vendedor vendedor = criarVendedor("Daniel", 10d);

        Comprador comprador = criarComprador("José", 1500d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoCel);
        venda.add(produtoTV);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
    }


    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }


    private static Vendedor criarVendedor(String nome, double comissão) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissão(comissão);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double preço, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreço(preço);
        produto.setNome(nome);
        return produto;
    }
}
