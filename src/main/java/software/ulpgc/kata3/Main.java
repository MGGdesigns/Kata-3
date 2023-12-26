package software.ulpgc.kata3;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.histogramDisplay().show(histogram());
        mainFrame.setVisible(true);
    }

    private static Histogram histogram() {
        Histogram histogram = new Histogram() {
            @Override
            public int bins() {
                return 6;
            }

            @Override
            public double[] values() {
                return new double[]{24, 12, 45, 5, 36, 12, 8, 90, 4, 23, 14, 78};
            }
        };
        return histogram;
    }
}
