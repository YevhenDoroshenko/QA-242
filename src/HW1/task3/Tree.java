package HW1.task3;

public class Tree {
    String type, colour;
    int height, coutOfsticks;

    //конструктор1 (приним. в пар-ры String type; int height
    //и присв. знач. полям coutOfsticks значение 13, colour "Зеленый".)
   Tree(String type, int height){
        this.type=type;
        this.height=height;
        this.coutOfsticks=13;
        this.colour="зеленый";
       System.out.println("Я Конструктор1. Присвоенные значения в конструкторе: colour= "+colour+", coutOfsticks= "+coutOfsticks+". Введенные значения type= "+this.type+", height= "+this.height);
    }

    //конструктор2 (принимающий в параметры int height, int coutOfsticks,String colour
    //и присв. знач. полю type "пихта".)
    Tree(int height, int coutOfsticks, String colour){
        this.height=height;
        this.coutOfsticks=coutOfsticks;
        this.colour=colour;
        this.type="пихта";
        System.out.println("Я Конструктор2. Присвоенные значения в конструкторе: type= "+type+". Введенные значения height= "+this.height+", coutOfsticks= "+this.coutOfsticks+", colour= "+this.colour);
    }

    //конструктор3 (по умолчанию, который присваивает height = 350, coutOfsticks = 29,
    //сolour = "Желтый".)
    Tree(){
        this.height=350;
        this.coutOfsticks=29;
        this.colour="желтый";
        System.out.println("Я Конструктор3. Присвоенные значения в конструкторе: height= "+height+", coutOfsticks= "+coutOfsticks+", colour= "+colour);
    }

    //конструктор4 (приним. в пар-ры String type,и вызывает внутри себя конструктор 3.)
    Tree(String type){
       this();//вызов конструктора по умолчанию, т.е. Конструктор3. И должен идти вначале
       this.type=type;
        System.out.println("Я Конструктор4. Вызываю в себе Конструктор3. Введенные значения type= "+this.type);

    }
}
