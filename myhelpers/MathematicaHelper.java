package myhelpers;

public class MathematicaHelper {
    
    public static double[][] convertTo2DArray(double[] flatArray, int rows, int cols) {
        double[][] result = new double[rows][cols];
        int index = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = flatArray[index++];
            }
        }
        
        return result;
    }
    public static double[][] convertStringTo2DArray(String arrayString) {
        String[] rowStrings = arrayString.split(";");
        int rows = rowStrings.length;
        int cols = rowStrings[0].split(",").length;
    
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] colStrings = rowStrings[i].split(",");
            for (int j = 0; j < cols; j++) {
                result[i][j] = Double.parseDouble(colStrings[j].trim());
            }
        }
        
        return result;
    }
    
}
