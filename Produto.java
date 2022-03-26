public class Produto
{
    private int codigo;
    private String descricao;
    private double preco;

    public Produto(int codigo,String descricao,double preco)
    {
      this.codigo = codigo;
      this.descricao = descricao;
      this.preco = preco;
    }



    public void setCodigo(int codigo)
    {
     this.codigo = codigo;
    }

    public int getCodigo()
    {
      return codigo;
    }

    public void setDescricao(String descricao)
    {
      this.descricao = descricao;
    }

    public String getDescricao()
    {
      return descricao;
    }

    public void setPreco(double preco)
    {
      this.preco = preco;
    }

    public double getPreco()
    {
      return preco;
    }
}