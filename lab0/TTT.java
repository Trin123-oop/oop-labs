package lab0;

public class TTT {
    public static void main(String[] args){
        String[][] nameGrid = {
            {"Ann", "Bob", "Charlie"},
            {"David", "Eve", "Frank"},
            {"Grace", "Hannah", "Ian"}
        };
        int sum=0;
        int count=0;
        for (int i = 0; i < nameGrid.length; i++) {
            for(int j = 0; j < nameGrid[i].length; j++){
                String currentname = nameGrid[i][j];
                char firstLetter = currentname.charAt(0);
                int namelength = currentname.length();
                sum += namelength;
                count++;
                System.out.println("ชื่อ: " + currentname + " | ตัวอักษรตัวแรก: " + firstLetter + " | ความยาว: " + namelength + " ตัวอักษร");
            }
        }
        
    }

}
