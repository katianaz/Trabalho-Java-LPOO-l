package TrabalhoFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author nicol
 */
public class ModeloTabelaVeiculo extends AbstractTableModel {

    private String[] colunas= new String[]{"Marca", "Estado", "Categoria", "Locacao", "Valor de Compra", "Placa", "Ano"};
    private List<Veiculo> lista = new ArrayList();



    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int index) {
        return this.colunas[index];
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
        //if(column==0)
        //    return false;
        //return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Veiculo veiculo = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return veiculo.getMarca();//if column 1 (name)
            case 1: return veiculo.getEstado();//if column 2
            case 2: return veiculo.getCategoria();
            case 3: return veiculo.getLocacao() ;
            case 4: return veiculo.getValorDeCompra();
            case 5: return veiculo.getPlaca() ;
            case 6: return veiculo.getAno() ;
            default : return null;
        }
    }

    public void adicionaVeiculo(Veiculo veiculo) {
        this.lista.add(veiculo);
        this.fireTableRowsInserted(lista.size()-1,lista.size()-1);//update JTable
        System.out.println(this.lista.size());
    }

    public boolean removeVeiculo(Veiculo veiculo) {
        int linha = this.lista.indexOf(veiculo);
        boolean result = this.lista.remove(veiculo);
        this.fireTableRowsDeleted(linha,linha);//update JTable
        return result;
    }

    public void atualizarTabela(List<Veiculo> lista){
        this.lista = new ArrayList();
        this.lista.addAll(lista);
        this.fireTableDataChanged();
    }

    public void limpaTabela() {
        int indice = lista.size()-1;
        if(indice<0)
            indice=0;
        this.lista = new ArrayList();
        this.fireTableRowsDeleted(0,indice);//update JTable
    }

    public Veiculo getVeiculo(int linha){
        return lista.get(linha);
    }


}


//verificar sobre manter cliente - editar