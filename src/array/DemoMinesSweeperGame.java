package array;

import java.util.Random;

public class DemoMinesSweeperGame {
    private int row;// số hàng
    private int col;// số cột
    private int boomNumber;// số boom
    private int[][] map; // mảng lưu bản đồ boom

    public DemoMinesSweeperGame(int row, int col, int boomNumber) {
        this.row = row;
        this.col = col;
        this.boomNumber = boomNumber;
        this.map = new int[row][col]; // khởi tạo mảng mặc định chứa 0
        createRandomMap(); // đặt boom ngẫu nhiên

    }

    // đặt số boom
    private void createRandomMap() {
        while (boomNumber > 0) {
            setUpRandomMap();
            boomNumber--;

        }
    }

    // Lấy 1 vị trí ngẫu nhiên (xRandom, yRandom)
    // Nếu ô đã có bom (== -1) thì gọi lại chính nó (đệ quy) để chọn vị trí khác
    // Nếu chưa có bom thì đặt map[x][y] = -1
    private void setUpRandomMap() {
        int xRandom = new Random().nextInt(row);
        int yRandom = new Random().nextInt(col);
        if (map[xRandom][yRandom] == -1) {
            setUpRandomMap(); //gọi đệ quy đặt lại boom
        } else {
            map[xRandom][yRandom] = -1; 
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                result += map[i][j] + "\t";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        DemoMinesSweeperGame game = new DemoMinesSweeperGame(5, 5, 9);
        System.out.println(game.toString());
    }

}
