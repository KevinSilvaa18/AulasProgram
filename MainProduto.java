public class MainProduto {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Relógio invicta Gladiator");
        System.out.println(produto.getNome());

        produto.setDescricao("Relógio invicta Reserve Gladiador 37128 Original");
        System.out.println(produto.getDescricao());

        produto.setValor(3799);
        System.out.println(produto.getValor());

        produto.setValorPromoção(2500);
        System.out.println(produto.getValorPromoção());

        produto.setDataVencimento();
        System.out.println(produto.getDataVencimento());

        produto.setCodigDeBarra(584248471);
        System.out.println(produto.getCodigDeBarra());

    }

}
