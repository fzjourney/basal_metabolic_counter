package pkgfinal.project.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
//        hitungBMR.display();public static ArrayList<User> users = new ArrayList();
        users.add(new User("Sebastian", "babastian", "bastion@gmail.com"));  
        users.add(new User("William", "wills", "will27@gmail.com"));  
        users.add(new User("Sinan", "Kucing12", "sinanaas@gmail.com"));  
        users.add(new User("Feiza", "nasduk", "peijarpan@gmail.com"));  
        users.add(new User("Ilyas", "bencilakers", "ilyasa@gmail.com"));  
        users.add(new User("asd", "asd", "asd"));
        welcomePage.display();
    }
    
    public static ArrayList<User> users = new ArrayList();
    public static ArrayList<snack> all2 = new ArrayList<snack>();
    public static ArrayList<meal> all1 = new ArrayList<meal>();  
    
    public static meal[] mealsList() {
        meal[] item1 = new meal[16];
        item1[0] = new meal("Romano Chicken", 341, 6.8f, 13.7f, 45.1f, 0.7f);
        item1[1] = new meal("Homemade Chili", 295, 15.6f, 2.3f, 5.8f, 5.0f);
        item1[2] = new meal("Turkey Sandwich", 278, 33.6f, 7.7f, 18.8f, 4.1f);
        item1[3] = new meal("Spicy Tofu", 214, 13.7f, 13.4f, 9.6f, 1.3f);
        item1[4] = new meal("Zucchini Scramble", 150, 11.6f, 8.8f, 7.3f, 3.1f);
        item1[5] = new meal("Aglio E Olio", 637, 76.6f, 28.7f, 14.4f, 4f);
        item1[6] = new meal("Breaded Salmon", 255, 5.6f, 11.9f, 29.3f, 0.5f);
        item1[7] = new meal("Tomato Zucchini", 176, 23.4f, 7.9f, 5.4f, 5.9f);
        item1[8] = new meal("Spinach Bisque", 173, 11.1f, 11.6f, 6.6f, 1.3f);
        item1[9] = new meal("Ripped Chili", 139, 22.2f, 1.4f, 11.3f, 3.3f);
        item1[10] = new meal("Chicken Curry", 622, 15.1f, 46.5f, 34.3f, 1.4f);
        item1[11] = new meal("Cola Chicken", 353, 54.7f, 3.4f, 27.9f, 0.3f);
        item1[12] = new meal("Apple Chicken", 198, 38.8f, 1.6f, 7.3f, 2.5f);
        item1[13] = new meal("Chicken Rollatini", 523, 4.4f, 25.6f, 61.9f, 0.9f);
        item1[14] = new meal("Chop Suey", 337, 131.1f, 17.6f, 30.3f, 4.5f);
        item1[15] = new meal("Chicken Schnitzel", 352, 67.1f, 22.6f, 47.8f, 5.2f);
        
        return item1;
    }
    
    public static snack[] snacksList() {
        snack[] item2 = new snack[19];
        item2[0] = new snack("Garlic Knots", 56, 4.9f, 3.5f, 1.3f, 0.2f);
        item2[1] = new snack("Quinoa Salad", 234, 33.6f, 7.5f, 9.5f, 5.5f);
        item2[2] = new snack("Potato Fritters", 98, 15.2f, 3.3f, 2.4f, 1.9f);
        item2[3] = new snack("Spring Rolls", 1247, 50.5f, 114.0f, 9.0f, 3.0f);
        item2[4] = new snack("Scotch Egg", 2223, 79.9f, 142.5f, 146.8f, 7.3f);
        item2[5] = new snack("Kiwi Sorbet", 376, 93.8f, 1.6f, 3.4f, 9.0f);
        item2[6] = new snack("Vegan Cookies", 140, 25.3f, 3.8f, 3.4f, 3.3f);
        item2[7] = new snack("Palmiers", 54, 10.1f, 1.5f, 0.3f, 0.1f);
        item2[8] = new snack("Tiramisu", 162, 21.4f, 6.2f, 5.1f, 0.9f);
        item2[9] = new snack("Pumpkin Cheesecake", 281, 18.2f, 22.5f, 2.9f, 1.3f);
        item2[10] = new snack("Coconut Balls", 131, 18.3f, 5.7f, 2.7f, 0.8f);
        item2[11] = new snack("Morning Juice", 312, 74.7f, 2.3f, 10.9f, 18.8f);
        item2[12] = new snack("Peach Smoothie", 433, 67.0f, 4.4f, 34.8f, 5.6f);
        item2[13] = new snack("Spinach Bisque", 173, 11.1f, 11.6f, 6.6f, 1.3f);
        item2[14] = new snack("Watermelon Salad", 192, 24.4f, 8.5f, 6.1f, 1.0f);
        item2[15] = new snack("Carrot Orzo", 249, 37.2f, 6.9f, 8.2f, 2.6f);
        item2[16] = new snack("Banana Smoothie", 352, 61.9f, 7.7f, 13.4f, 4.8f);
        item2[17] = new snack("Roast Mushrooms", 94, 3.2f, 8.9f, 1.9f, 0.7f);
        item2[18] = new snack("Quinoa Salad", 234, 33.6f, 7.5f, 9.5f, 5.5f);
        
        return item2;
    }
    
    
    public static void knapsack(Float calNeed){
        Random rand = new Random();
        meal[] item1 = mealsList();  
        snack[] item2 = snacksList();
        int total = 0;
        int sz1 = 0;
        while(total <= calNeed && sz1 < 6){
            int idx = rand.nextInt(16);
            if(item1[idx].calories + total <= calNeed) {
                all1.add(item1[idx]);
                total += item1[idx].calories;
                sz1++;
            }
        }
        
        for(int j=0;j<18;j++) {
            if(item2[j].calories + total <= calNeed) {
                all2.add(item2[j]);
                total += item2[j].calories;
            }
        }
    }
    
    
    public static float calculateBMR(Float umur, Float tinggi, Float berat, int sex) {
        float BMR = 0;
        switch(sex) {
            case 0: {
                BMR = (float) (10 * berat + 6.25 * tinggi - 5 * umur + 5);
                break;
            }
            case 1: {
                BMR = (float) (10 * berat + 6.25 * tinggi - 5 * umur - 161);
                break;
            }
        }
        return BMR;
    }
    
    public static Float calculateCalory(Float BMR, int weightPlan, int exerciseRate){
        Float exerciseRateFactor = 0f, caloryNeed = 0f;
        int weightPlanFactor;
        
        switch(exerciseRate) {      
            case 1: 
                exerciseRateFactor = 1.2f;
                break;
            case 2: 
                exerciseRateFactor = 1.37f;
                break;
            case 3: 
                exerciseRateFactor = 1.55f;
                break;
            case 4: 
                exerciseRateFactor = 1.725f;
                break;
            case 5: 
                exerciseRateFactor = 1.9f;
                break;
            default : 
                exerciseRateFactor = 0f;
        }
        
        switch(weightPlan) {      
            case 1: 
                weightPlanFactor = -1000;
                break;
            case 2: 
                weightPlanFactor = -500;
                break;
            case 3: 
                weightPlanFactor = -250;
                break;
            case 4: 
                weightPlanFactor = 0;
                break;
            case 5: 
                weightPlanFactor = 250;
                break;
            case 6: 
                weightPlanFactor = 500;
                break;
            case 7: 
                weightPlanFactor = 1000;
                break;
            default : 
                weightPlanFactor = 666;
        }
        caloryNeed = ((float) BMR * (float) exerciseRateFactor) + weightPlanFactor;
        return (float) caloryNeed;
    }
    
    public static boolean validateUser(ArrayList<User> user, String email, String password) {
        for(int i = 0;i<user.size();i++) {
            if(email.equals(user.get(i).email) && password.equals(user.get(i).password)) {
                return true;
            }
        }
        return false;
    }
    
//    public static User[] addUser(User[] user, String name, String password, String email) {
//        int count = 0;
//        for(int i = 0;i<user.length;i++) {
//            if(user[i] != null) {
//                count++;
//            }
//        }
//        user[count] = new User(name, password, email);
//        return user;
//    }
}
