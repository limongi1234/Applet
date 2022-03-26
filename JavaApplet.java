import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaApplet extends JApplet implements ActionListener
{
       private JLabel lblCodigo;
       private JLabel lblNome;
       private JLabel lblPreco;
       private JLabel lblDescricao;
       private JButton botao_1;
       private JButton botao_2;
       private JButton botao_3;
       private JButton botao_4;
       private JButton botao_5;
       private JButton botao_6;
       private JButton botao_7;
       private JButton botao_8;
       private JTextField txtDescricao;
       private JTextField txtCodigo;
       private JTextField txtNome;
       private JTextField txtPreco;
       private JTextArea txtResultado;
       Produto[] itens = new Produto[200];
       public int cont = 0;
       public int i = 0;

       public void init()
       {
           Container ct = this.getContentPane();
           ct.setLayout(new FlowLayout());
           lblCodigo = new JLabel("Digite o Código: ");
           ct.add(lblCodigo);
           txtCodigo = new JTextField(4);
           ct.add(txtCodigo);
           lblNome = new JLabel("Digite a Descrição: ");
           ct.add(lblNome);
           txtNome = new JTextField(10);
           ct.add(txtNome);
           lblPreco = new JLabel("Digite o Preço: ");
           ct.add(lblPreco);
           txtPreco = new JTextField(10);
           ct.add(txtPreco);
           botao_1 = new JButton("Cadastrar");
           ct.add(botao_1);
           botao_1.addActionListener(this);
           botao_2 = new JButton("Listar");
           ct.add(botao_2);
           botao_2.addActionListener(this);
           botao_3 = new JButton("Pesquisar");
           ct.add(botao_3);
           botao_3.addActionListener(this);
           botao_4 = new JButton("Alterar");
           ct.add(botao_4);
           botao_4.addActionListener(this);
           botao_5 = new JButton("Excluir");
           ct.add(botao_5);
           botao_5.addActionListener(this);
           botao_6 = new JButton("Limpar Carrinho");
           ct.add(botao_6);
           botao_6.addActionListener(this);
           botao_7 = new JButton("Vender");
           ct.add(botao_7);
           botao_7.addActionListener(this);
           botao_8 = new JButton("Listar Carrinho");
           ct.add(botao_8);
           botao_8.addActionListener(this);
           txtResultado = new JTextArea(15,32);
           ct.add(txtResultado);

           JScrollPane scroller = new JScrollPane(txtResultado);
           ct.add(scroller, BorderLayout.CENTER);
        }


        public void actionPerformed(ActionEvent e)
        {

           if (e.getSource()==botao_1)
           {
              itens[cont] = new Produto(Integer.parseInt(txtCodigo.getText()), txtNome.getText(),Double.parseDouble(txtPreco.getText()));
              cont++;
              txtCodigo.setText("");
              txtNome.setText("");
              txtPreco.setText("");
           }
           if (e.getSource()==botao_2)
           {
             txtResultado.setText("");
             for(int i=0; i<cont; i++)
                txtResultado.append(itens[i].getCodigo() + "   " + itens[i].getDescricao()+ "  "+ itens[i].getPreco() +"\n");
             if (e.getSource()==botao_3)
              
              for(int i=0; i<cont; i++)
                 if (Integer.parseInt(txtCodigo.getText()) == itens[i].getCodigo())
                    txtNome.setText(itens[i].getDescricao());
                  
              if(e.getSource()==botao_4)
            
                 for(int i = 0; i < cont;i++)
              
                     if (Integer.parseInt(txtCodigo.getText()) == itens[i].getCodigo())
                     {
                       itens[i].setDescricao(txtDescricao.getText());
                       itens[i].setPreco(Double.parseDouble(txtPreco.getText()));
                     }
           
                 if(e.getSource()==botao_5)
            
                  for(int j = 0; j <cont - 1; j++)
           
                   if (Integer.parseInt(txtCodigo.getText()) == itens[i].getCodigo())
                
                      itens[j] = itens[j+1];
                
                   cont --;
              
            }
           /* if(e.getSource()==botao_6)
            {
            }
            if(e.getSource()==botao_7)
            {
            }
            if(e.getSource()==botao_8)
            */
        }

}