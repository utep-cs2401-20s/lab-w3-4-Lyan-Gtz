class GameOfLife {
  int size;
  int[][] board;
  int[][] previous;

  GameOfLife(){}

  GameOfLife(int size){
    this.size = size;
    this.board = new int[size][size];
    this.previous = new int[size][size];
  }

  GameOfLife(int[][] board){
    this.size = board.length;
    this.board = new int[this.size][this.size];
    this.previous = new int[this.size][this.size];
    for(int i = 0; i < this.size; i++){
      for(int j = 0; j < this.size; j++){
        this.board[i][j] = board[i][j];
        this.previous[i][j] = board[i][j];
      }
    }
  }

  int[][] getBoard(){
    return this.board;
  }
     
  void oneStep() {
    for(int i = 0; i < this.size; i++){
      for(int j = 0; j < this.size; j++){
        this.previous[i][j] = this.board[i][j];
      }
    }
       
        for(int i=0; i<this.size;i++){
            for(int j = 0; j<this.size;j++){
                int neighbors = this.neighbors(i, j);
                if(this.previous[i][j] == 1){
                  if(neighbors < 2 || neighbors > 3){
                    this.board[i][j] = 0;
                  }
                }
                else{
                  if(neighbors == 3){
                    this.board[i][j] = 1;
                  }
                }
            }
        }
  }

  int neighbors(int r, int c){
    int neighbors = 0;
    for(int row = r-1; row <= r + 1; row++){
      for(int col = c-1; col <= c + 1; col++){
        if(row < 0 || col < 0 || row >= this.size || col >= this.size || (row == r && col == c)){
          continue;
        }
        if(this.previous[row][col] == 1){
          neighbors += 1;
        }
      }
    }
    return neighbors;
  }

  void evolution(int n){
    for(int i = 0; i < n; i++){
      oneStep();
    }
  }
}