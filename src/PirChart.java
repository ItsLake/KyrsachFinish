import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.util.Rotation;

public   class  PirChart extends ApplicationFrame {
    public PirChart(final String title) {

        super(title);

        final PieDataset dataset = createSampleDataset();

        final JFreeChart chart = createChart(dataset);

        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 280));
        setContentPane(chartPanel);
    }


    public  PieDataset createSampleDataset() {
        Interface inter = new Interface();

        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("Процесор", new Double(54));
        result.setValue("Материнська плата", new Double(1));
        result.setValue("Оперативна пам’ять", new Double(1984));
        result.setValue("Жорсткий диск", new Double(1341));
        result.setValue("Корпус ", new Double(1339));
        result.setValue("Блок живлення", new Double(1449));
        result.setValue("Відео карта", new Double(7983));
        result.setValue("Система охолодження", new Double(589));
        result.setValue("Звукова карта",new Double(1438));
        return result;
    }

    public  JFreeChart createChart(final PieDataset dataset) {

        final JFreeChart chart = ChartFactory.createPieChart3D(
                "Вартість комплектуючих у складі комп’ютера",
                dataset,
                true,
                true,
                false
        );

        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
        plot.setNoDataMessage("No data to display");

        return chart;
    }

    public static void main(final String[] args) {
        Title title = new Title();

    }
}

