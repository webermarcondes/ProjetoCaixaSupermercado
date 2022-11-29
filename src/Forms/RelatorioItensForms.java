package Forms;
import Entidades.ItemVenda;
import Entidades.Main;
import Exceptions.SaidaException;
import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Vector;

public class RelatorioItensForms extends JPanel{

        private static final long serialVersionUID = 1L;

        public static final String[] nomeColunas =
                {"Nome", "Valor", "Quantidade", ""};

        protected JTable table;
        protected JScrollPane scroller;
        protected TableItemVenda tabela;

        public RelatorioItensForms(Vector<ItemVenda> vetorDados) {
            iniciarComponentes(vetorDados);
        }

        public void iniciarComponentes(Vector<ItemVenda> vetorDados) {
            tabela = new TableItemVenda(nomeColunas, vetorDados);
            table = new JTable();
            table.setModel(tabela);
            table.setSurrendersFocusOnKeystroke(true);
            scroller = new javax.swing.JScrollPane(table);
            table.setPreferredScrollableViewportSize(new java.awt.Dimension(500, 300));

            TableColumn colunaEscondida = table.getColumnModel().getColumn(TableItemVenda.INDEX_ESCONDIDO);
            colunaEscondida.setMinWidth(2);
            colunaEscondida.setPreferredWidth(2);
            colunaEscondida.setMaxWidth(2);
            setLayout(new BorderLayout());
            add(scroller, BorderLayout.CENTER);
        }

        public static void emitirRelatorio(List<ItemVenda> itens) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                JFrame frame = new JFrame("Relatorio");

                frame.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent evt) {
                        frame.setVisible(false);
                        try {
                            Main.menuDeRelatorios();
                        } catch (SaidaException e) {
                            throw new RuntimeException(e);
                        }
                        ;
                    }
                });
                Vector<ItemVenda> vetorDados = new Vector<ItemVenda>();
                for (ItemVenda produto : itens) {
                    vetorDados.add(produto);
                }

                frame.getContentPane().add(new RelatorioItensForms(vetorDados));
                frame.pack();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
