package array;

public class ArrayDi2 {
    public static void main(String[] args) {
    // 2x3 2차원 배열을 만든다.
        int [][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}


        }; //행2, 열3
        arr[0][0] =1;//0행, 0열
        arr[0][1] =2;//0행, 1열
        arr[0][2] =3;//0행, 2열
        arr[1][0] =4;//1행, 0열
        arr[1][1] =5;//1행, 1열
        arr[1][2] =6;//1행, 2열


        //0행 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인을 변경한다.
        }
    }

}