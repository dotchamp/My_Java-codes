public class LinearSearchString {
    public static int linear_search(String menu[], String key){
        for(int i = 0; i < menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"ganesh", "mahesh", "suresh"};
        String key = "suresh";
        int index =  linear_search(menu, key);
        if(index == -1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index : "+ index);
        }
    }
}
