package pkgfinal.project.oop;

abstract class obj {
    public String name;
    public int calories;
    public Float carbs, fat, protein, fibre;

    obj(String name, int calories, Float carbs, Float fat, Float protein, Float fibre) {
        this.name = name;
        this.calories =  calories;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
        this.fibre = fibre;
    }
 }