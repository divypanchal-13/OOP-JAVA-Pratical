
public class  Pratical_2_2 {
    public static void main(String[] args) {
        Integer[][] matrix = {
            {1, 2, 3},
            {4, 10, 6},
            {7, 8, 9}
        };

        MinElement<Integer> minElement = findMinElement(matrix);

        System.out.println("Minimum element: " + minElement.getElement());
        System.out.println("Index (row, column): " + minElement.getRowIndex() + ", " + minElement.getColumnIndex());
    }

    public static <T extends Comparable<T>> MinElement<T> findMinElement(T[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix is empty");
        }

        T min = matrix[0][0];
        int minRowIndex = 0;
        int minColumnIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].compareTo(min) < 0) {
                    min = matrix[i][j];
                    minRowIndex = i;
                    minColumnIndex = j;
                }
            }
        }

        return new MinElement<>(min, minRowIndex, minColumnIndex);
    }

    public static class MinElement<T> {
        private T element;
        private int rowIndex;
        private int columnIndex;

        public MinElement(T element, int rowIndex, int columnIndex) {
            this.element = element;
            this.rowIndex = rowIndex;
            this.columnIndex = columnIndex;
        }

        public T getElement() {
            return element;
        }

        public int getRowIndex() {
            return rowIndex;
        }

        public int getColumnIndex() {
            return columnIndex;
        }
    }
}
