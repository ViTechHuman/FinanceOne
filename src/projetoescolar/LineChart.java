package projetoescolar;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import projetoescolar.Geral.ProjecaoFinanceira;
import projetoescolar.Personalizado;
import static projetoescolar.Personalizado.projecaoCompleta;





public class LineChart extends JFrame {
 ArrayList<ProjecaoFinanceira> projecao = new ArrayList<>();


      
    
    // Método principal para rodar a aplicação
    public static void main(String[] args) {
        
        LineChart chart = new LineChart();

        
        
    }

    
    
    
    // Método para criar e exibir o gráfico
    public void teste() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        //EXEMPLO: (VALOR $$, STRING COM O NOME (APORTE MENSA, PATRIMONIO TOTAL ETC, STRING COM O MÊS))
        
        for (ProjecaoFinanceira projeta : projecaoCompleta) {
        dataset.addValue(projeta.getValorTotal(), projeta.getAporte(), projeta.getData());
}
      
        double valour = Personalizado.projecaoCompleta.get(0).getValorTotal();
        String aporti = Personalizado.projecaoCompleta.get(0).getAporte();
        String projection =  Personalizado.projecaoCompleta.get(0).getData();
        dataset.addValue(valour, aporti, projection );
     
        

        JFreeChart chart = ChartFactory.createLineChart(
            "Crescimento patrimonial",
            "Indicadores",
            "Valor",
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false
        );

        CategoryPlot p = chart.getCategoryPlot();
        CategoryItemRenderer renderer = p.getRenderer();
        LineAndShapeRenderer linha = new LineAndShapeRenderer();
        
        renderer.setSeriesPaint(1, Color.YELLOW);
        renderer.setSeriesPaint(0, Color.GREEN);
        linha.setSeriesStroke(0, new BasicStroke(
    3.0f,                      // Espessura da linha
    BasicStroke.CAP_BUTT,      // Fim da linha
    BasicStroke.JOIN_MITER,    // Tipo de junção
    10.0f,                     // Miter limit
    new float[] {10.0f, 5.0f}, // Padrão de traços e espaços (10px de linha, 5px de espaço)
    0.0f                       // Fase inicial do traço
));
        linha.setSeriesStroke(1, new BasicStroke(
    3.0f,                      // Espessura da linha
    BasicStroke.CAP_BUTT,      // Fim da linha
    BasicStroke.JOIN_MITER,    // Tipo de junção
    10.0f,                     // Miter limit
    new float[] {10.0f, 5.0f}, // Padrão de traços e espaços (10px de linha, 5px de espaço)
    0.0f                       // Fase inicial do traço
));
          linha.setSeriesStroke(2, new BasicStroke(
    3.0f,                      // Espessura da linha
    BasicStroke.CAP_BUTT,      // Fim da linha
    BasicStroke.JOIN_MITER,    // Tipo de junção
    10.0f,                     // Miter limit
    new float[] {10.0f, 5.0f}, // Padrão de traços e espaços (10px de linha, 5px de espaço)
    0.0f                       // Fase inicial do traço
));
        p.setForegroundAlpha(0.9f);
        p.setDomainGridlinesVisible(true);
        p.setDomainCrosshairVisible(true);
        p.setRangeGridlinePaint(Color.white);
        p.setDomainGridlinePaint(Color.white);
        p.setBackgroundPaint(Color.darkGray);
        p.setRenderer(linha);
        ChartFrame frame1 = new ChartFrame("teste", chart);
        frame1.setVisible(true);
        frame1.setSize(1700, 950);
         Personalizado.projecaoCompleta.clear();
        
    }
}
